package serialization;

import java.io.*;

class Person implements Externalizable{
    String name;
    String job;

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput obj) throws IOException {
        obj.writeUTF(name);
        obj.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
        String name = obj.readUTF();
        String job = obj.readUTF();
    }
}
public class SerializationTest {

    public static void main(String[] args) {
        Person personA = new Person("A", "대표");
        Person personB = new Person("B", "사원");

        System.out.println("객체 write");

        try(FileOutputStream fos = new FileOutputStream("serial.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(personA);
            oos.writeObject(personB);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("===========================================");

        System.out.println("객체 read");
        try(FileInputStream fos = new FileInputStream("serial.txt");
            ObjectInputStream ois = new ObjectInputStream(fos)){

            Person pA = (Person) ois.readObject();
            Person pB = (Person) ois.readObject();

            System.out.println(pA.toString());
            System.out.println(pB.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
