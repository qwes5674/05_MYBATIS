package com.ohgiraffers.sectio01;

import com.ohgiraffers.common.EmployeeDTO;

import java.util.List;
import java.util.Map;

public interface DynamicSqlMapper {


     List<EmployeeDTO> selectEmployeeBySalary(Map<String, Integer> map);

}
