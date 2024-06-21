package com.ohgiraffers.common;

public class EmployeeDTO {

    private int id;
    private String name;
    private int no;
    private String email;
    private int phone;
    private String deptCode;
    private String jobCode;
    private String salLevel;
    private int salary;
    private int bouns;
    private int managerId;
    private int hireDate;
    private int entDate;
    private String yn;

    public EmployeeDTO(){

    }

    public EmployeeDTO(int id, String name, int no, String email, int phone, String deptCode, String jobCode, String salLevel, int salary, int bouns, int managerId, int hireDate, int entDate, String yn) {
        this.id = id;
        this.name = name;
        this.no = no;
        this.email = email;
        this.phone = phone;
        this.deptCode = deptCode;
        this.jobCode = jobCode;
        this.salLevel = salLevel;
        this.salary = salary;
        this.bouns = bouns;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.entDate = entDate;
        this.yn = yn;
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

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getSalLevel() {
        return salLevel;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBouns() {
        return bouns;
    }

    public void setBouns(int bouns) {
        this.bouns = bouns;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    public int getEntDate() {
        return entDate;
    }

    public void setEntDate(int entDate) {
        this.entDate = entDate;
    }

    public String getYn() {
        return yn;
    }

    public void setYn(String yn) {
        this.yn = yn;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", no=" + no +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", deptCode='" + deptCode + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salLevel='" + salLevel + '\'' +
                ", salary=" + salary +
                ", bouns=" + bouns +
                ", managerId=" + managerId +
                ", hireDate=" + hireDate +
                ", entDate=" + entDate +
                ", yn='" + yn + '\'' +
                '}';
    }
}
