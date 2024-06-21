package com.ohgiraffers.sectio01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();

        do{
            System.out.println("========== 오지라퍼 직원 관리 시스템 ============= ");
            System.out.println("1. 모든 직원 조회 ");
            System.out.println("2. 사원 번호로 조회");
            System.out.println("3. 직원 이름으로 조회 ");
            System.out.println("4. 직원 추가 ");
            System.out.println("5. 직원 수정 ");
            System.out.println("6. 직원 삭제");
            System.out.print(" 직원 관리 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1: EmployeeController.selectAllEmployee(); break;
                case 2: EmployeeController.selectById(inputEmployeeID()); break;
                case 3: EmployeeController.selectByname(inputEmployeeName()); break;
                case 4: EmployeeController.registEmployee(inputEmployee());break;
                case 5: EmployeeController.modifyEmployee(inputModifyEmployee()); break;
                case 6: EmployeeController.deleteEmployee(inputEmployeeID()); break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
                    break;
            }
        }while (true);
    }

    // 직원코드를 입력받는 메서드
    private static Map<String,String> inputEmployeeID(){

        Scanner sc = new Scanner(System.in);
        System.out.print("직원 코드를 입력하세요 : ");
        String ID = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("ID",ID);

        return parameter;
    }

    // 직원이름을 입력받는 메서드
    private static Map<String,String> inputEmployeeName(){

        Scanner sc = new Scanner(System.in);
        System.out.print("직원 이름을 입력하세요 : ");
        String name = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name",name);

        return parameter;
    }

    // 직원 정보를 입력받는 메서드
    private  static Map<String, String > inputEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("사원 번호를 입력하세요 :");
        String id = sc.nextLine();
        System.out.print("직원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("주민등록 번호를 입력하세요 : ");
        String no = sc.nextLine();
        System.out.println("이메일을 입력해주세요 : ");
        String email = sc.nextLine();
        System.out.println("핸드폰 번호를 입력해주세요 : ");
        String phone = sc.nextLine();
        System.out.println("부서 코드를 입력해주세요 : ");
        String deptCode = sc.nextLine();
        System.out.println("직급 코드를 입력해주세요 : ");
        String jobCode = sc.nextLine();
        System.out.println("급여 등급을 입력해주세요 : ");
        String salLevel = sc.nextLine();
        System.out.println("급여를 입력해주세요 : ");
        String salary = sc.nextLine();
        System.out.println("보너스율을 입력해주세요 : ");
        String bonus = sc.nextLine();
        System.out.println("관리자 번호를 입력주세요 : ");
        String managerId = sc.nextLine();
        System.out.println("입사일을 입력해주세요 : ");
        String hireDate = sc.nextLine();
        System.out.println("퇴사일을 입력해주세요 : ");
        String entDate = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("ID",id);
        parameter.put("Name",name);
        parameter.put("No",no);
        parameter.put("Email",email);
        parameter.put("Phone",phone);
        parameter.put("DeptCode", deptCode);
        parameter.put("JobCode",jobCode);
        parameter.put("SalLevel",salLevel);
        parameter.put("Salary",salary);
        parameter.put("Bonus", bonus);
        parameter.put("ManagerId",managerId);
        parameter.put("HireDate", hireDate);
        parameter.put("EntDate",entDate);
        return parameter;

    }

    // 메뉴 정보를 수정하는 메서드
    private static Map<String, String> inputModifyEmployee(){
        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 사원 번호를 입력하세요 :");
        String id = sc.nextLine();
        System.out.print("수정할 메뉴 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("수정할 주민등록번호 입력하세요 : ");
        String no = sc.nextLine();
        System.out.print("수정할 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.println("수정할 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.println("수정할 부서 코드를 입력해주세요 : ");
        String deptCode = sc.nextLine();
        System.out.println("수정할 직급 코드를 입력해주세요 : ");
        String jobCode = sc.nextLine();
        System.out.println("수정할 급여 등급을 입력해주세요 : ");
        String salLevel = sc.nextLine();
        System.out.println("수정할 급여를 입력해주세요 : ");
        String salary = sc.nextLine();
        System.out.println("수정할 보너스율을 입력해주세요 : ");
        String bonus = sc.nextLine();
        System.out.println("수정할 관리자 번호를 입력주세요 : ");
        String managerId = sc.nextLine();
        System.out.println("수정할 입사일을 입력해주세요 : ");
        String hireDate = sc.nextLine();
        System.out.println("수정할 퇴사일을 입력해주세요 : ");
        String entDate = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("ID",id);
        parameter.put("Name",name);
        parameter.put("No",no);
        parameter.put("Email",email);
        parameter.put("Phone",phone);
        parameter.put("DeptCode", deptCode);
        parameter.put("JobCode",jobCode);
        parameter.put("SalLevel",salLevel);
        parameter.put("Salary",salary);
        parameter.put("Bonus", bonus);
        parameter.put("ManagerId",managerId);
        parameter.put("HireDate", hireDate);
        parameter.put("EntDate",entDate);
        return parameter;

    }

}
