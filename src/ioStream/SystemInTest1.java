package ioStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

    public static void main(String[] args) {
        System.out.println("문자 여러 개를 쓰고 [enter]");

        int i;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            while ((i = isr.read()) != '\n'){
                //System.out.println(i);
                System.out.print((char)i);
            }
            System.out.println("");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
