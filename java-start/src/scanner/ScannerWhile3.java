package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("사용자가 0을 입력하면 프로그램은 종료된다.");
        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요: ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            sum += num;
            System.out.println("입력한 모든 정수의 합: " + sum);
        }
    }
}
