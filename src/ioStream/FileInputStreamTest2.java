package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

    public static void main(String[] args) {

        int i;
        //리소스를 try내부에 선언해 주면 close별도로 안해줘도 됨.
        try(FileInputStream fis = new FileInputStream("input.txt")) {

            while ((i = fis.read()) != -1){
                System.out.print((char) i);
            }
            System.out.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }

}
