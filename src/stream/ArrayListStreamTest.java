package stream;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStreamTest {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("A");
        stringList.add("D");
        stringList.add("B");
        stringList.add("C");


        System.out.println("=====================");
        stringList.stream().forEach(System.out::println);
        System.out.println("=====================");
        stringList.stream().map(s -> s.equals("A")).forEach(System.out::println);
        System.out.println("=====================");
        stringList.stream().filter(s -> s.equals("A")).forEach(System.out::println);
        System.out.println("=====================");
        stringList.stream().sorted().forEach(System.out::println);
        System.out.println("=====================");

    }
}
