package generic.unit;

public class UnitPrinter {

    //Shuttle이라는 컨테이너 클래스 안에 있는 정보를 담아와서 Shuttle<T>라 적어줘야함
    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
    }

    public static <T extends BioUnit> void printV2(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
    }
}
