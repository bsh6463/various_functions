package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("input.txt");
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());

        } catch (IOException e) {
            e.printStackTrace();

            try {
                fis.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }finally {

            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }


        System.out.println("end");
    }

}
