import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employees","root","Punith@9535");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        main.supportMain(connection);
    }

    public static void supportMain(Connection con){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("press 1. add an employee, 2. search for an employee by name, 3. search employees by email, 4. search by getEmployeeById, 5. getAllEmployees ");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Enter Employee details");
                System.out.println("Enter name");
                String name = scanner.nextLine();
                System.out.println("Enter dob");
                String dob = scanner.nextLine();
                System.out.println("Enter email");
                String email = scanner.nextLine();
                System.out.println("Enter address");
                String address = scanner.nextLine();
                Employee emp = new Employee();
                emp.setName(name);
                emp .setDob(dob);
                emp.setEmail(email);
                emp.setAddress(address);
                EmployeeDAO.addEmployee(emp);
                break;
            case 2:
                System.out.println("Enter name of Employee to search");
                String ename = scanner.nextLine();
                EmployeeDAO.getEmployeeByName(ename);
                break;

            case 3:
                System.out.println("Enter Email of Employee to search");
                String eemail = scanner.nextLine();
                EmployeeDAO.getEmployeeByEmail(eemail);
                break;
            case 4:
                System.out.println("Enter Employee Id  to search");
                int eid = scanner.nextInt();
                EmployeeDAO.getEmployeeById(eid);
                break;
            case 5:
                System.out.println("Getting all Employees");
                EmployeeDAO.getAllEmployees();
                break;
            default:
                System.out.println("Wrong input !....");
                supportMain(con);
        }
    }
}
