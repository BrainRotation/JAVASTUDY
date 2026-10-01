package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; //x001이라는 주소값 참조값을 가지고 있다

        System.out.println(students); //[I@6acbcfc0 I 는 int이고 @뒤의 값은 16진수 참조값이다.

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        System.out.println("student1 = " + students[0]);
        System.out.println("student2 = " + students[1]);
        System.out.println("student3 = " + students[2]);
        System.out.println("student4 = " + students[3]);
        System.out.println("student5 = " + students[4]);
    }
}
