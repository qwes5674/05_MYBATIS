package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class EmployeeAndDeptDTO {

    private int id;
    private String name;
    private DepartmentDTO department;
    private String deptcode;

}
