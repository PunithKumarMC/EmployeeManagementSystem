import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emploeeDetails", "root", "Punith@9535");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        main.supportMain(connection);
    }

    public static void supportMain(Connection con){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("press 1. add an employee, 2. search for an employee by name, 3. search employees by email, 4. search by getEmployeeById, 5. getAllEmployees, 6. exit application");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Enter Employee details");
                System.out.println("Enter name");
                String name = scanner.next();
                System.out.println("Enter dob");
                String dob = scanner.next();
                System.out.println("Enter email");
                String email = "";
                if (scanner.hasNext("[A-Za-z0-9]*@[A-za-z]*.com")){
                   email = scanner.next();
                }else {
                    System.out.println("incorrect email");
                    supportMain(con);
                }
                System.out.println("Enter address");
                String address = scanner.next();
                Employee emp = new Employee();
                emp.setEmployeename(name);
                emp .setDob(dob);
                emp.setEmail(email);
                emp.setAddress(address);
                EmployeeDAO.addEmployee(emp,con);
                System.out.println();
                supportMain(con);
                break;
            case 2:
                System.out.println("Enter name of Employee to search");
                String ename = scanner.next();
                EmployeeDAO.getEmployeeByName(ename,con);
                System.out.println();
                supportMain(con);
                break;

            case 3:
                System.out.println("Enter Email of Employee to search");
                String eemail = scanner.next();
                EmployeeDAO.getEmployeeByEmail(eemail,con);
                System.out.println();
                supportMain(con);
                break;
            case 4:
                System.out.println("Enter Employee Id  to search");
                int eid=0;
                if (scanner.hasNext("[0-9]*")){
                   eid = scanner.nextInt();
                }else{
                    System.out.println("enter id in numbers only");
                }
                EmployeeDAO.getEmployeeById(eid,con);
                System.out.println();
                supportMain(con);
                break;
            case 5:
                System.out.println("Getting all Employees");
                EmployeeDAO.getAllEmployees(con);
                System.out.println();
                supportMain(con);
                break;
            case 6:
                System.out.println("exiting from Application");
                System.exit(1);
            default:
                System.out.println("Wrong input !....");
                System.out.println();
                supportMain(con);
        }
    }
}
