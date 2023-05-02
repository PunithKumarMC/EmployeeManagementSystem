import java.sql.*;

public class EmployeeDAO {

   public static void addEmployee(Employee employee, Connection con)  {
      String querry = "insert into employees (employeename,dob,email,address) values (?,?,?,?)";
      try {
         PreparedStatement pstmt = con.prepareStatement(querry);
         pstmt.setString(1,employee.getEmployeename());
         pstmt.setString(2,employee.getDob());
         pstmt.setString(3,employee.getEmail());
         pstmt.setString(4,employee.getAddress());
         int count = pstmt.executeUpdate();
         if (count==0){
            System.out.println("data not added");
         }else {
            System.out.println("data added");
         }
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }

   public static void  getEmployeeByName(String name, Connection con){
      String querry = "select * from employees where employeename=?";
      try {
         PreparedStatement pstmt = con.prepareStatement(querry);
         pstmt.setString(1,name);
         ResultSet rs = pstmt.executeQuery();
         if (rs.next()){
            System.out.println(rs.getString("employeename")+" "+rs.getString("dob")+" "+rs.getString("email")+" "+rs.getString("address"));
         }else{
            System.out.println("enter correct name");
            getEmployeeByName(name, con);
         }
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }
   public static void  getEmployeeByEmail(String email, Connection con){
      String querry = "select * from employees where email=?";
      try {
         PreparedStatement pstmt = con.prepareStatement(querry);
         pstmt.setString(1,email);
         ResultSet rs = pstmt.executeQuery();
         if (rs.next()){
            System.out.println(rs.getString("employeename")+" "+rs.getString("dob")+" "+rs.getString("email")+" "+rs.getString("address"));
         }else{
            System.out.println("enter correct email");
            getEmployeeByEmail(email, con);
         }
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }

   public static void  getEmployeeById(int id, Connection con){
      String querry = "select * from employees where employeeId=?";
      try {
         PreparedStatement pstmt = con.prepareStatement(querry);
         pstmt.setInt(1,id);
         ResultSet rs = pstmt.executeQuery();
         if (rs.next()){
            System.out.println(rs.getString("employeename")+" "+rs.getString("dob")+" "+rs.getString("email")+" "+rs.getString("address"));
         }else{
            System.out.println("enter correct id");
            getEmployeeById(id, con);
         }
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }

   public static void   getAllEmployees(Connection con){
      try {
         Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from employees");
        while (rs.next()){
           System.out.println(rs.getString("employeename")+" "+rs.getString("dob")+" "+rs.getString("email")+" "+rs.getString("address"));
        }
      } catch (SQLException e) {
         throw new RuntimeException(e);
      }
   }

}
