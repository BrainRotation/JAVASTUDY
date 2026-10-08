package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 5;
        //대부분 for문을 쓴다. 그리고 3번이상 잘 중첩을 잘 하지 않는다 그렇다고 한다면 잘 못 짠거라 다시한번 생각해 봐야한다.
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) { //j <= i 이걸 못 찾아서 몇시간을 헤맸음.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
