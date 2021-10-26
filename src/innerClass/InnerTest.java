package innerClass;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass{
        int iNum = 100;

        int sInNum = 500;
        //static int sInNum = 500; //사용 불가

        void inTest(){
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");
            System.out.println("InnerClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
        }
    }

    //외부 클래스에서 인스턴스 내부 클래스의 메서드 사용
    public void userClass(){
        inClass.inTest();
    }

    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

        void inTest(){
            //System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");
            System.out.println("InnerClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("InnerClass sInNum = " + sInNum + "(내부 클래스의 static 변수)");
        }

        static void sTest(){ //내부 클래스 생성과 관계 없이 사용할 수 있음.
            //System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");
            //System.out.println("InnerClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("InnerClass sInNum = " + sInNum + "(내부 클래스의 static 변수)");
        }
    }
}


public class InnerTest {

    public static void main(String[] args) {
       // OutClass outClass = new OutClass(); //Inclass도 생성됨.
        //outClass.userClass();

        //Innerclass가 private가 아닌 경우 외부에서도 생성 가능
        //단 생성된 outClass에서 InClass를 찾아서 생성해야함 .아래와 같은 방식
        //OutClass.InClass inner = outClass.new InClass();

        //바로 생성해서 사용할 수 있음.
        OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
        inStaticClass.inTest();
    }
}
