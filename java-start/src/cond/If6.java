package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매");
        } else if (age <= 10){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인금액: " + discount + "원");

        if (true)
            System.out.println("if문에서 실행됨"); //실행하는 문장이 한 줄일 경우에는. {}를 생략을 해도 된다. 한줄만 실행됨.
        System.out.println("if문에서 실행안됨"); //한 줄만 있는 경우에도 중괄호를 쓰긴한다. {}는 유지보수관점에서 좋다.

    }
}
