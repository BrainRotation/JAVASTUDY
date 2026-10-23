package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; //this를 자동으로 붙여주기때문에 현재는 이렇게 사용됨. ide가 발전하면서 색깔을 구분시켜주기때문.
        this.nameField = nameParameter; //옛날 코딩스타일
    }
}
