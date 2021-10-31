package ioStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {

        try(FileWriter fr = new FileWriter("writer.txt")){
            fr.write('A');
            char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'};

            fr.write(buf);
            fr.write("하이");
            fr.write(buf, 1, 2);
            fr.write("65");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
