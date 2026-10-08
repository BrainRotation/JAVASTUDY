package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        int input;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

//        while (true) {
//            input = scanner.nextInt();
//
//            if (input == -1) {
//                break;
//            }
//            sum += num;
//            count++;
//        }

        //위의 코드를 간단하게 표현하는 방법. 실전으로 많이쓰임.
        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count ++;
        }

        double average = (double) sum / count;

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);

    }
}
