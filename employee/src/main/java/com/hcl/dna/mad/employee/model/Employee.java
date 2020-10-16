package com.hcl.dna.mad.employee.model;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private Long id;
    @Column(name="EMP_NUMBER")
    private String EmpNum;
    @Column(name="FIRST_NAME")
    private String firstName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpNum() {
        return EmpNum;
    }

    public void setEmpNum(String empNum) {
        EmpNum = empNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="ADDRESS1")
    private String address1;
}
