package local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public void process(int paraVar) {

        int localVar = 1;

        class LocalPrinter implements Printer {

            int value = 0;

            @Override
            public void print() {
                System.out.println(value);
                System.out.println(localVar);
                System.out.println(paraVar);
                System.out.println(outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
