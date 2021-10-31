package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {


    //예외를 메서드 호출하는 곳에서 처리함
    public Class loadClass(String fileName, String className ) throws ClassNotFoundException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {

        ThrowException test = new ThrowException();

        try {
            test.loadClass("a.txt", "abc");
        } catch (ClassNotFoundException | FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (Exception e){ //위에서 catch 못하는 예외를 최상위Exception으로 처리
            System.out.println(e.getMessage());
        }

        /*
        try {
            test.loadClass("a.txt", "abc");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        */

        System.out.println("end");
    }
}
