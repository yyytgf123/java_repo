package enumm.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] authGrade = AuthGrade.values();


        for (AuthGrade a : authGrade) {
            System.out.println("grade=" + a + ", level=" + a.getLevel()
                                + ", 설명=" + a.getDescription());
        }
    }
}
