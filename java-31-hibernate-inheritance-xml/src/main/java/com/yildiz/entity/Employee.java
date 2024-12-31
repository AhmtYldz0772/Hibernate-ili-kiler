package com.yildiz.entity;



import java.util.Date;

public class Employee extends Person {
    private Long employeeId;
    private String phone;
    private String email;
    private int salary;
    private Date joinDate;
    private String department;

    public Employee() {
        // super();  yazsanda yazmasanda bir üst sınıfın yapıcısını çağırır

    }

    public Employee(String surname, String name, String address, String phone, String email, int salary, Date joinDate, String department) {
        super(surname, name, address);
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.joinDate = joinDate;
        this.department = department;
    }

    public Employee(String surname, String name, String address) {
        super(surname, name, address);
    }

    public Employee(String surname, String name, String address, String department, Date joinDate, int salary, String email, String phone) {
        super(surname, name, address);
        this.department = department;
        this.joinDate = joinDate;
        this.salary = salary;
        this.email = email;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
