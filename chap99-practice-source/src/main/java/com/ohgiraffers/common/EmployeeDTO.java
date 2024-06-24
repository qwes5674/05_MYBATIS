package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class EmployeeDTO {

    private int id;
    private String name;
    private int no;
    private String email;
    private int phone;
    private DepartmentDTO department;
    private String deptcode;
    private String jobcode;
    private int sallevel;
    private int salary;
    private int bonus;
    private int manager;
    private int hiredate;
    private int entdate;
    private String entyn;
}
