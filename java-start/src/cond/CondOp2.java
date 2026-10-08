package cond;

public class CondOp2 {
    public static void main(String[] args) {
        //항이 세개라고 해서 삼항연산자라고 함. if else와 같다.
        int age =18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);
    }
}
