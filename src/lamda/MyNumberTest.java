package lamda;

public class MyNumberTest {

    public static void main(String[] args) {

        MyNumber myNumber = (num1, num2) -> num1 > num2 ? num1 : num2;

        System.out.println(myNumber.getMAx(2, 3));
    }
}
