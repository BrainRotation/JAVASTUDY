package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true; //return을 만나면 바로 끝.
        } else {
            return false; //항상 return하는게 보장되기때문에 실행됨.
        }
    }
}
