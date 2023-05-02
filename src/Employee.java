public class Employee {
    private int EmployeeId;

    private String Name;

    private String dob;

    private String Email;

    private String Address;

    public Employee() {
    }

    public Employee(int employeeId, String name, String dob, String email, String address) {
        EmployeeId = employeeId;
        Name = name;
        this.dob = dob;
        Email = email;
        Address = address;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + EmployeeId +
                ", Name='" + Name + '\'' +
                ", dob='" + dob + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
