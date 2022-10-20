package com.nestdigital.xyzbackendnewapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faculties")
public class FacultyModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String department;
    private String designation;
    private String dob;
    private String eduQuali;
    private String address;
    private String phone;
    private String doj;

    public FacultyModel(int id, String name, String department, String designation, String dob, String eduQuali, String address, String phone, String doj) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.dob = dob;
        this.eduQuali = eduQuali;
        this.address = address;
        this.phone = phone;
        this.doj = doj;
    }

    public FacultyModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEduQuali() {
        return eduQuali;
    }

    public void setEduQuali(String eduQuali) {
        this.eduQuali = eduQuali;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }
}
