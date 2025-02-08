package local;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paraVar) {

        int localVar = 1;

        Printer printer = new Printer() {

            int value = 0;

            @Override
            public void print() {
                System.out.println(value);
                System.out.println(localVar);
                System.out.println(paraVar);
                System.out.println(outInstanceVar);
            }
        };
    }
}
