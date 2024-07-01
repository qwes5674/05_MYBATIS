package com.ohgiraffers.common;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DeptAndEmployeeDTO {

    private String id;
    private String title;
    private List<EmployeeDTO> employeeList;

}
