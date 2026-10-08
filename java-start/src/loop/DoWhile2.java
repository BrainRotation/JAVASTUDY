package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        //do 한번는 꼭 하고 그다음에 조건을 검사하고 실행하는 것이다.
        int i = 10;

        do{
            System.out.println("현재 숫자는:" + i);
            i++;
        }
        while (i < 3);
    }
}
