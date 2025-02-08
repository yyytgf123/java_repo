package outer;

import java.util.function.LongConsumer;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paraVar) {

        int localVar = 1;

        //지역 클래스
        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println(value);
                System.out.println(localVar);
                System.out.println(paraVar);
                System.out.println(outInstanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
