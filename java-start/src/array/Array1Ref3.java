package array;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students;
        students = new int[]{90, 80, 70, 60, 50}; //배열 변수 선언

        //변수 값 사용
        for (int i = 0; i < students.length; i++) { //length길이를 조회만 할 수 있다.
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
