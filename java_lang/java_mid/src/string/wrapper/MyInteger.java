package string.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValu() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target){
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
