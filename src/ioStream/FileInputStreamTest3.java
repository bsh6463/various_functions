package ioStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

    public static void main(String[] args) {

        int i;
        //리소스를 try내부에 선언해 주면 close별도로 안해줘도 됨.
        try(FileInputStream fis = new FileInputStream("input2.txt")) {

           byte[] bs = new byte[10];
           // byte 수
           while ((i = fis.read(bs)) != -1){
               for (int j = 0; j < i; j++) {
                   System.out.print((char) bs[j]);
               }
               System.out.println(" : " + i + "바이트 읽음");
           }
            System.out.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }

}
