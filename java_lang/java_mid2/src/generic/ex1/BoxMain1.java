package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);

        StringBox stringBox = new StringBox();
        stringBox.set("StirngBox");

        System.out.println(integerBox.get());
        System.out.println(stringBox.get());
    }
}
