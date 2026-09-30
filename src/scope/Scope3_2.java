package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; //비효율적이다.
        if (m > 0) {
            temp =m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
