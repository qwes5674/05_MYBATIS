package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.DeptAndEmployeeDTO;
import com.ohgiraffers.common.EmployeeAndDeptDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {

    private ElementTestMapper mapper;

    public void selectResultMapAssociationTest() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<EmployeeAndDeptDTO> empList = mapper.selectResultMapAssociationTest();

        for( EmployeeAndDeptDTO emp : empList) {
            System.out.println("사원 이름: " + emp.getName() + ", 부서명 : " + emp.getDepartment().getTitle());
        }

        sqlSession.close();

    }

    public void selectResultMapCollectionTest() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<DeptAndEmployeeDTO> deptList= mapper.selectResultMapCollectionTest();

        for(DeptAndEmployeeDTO dept : deptList){
           System.out.println(dept);
       }

        sqlSession.close();
    }
}
