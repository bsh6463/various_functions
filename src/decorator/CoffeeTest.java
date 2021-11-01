package decorator;

public class CoffeeTest {


    public static void main(String[] args) {
       Coffee etiopiaCoffee = new EtiopiaAmericano();
       etiopiaCoffee.brewing();
        System.out.println("====================");

       Coffee etiopiaLatte = new Latte(etiopiaCoffee);
       etiopiaLatte.brewing();
        System.out.println("====================");

       Coffee etiopiaMochaLatte = new Mocha(new Latte(new EtiopiaAmericano()));
       etiopiaMochaLatte.brewing();
        System.out.println("====================");
    }
}
