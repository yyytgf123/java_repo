package checked;

public class Client {
    public void call() throws MyCheckedException {
        throw new MyCheckedException("ex");
    }
}

//throw 예외라고 하면 새로운 예외를 발생 가능, 객체를 new로 생성하고 예외를 발생 시켜야함
//throws 예외는 발생시킨 예외를 메서드 밖으로 던질 대 사용하는 키워드
//둘의 차이 인지 필요
