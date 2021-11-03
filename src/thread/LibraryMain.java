package thread;

import java.util.ArrayList;

class Library{
    public ArrayList<String> shelf = new ArrayList<>();

    public Library() {
        shelf.add("book1");
        shelf.add("book2");
        shelf.add("book3");
        shelf.add("book4");
        shelf.add("book5");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();

        while (shelf.size() == 0){
            System.out.println(t.getName() + " : waiting....");
            wait(); //현재 Thread를 wait상태로
            System.out.println(t.getName() + " : waiting....end!");
        }
        if (shelf.size() > 0){
            String book = shelf.remove(0);
            System.out.println(t.getName() + " lend : " + book);
            return book;
        }else {
            return null;
        }

    }

    public synchronized void returnBook(String book){
        Thread t = Thread.currentThread();
        shelf.add(book);
        notifyAll(); //반납했다고 알려주기
        System.out.println(t.getName() + " return : " + book);
    }
}

class Student extends Thread{

    public String name;

    public Student(String name) {
        super(name);
    }

    public void run(){

        try {
            String title = LibraryMain.library.lendBook();
            if(title == null) {
                System.out.println( getName() +" : 책이 없어서 못빌렸음 ㅜㅜ");
                return;
            }
            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

public class LibraryMain {

    public static Library library = new Library();

    public static void main(String[] args) {
        Student std1 = new Student("std1");
        Student std2 = new Student("std2");
        Student std3 = new Student("std3");
        Student std4 = new Student("std4");
        Student std5 = new Student("std5");
        Student std6 = new Student("std6");
        Student std7 = new Student("std7");
        Student std8 = new Student("std8");
        Student std9 = new Student("std9");
        Student std10 = new Student("std10");

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
        std7.start();
        std8.start();
        std9.start();
        std10.start();

    }
}
