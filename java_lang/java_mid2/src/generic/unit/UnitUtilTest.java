package generic.unit;

public class UnitUtilTest {

    public static void main(String[] args) {
        Marine m1 = new Marine("마린1", 40);
        Marine m2 = new Marine("마린2", 50);
        Marine resultMarine = UnitUtil.maxHp(m1,m2);
        System.out.println("resultMarine = " + resultMarine);

        Zeolot z1 = new Zeolot("질럿1", 100);
        Zeolot z2 = new Zeolot("질럿2", 150);
        Zeolot resultZeolo3t = UnitUtil.maxHp(z1,z2);
        System.out.println("resultZealot = " + resultZeolo3t);
    }
}
