package exception;

public class PasswordTest {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if (password == null) {
            throw new PasswordException("비밀번호는 필수");
        }else if (password.length() < 5){
            throw new PasswordException("비밀번호는 5자 이상");
        }else if (password.matches("[a-zA-Z]+")){
            throw new PasswordException("비밀번호는 숫자나 특수문자 포함해야 함");
        }
        this.password = password;
    }

    public static void main(String[] args) {

        PasswordTest test = new PasswordTest();

        String pw1 = null;
        try{
            test.setPassword(pw1);
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }

        String pw2 = "abc";
        try{
            test.setPassword(pw2);
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }

        String pw3 = "abcasdf";
        try{
            test.setPassword(pw3);
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }

        String pw4 = "abc21!";
        try{
            test.setPassword(pw4);
            System.out.println("성공");
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }
    }
}
