package anonymous.ex2;

public class OuterClassMain {

    public static void main(String[] args) {
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
