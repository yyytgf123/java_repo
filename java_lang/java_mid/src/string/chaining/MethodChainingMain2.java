package string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder.add(2);
        ValueAdder adder3 = adder.add(3);

        System.out.println(adder1.getValue());
        System.out.println(adder2.getValue());
        System.out.println(adder3.getValue());

        System.out.println("---------------");

        System.out.println(adder1);
        System.out.println(adder2);
        System.out.println(adder3);
    }
}
