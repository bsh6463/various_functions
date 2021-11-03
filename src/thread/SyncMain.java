package thread;

class Bank{
    private int money = 10000;

    public synchronized void saveMoney(int save){
        int m = getMoney();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m + save);
    }

    public synchronized void minusMoney(int minus){
        int m = getMoney();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m-minus);

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread{
    public void run(){
        System.out.println("start save");
        SyncMain.bank.saveMoney(3000);
        System.out.println("saveMoney(3000) : " + SyncMain.bank.getMoney());
    }
}

class Park2 extends Thread{
    public void run(){
        System.out.println("start minus");
        SyncMain.bank.minusMoney(1000);
        System.out.println("minusMoney(1000) : " + SyncMain.bank.getMoney());
    }
}

public class SyncMain {

    public static Bank bank = new Bank();

    public static void main(String[] args) {

        Park p1 = new Park();
        p1.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Park2 p2 = new Park2();
        p2.start();

    }
}
