package address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 a = new MemberV1("USER1", address);
        MemberV1 b = new MemberV1("USER2", address);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.getAddress().setValue("부산");
        System.out.println("a" + a);
        System.out.println("b" + b);
    }
}
