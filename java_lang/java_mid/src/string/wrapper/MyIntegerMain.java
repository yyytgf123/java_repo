package string.wrapper;

public class MyIntegerMain {

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        int i1 = myInteger.compareTo(5);
        int i2 = myInteger.compareTo(10);
        int i3 = myInteger.compareTo(20);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
