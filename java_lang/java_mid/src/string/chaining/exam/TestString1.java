package string.chaining.exam;

public class TestString1 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] split = fruits.split(",");
        for(String s : split) {
            System.out.println(s);
        }

        String joinfruits = String.join("->", split);
        System.out.println(joinfruits);
    }
}
