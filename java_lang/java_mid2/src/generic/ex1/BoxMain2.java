package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); //Object -> integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //Object -> Stirng 캐스팅
        System.out.println("string = " + str);

        integerBox.set("문자100");
        Integer reuslt = (Integer) integerBox.get();
        System.out.println("result = " + reuslt);
    }
}
