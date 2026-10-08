package variable;

public class Var3 {
    public static void main(String[] args) {
        int a;
        a = 10; //변수 초기화 a(10)
        System.out.println(a);
        a = 50; //변수 값 변경 : a(10 -> 50) 10이 완전히 제거가 됨
        System.out.println(a);
    }
}
