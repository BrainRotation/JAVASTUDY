package variable;

public class Var7 {
    public static void main(String[] args) {
        //type이라고한다. 값을 넣는 그 값들은 literal(리터럴)이라고 한다.
        int a =100; //정수 문자는 담을 수 없음
        double b = 10.5; //실수
        boolean c = true; //true false만 입력가능
        char d = 'A'; //문자 하나만 들어갈 수 있음 두개면 오류남.
        String e = "Hello Java"; //문자열, 문자열을 다루기 위한 특별한 타입, 얘만 앞에 대문자.

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
