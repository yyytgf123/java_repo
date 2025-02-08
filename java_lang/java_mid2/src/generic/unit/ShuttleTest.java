package generic.unit;

public class ShuttleTest {

    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));
        shuttle1.showInfo();

        Shuttle<Zergling> shuttle2= new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));
        shuttle2.showInfo();

        Shuttle<Zeolot> shuttle3= new Shuttle<>();
        shuttle3.in(new Zeolot("질럿", 100));
        shuttle3.showInfo();
    }
}
