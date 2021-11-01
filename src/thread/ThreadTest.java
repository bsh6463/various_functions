package thread;

class MyThread implements Runnable{

    public void run(){
        int i;
        for (i=1; i<=200; i++){
            System.out.print(i+"\t");
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread() + "start");
        MyThread runnable = new MyThread();

        Thread th1 = new Thread(runnable);
        System.out.println(Thread.currentThread() + "end");

        //익명클래스
       Runnable run = new Runnable() {
            @Override
            public void run() {
                int i;
                for (i=1; i<=200; i++){
                    System.out.print(i+"\t");
                }
            }
        };

    }
}
