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
    private String locationId;

    private List<EmployeeDTO> employeeList;

}
