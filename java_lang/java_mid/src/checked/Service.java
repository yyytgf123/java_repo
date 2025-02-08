package checked;

public class Service {
    Client client = new Client();

    // 예외를 잡아서 처리하는 코드
    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            System.out.println("예외처리 : " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    //예외를 처리하지 못하여 밖으로 던지는 코드
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}

