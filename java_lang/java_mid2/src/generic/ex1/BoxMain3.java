package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);
        System.out.println(integerBox.get());

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("he");
        System.out.println(stringBox.get());
    }
}
