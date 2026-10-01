package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine(); // \n를 남김.

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); //10\n 여기서 10을 가져가고 \n만 남음
            input.nextLine(); //이걸로 \n을 없애줄 수 있음.

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
