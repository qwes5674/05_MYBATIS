package com.ohgiraffers.sectio01;

import java.util.List;
import java.util.Map;

public class EmployeeController {

    private final PrintResult printResult;
    private final EmployeeService employeeService;

    public EmployeeController(){
        printResult = new PrintResult();
        employeeService = new EmployeeService();
    }

    public static void selectAllEmployee() {

        List<EmployeeDTO> menuList = EmployeeService.selectAllMenu();

        if(menuList != null) {
            printResult.printMenuList(menuList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public static void selectById(Map<String, String> stringStringMap) {
    }

    public static void selectByname(Map<String, String> stringStringMap) {
    }

    public static void registEmployee(Map<String, String> stringStringMap) {
    }

    public static void modifyEmployee(Map<String, String> stringStringMap) {
    }

    public static void deleteEmployee(Map<String, String> stringStringMap) {
    }
}
