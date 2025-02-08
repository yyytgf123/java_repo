public class Method {
    public static void main(String[] args) {
        int sum1 = add(4,5);
        int sum2 = add(6,7);

        System.out.println(sum1);
        System.out.println(sum2);
    }

    public static int add(int a, int b) {
        System.out.println(a  + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
