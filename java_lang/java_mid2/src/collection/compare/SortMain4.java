package collection.compare;

import java.util.ArrayList;
import java.util.List;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser MyUser1 = new MyUser("a", 30);
        MyUser MyUser2 = new MyUser("b", 20);
        MyUser MyUser3 = new MyUser("c", 10);

        List<MyUser> myUserList = new ArrayList<>();
        myUserList.add(MyUser1);
        myUserList.add(MyUser2);
        myUserList.add(MyUser3);
        System.out.println("기본 데이터");
        System.out.println(myUserList);

        System.out.println("Comparable 기본 정렬");
        myUserList.sort(null);

        System.out.println(myUserList);

        System.out.println("IdComparator 정렬");
        myUserList.sort(new IdComparator());
        System.out.println(myUserList);
    }
}
