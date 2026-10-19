package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NullPointerException 예외 발생 참조값이 null임
        System.out.println("data = " + data.value);
    }
}
