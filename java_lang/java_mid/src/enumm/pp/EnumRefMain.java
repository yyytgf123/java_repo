package enumm.pp;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC : " + Grade.BASIC.getClass());
        System.out.println("class GOLD : " + Grade.GOLD.getClass());
        System.out.println("class DIAMAND : " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMAND : " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Object grade) {
        return Integer.toBinaryString(System.identityHashCode(grade));
    }
}
