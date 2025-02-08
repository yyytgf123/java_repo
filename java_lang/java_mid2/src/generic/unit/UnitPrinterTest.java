package generic.unit;

public class UnitPrinterTest {

    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));

        Shuttle<Zergling> shuttle2= new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));

        Shuttle<Zeolot> shuttle3= new Shuttle<>();
        shuttle3.in(new Zeolot("질럿", 100));

        UnitPrinter.printV1(shuttle1);
        UnitPrinter.printV2(shuttle1);
    }
}
