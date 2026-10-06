package method;

public class Method1Ref {
    public static void main(String[] args) {
        //계산 1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        //계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    public static int add(int a, int b) { //int는 숫자형을 반환하는 것. 메서드 선언. 메서드 이름, 반환 타입, 파라미터 목록
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum; //함수의 결과는 sum이다 하고 출력이 되는 것이다.
    }
}
