public class Employee {
    private int employeeId;

    private String employeename;

    private String dob;


    private String email;

    private String address;


    public Employee() {
    }

    public Employee(int employeeId, String name, String dob, String email, String address) {
        employeeId = employeeId;
        employeename = name;
        this.dob = dob;
        this.email = email;
        this.address = address;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        employeeId = employeeId;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId=" + employeeId +
                ", Name='" + employeename + '\'' +
                ", dob='" + dob + '\'' +
                ", Email='" + email + '\'' +
                ", Address='" + address + '\'' +
                '}';
    }
}
