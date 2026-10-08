package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() { //어짜피 모든 메서드는 return을 호출하는데 void는 예외로 자바가 반환타입이 없는 경우에는 자동으로 return을 마지막 줄에 넣어주기 때문에 생략할 수 있다.
        System.out.println("= 프로그램을 시작합니다 =");
        //return; // return을 만나면 해당메서드는 종료가 된다. 위 주석에서 적었다시피 생략가능
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
