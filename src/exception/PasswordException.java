package exception;

public class PasswordException extends IllegalArgumentException{

    public PasswordException(String message) {
        super(message); //super 상위 클래스
    }

}
