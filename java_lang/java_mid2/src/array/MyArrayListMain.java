package array;

//정적 배열의 크기를 갖고 있어 초기의 지정한 값을 넘지 못함
public class MyArrayListMain {

    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==기능 사용==");
        System.out.println("list.size() : " + list.size());
        System.out.println("list.get(1) : " + list.get(1));

        System.out.println("==범위 초과==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        //범위 초과
        list.add("f");
        System.out.println(list);
    }
}
