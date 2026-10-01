package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; //주의사항은 라인을 나누면 안된다. 선언하는 동시에 사용한다.

        //변수 값 사용
        for (int i = 0; i < students.length; i++) { //length길이를 조회만 할 수 있다.
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
