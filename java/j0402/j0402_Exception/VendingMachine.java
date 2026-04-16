package j0402_Exception;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        // 1. 초기 설정 (준비 단계)
        Scanner sc = new Scanner(System.in);
        int balance = 0; // 현재 잔액

        while (true){
            try {
                // 2. 돈 투입 기능
                System.out.print("돈을 넣어주세요: ");
                balance = sc.nextInt();
                System.out.println("현재 잔액: " + balance + "원");

                // 3. 메뉴 출력
                System.out.println("\n--- 메뉴 ---");
                System.out.println("1. 콜라 (1000원)");
                System.out.println("2. 물 (700원)");
                System.out.println("3. 주스 (1200원)");
                System.out.print("원하는 음료 번호를 선택하세요: ");
                int choice = sc.nextInt();

                // 4. 음료 선택 및 잔액 차감 기능 (조건문 활용)
                int price = 0;
                String drinkName = "";

                if (choice == 1) {
                    drinkName = "콜라";
                    price = 1000;
                } else if (choice == 2) {
                    drinkName = "물";
                    price = 700;
                } else if (choice == 3) {
                    drinkName = "주스";
                    price = 1200;
                } else {
                    break;
                }

                // 5. 결과 출력 및 잔액 업데이트
                // 잔액이 충분하다고 가정한 긍정적 상황의 로직
                balance = balance - price;
                System.out.println("\n" + drinkName + "가 나왔습니다.");
                System.out.println("남은 잔액은 " + balance + "원입니다.");
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input could be only Intiger");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
