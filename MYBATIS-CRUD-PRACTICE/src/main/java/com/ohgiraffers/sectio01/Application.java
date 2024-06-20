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
                case 2: EmployeeController.selectByCode(inputEmployeeCode()); break;
                case 3: EmployeeController.selectByname(inputEmployeeName()); break;
                case 4: EmployeeController.registEmployee(inputEmployee());break;
                case 5: EmployeeController.modifyEmployee(inputModifyEmployee()); break;
                case 6: EmployeeController.deleteEmployee(inputEmployeeCode()); break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
                    break;
            }
        }while (true);
    }

    // 직원코드를 입력받는 메서드
    private static Map<String,String> inputEmployeeCode(){

        Scanner sc = new Scanner(System.in);
        System.out.print("직원 코드를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code",code);

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
        System.out.print("직원를 입력하세요 :");
        String name = sc.nextLine();
        System.out.print("메뉴를 가격을 입력하세요 : ");
        String price = sc.nextLine();
        System.out.print("카테고리 코드를 입력하세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name",name);
        parameter.put("price",price);
        parameter.put("categoryCode",categoryCode);
        return parameter;

    }

    // 메뉴 정보를 수정하는 메서드
    private static Map<String, String> inputModifyEmployee(){
        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 메뉴 코드를 입력하세요 :");
        String code = sc.nextLine();
        System.out.print("수정할 메뉴 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("수정할 메뉴 가격을 입력하세요 : ");
        String price = sc.nextLine();
        System.out.print("수정할 카테고리 코드를 입력하세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code",code);
        parameter.put("name",name);
        parameter.put("price",price);
        parameter.put("categoryCode",categoryCode);
        return parameter;

    }

}
