package nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {

            //자신의 멤버 접근
            System.out.println(nestedInstanceValue);

            //바깥 클래스의 인스턴스 멤버에 접근'
            //System.out.println(outInstanceValue);

            //이렇게 선언하면 접근 가능
            NestedOuter nestedOuter = new NestedOuter();
            System.out.println(nestedOuter.outInstanceValue);

            //바깥 클래스의 클래스 멤버에는 접근할 수 있다. private 접근 가능
            System.out.println(NestedOuter.outClassValue);

        }
    }
}
