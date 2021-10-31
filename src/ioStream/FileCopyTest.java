package ioStream;

import java.io.*;
import java.net.Socket;

public class FileCopyTest {

    public static void main(String[] args) throws IOException {


        long millisecond = 0;

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a_copy.zip"))){

            millisecond = System.currentTimeMillis();

            int i;
            while ((i=bis.read()) != -1){
                bos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(millisecond +"ms 소요됨");

        Socket socket = new Socket();
        //바이트 단위로 읽음
        InputStream inputStream = socket.getInputStream();
        //문자 핸들링
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        //버퍼 기능 추가
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        bufferedReader.readLine();
    }
}
