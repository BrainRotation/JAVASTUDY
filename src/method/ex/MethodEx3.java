package method.ex;

import java.util.Scanner;

public class MethodEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료 ");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int choose = scanner.nextInt();

            if (choose == 1) {
                total = deposit(total, scanner.nextInt());
            } else if (choose == 2) {
                total = withdraw(total, scanner.nextInt());
            } else if (choose == 3) {

            } else {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }

    public static int deposit(int total,int amount) {
        int amount =

        System.out.println("입금액을 입력하세요: " + amount);
        total += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + total);
        return total;
    }
    public static int withdraw(int total,int amount) {
        System.out.println("출금액을 입력하세요: " + amount);
        if (total >= amount) {
            total -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + total);
            return total;
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return total;
    }

}