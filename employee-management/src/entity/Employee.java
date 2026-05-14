package entity;

import java.util.Objects;

public class Employee {
    private  int empId;
    private String  empName;
    private  String email;
    private String gender;
    private  String empRole;
    private  String address;

    public Employee(int empId, String empName, String email, String gender, String emprole, String address) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.empRole = emprole;
        this.address = address;

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmprole() {
        return empRole;
    }

    public void setEmprole(String emprole) {
        this.empRole = emprole;
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
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", emprole='" + empRole + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(empName, employee.empName) && Objects.equals(email, employee.email) && Objects.equals(gender, employee.gender) && Objects.equals(empRole, employee.empRole) && Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, email, gender, empRole, address);
    }
}
