package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.DeptAndEmployeeDTO;
import com.ohgiraffers.common.EmployeeAndDeptDTO;

import java.util.List;

public interface ElementTestMapper {
    List<EmployeeAndDeptDTO> selectResultMapAssociationTest();

    List<DeptAndEmployeeDTO> selectResultMapCollectionTest();
}
