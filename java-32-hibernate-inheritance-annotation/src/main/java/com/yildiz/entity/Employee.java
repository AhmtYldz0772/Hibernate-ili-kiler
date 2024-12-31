package com.yildiz.entity;
import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "EMPLOYEE")

//@DiscriminatorValue("EMPLOYEES")
public class Employee extends Person {
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_ID")
    */
    @Transient // bu alanı es geçecek
    private Long employeeId;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "SALARY")
    private int salary;
    @Column(name = "JOIN_DATE")
    private Date joinDate;
    @Column(name = "DAPERTMAN")
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
