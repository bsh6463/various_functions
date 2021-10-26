package localInnerClass;

class Outer2{

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnerble(int i){ // 매개변수 i는 stack메모리에 올라감.메서드 종료되면 사라짐.

        int num = 10; //stack에 올라감. 메서드 종료되면 사라짐.

        //익명 클래스 예시 1
        return new Runnable(){

            int localNum = 10;

            @Override
            public void run() {

                System.out.println("i = "+ i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("sNum = " + sNum + "(외부 클래스 static 변수)");

            }
        }; //여기까지

    }

    //익명 클래스2
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("runnerble class 2");
        }
    }; //여기까지
}

public class AnonymousInnerTest {

    public static void main(String[] args) {

        Outer2 out = new Outer2();
        Runnable runnerble = out.getRunnerble(100);
        runnerble.run();

        out.runnable.run();
    }
}
