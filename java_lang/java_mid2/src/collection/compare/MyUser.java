package collection.compare;

public class MyUser implements Comparable<MyUser> {

    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(MyUser o) {
        //1. o.age가 더 크면 -1 반환, this.age가 더 크면 뒤 비교
        //2. this.age == o.age가 동일 시 0반환, 아닐 시 1반환
        return this.age < o.age ? -1 : (this.age == o.age) ? 0: 1;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
