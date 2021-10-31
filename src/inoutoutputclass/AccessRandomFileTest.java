package inoutoutputclass;

import java.io.IOException;
import java.io.RandomAccessFile;

public class AccessRandomFileTest {

    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
        rf.writeInt(100); //int : 4byte
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
        rf.writeDouble(3.14); // double : 8byte -> 4+8
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
        rf.writeUTF("안녕하세요"); //한글 : 3byte(modified uft-8) -> 4+8+15+2(new line)
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());

        rf.seek(0); //맨 앞으로 이동
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println("파일 포인터 위치:" + rf.getFilePointer());
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }

}
