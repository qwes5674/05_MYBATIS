package com.ohgiraffers.sectio01;

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("========== 오지라퍼 직원 관리 시스템 ============= ");
            System.out.println("1. if 확인하기");
            System.out.println("2. choose(when, otherwise) 확인하기");
            System.out.println("3. foreach 확인하기");
            System.out.println("4. trim(where, set) 확인하기");
            System.out.println("9. 종료하기");
            System.out.print("메뉴를 선택하세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1: ifSubMenu(); break;
//                case 2: chooseSubMenu(); break;
//                case 3: foreachSubMenu(); break;
//                case 4: trimSubMenu(); break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }while (true);
    }

    private static void ifSubMenu() {

        Scanner sc = new Scanner(System.in);
        EmployeeService menuService = new EmployeeService();
        do {
            System.out.println("=========== if 서브메뉴 ===========");
            System.out.println("1. 원하는 직급에 적합한 월급 목록 보여주기");
            System.out.println("2. 직원이름 또는 직급으로 검색하여 직원 목록 보여주기");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : menuService.selectEmployeeBySalary(inputSalary()); break;
//                case 2 : menuService.searchMenu(inputSearchCriteria()); break;
                case 9 : return;
            }
        }while (true);
    }

    private static int inputSalary() {

        Scanner sc = new Scanner(System.in);
        System.out.print("검색하실 월급의 최대 금액을 입력해주세요 : ");
        int salary = sc.nextInt();

        return salary;
    }


//    // 직원이름을 입력받는 메서드
//    private static Map<String,String> inputEmployeeName(){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("직원 이름을 입력하세요 : ");
//        String name = sc.nextLine();
//
//        Map<String, String> parameter = new HashMap<>();
//        parameter.put("name",name);
//
//        return parameter;
//    }
//
//    // 직원 정보를 입력받는 메서드
//    private  static Map<String, String > inputEmployee() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("사원 번호를 입력하세요 :");
//        String id = sc.nextLine();
//        System.out.print("직원 이름을 입력하세요 : ");
//        String name = sc.nextLine();
//        System.out.print("주민등록 번호를 입력하세요 : ");
//        String no = sc.nextLine();
//        System.out.println("이메일을 입력해주세요 : ");
//        String email = sc.nextLine();
//        System.out.println("핸드폰 번호를 입력해주세요 : ");
//        String phone = sc.nextLine();
//        System.out.println("부서 코드를 입력해주세요 : ");
//        String deptCode = sc.nextLine();
//        System.out.println("직급 코드를 입력해주세요 : ");
//        String jobCode = sc.nextLine();
//        System.out.println("급여 등급을 입력해주세요 : ");
//        String salLevel = sc.nextLine();
//        System.out.println("급여를 입력해주세요 : ");
//        String salary = sc.nextLine();
//        System.out.println("보너스율을 입력해주세요 : ");
//        String bonus = sc.nextLine();
//        System.out.println("관리자 번호를 입력주세요 : ");
//        String managerId = sc.nextLine();
//        System.out.println("입사일을 입력해주세요 : ");
//        String hireDate = sc.nextLine();
//        System.out.println("퇴사일을 입력해주세요 : ");
//        String entDate = sc.nextLine();
//
//        Map<String, String> parameter = new HashMap<>();
//        parameter.put("ID",id);
//        parameter.put("Name",name);
//        parameter.put("No",no);
//        parameter.put("Email",email);
//        parameter.put("Phone",phone);
//        parameter.put("DeptCode", deptCode);
//        parameter.put("JobCode",jobCode);
//        parameter.put("SalLevel",salLevel);
//        parameter.put("Salary",salary);
//        parameter.put("Bonus", bonus);
//        parameter.put("ManagerId",managerId);
//        parameter.put("HireDate", hireDate);
//        parameter.put("EntDate",entDate);
//        return parameter;
//
//    }
//
//    // 메뉴 정보를 수정하는 메서드
//    private static Map<String, String> inputModifyEmployee(){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("수정할 사원 번호를 입력하세요 :");
//        String id = sc.nextLine();
//        System.out.print("수정할 메뉴 이름을 입력하세요 : ");
//        String name = sc.nextLine();
//        System.out.print("수정할 주민등록번호 입력하세요 : ");
//        String no = sc.nextLine();
//        System.out.print("수정할 이메일을 입력하세요 : ");
//        String email = sc.nextLine();
//        System.out.println("수정할 전화번호를 입력하세요 : ");
//        String phone = sc.nextLine();
//        System.out.println("수정할 부서 코드를 입력해주세요 : ");
//        String deptCode = sc.nextLine();
//        System.out.println("수정할 직급 코드를 입력해주세요 : ");
//        String jobCode = sc.nextLine();
//        System.out.println("수정할 급여 등급을 입력해주세요 : ");
//        String salLevel = sc.nextLine();
//        System.out.println("수정할 급여를 입력해주세요 : ");
//        String salary = sc.nextLine();
//        System.out.println("수정할 보너스율을 입력해주세요 : ");
//        String bonus = sc.nextLine();
//        System.out.println("수정할 관리자 번호를 입력주세요 : ");
//        String managerId = sc.nextLine();
//        System.out.println("수정할 입사일을 입력해주세요 : ");
//        String hireDate = sc.nextLine();
//        System.out.println("수정할 퇴사일을 입력해주세요 : ");
//        String entDate = sc.nextLine();
//
//
//        Map<String, String> parameter = new HashMap<>();
//        parameter.put("ID",id);
//        parameter.put("Name",name);
//        parameter.put("No",no);
//        parameter.put("Email",email);
//        parameter.put("Phone",phone);
//        parameter.put("DeptCode", deptCode);
//        parameter.put("JobCode",jobCode);
//        parameter.put("SalLevel",salLevel);
//        parameter.put("Salary",salary);
//        parameter.put("Bonus", bonus);
//        parameter.put("ManagerId",managerId);
//        parameter.put("HireDate", hireDate);
//        parameter.put("EntDate",entDate);
//        return parameter;
//
//    }

}
