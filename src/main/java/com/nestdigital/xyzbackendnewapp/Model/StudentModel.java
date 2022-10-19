package com.nestdigital.xyzbackendnewapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int roll_no;
    private int admission_no;
    private String college;
    private String department;
    private String bloodGroup;
    private String dob;
    private String parentName;
    private String parentEmail;
    private String guardianName;
    private String guardianAddress;

    public StudentModel(int id, String name, int roll_no, int admission_no, String college, String department, String bloodGroup, String dob, String parentName, String parentEmail, String guardianName, String guardianAddress) {
        this.id = id;
        this.name = name;
        this.roll_no = roll_no;
        this.admission_no = admission_no;
        this.college = college;
        this.department = department;
        this.bloodGroup = bloodGroup;
        this.dob = dob;
        this.parentName = parentName;
        this.parentEmail = parentEmail;
        this.guardianName = guardianName;
        this.guardianAddress = guardianAddress;
    }

    public StudentModel() {
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

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getAdmission_no() {
        return admission_no;
    }

    public void setAdmission_no(int admission_no) {
        this.admission_no = admission_no;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianAddress() {
        return guardianAddress;
    }

    public void setGuardianAddress(String guardianAddress) {
        this.guardianAddress = guardianAddress;
    }
}
