package oopAndLambda;


class StringConcatImplTest {

    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "bye";

        System.out.println("객체지향");
        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString(s1, s2);

        System.out.println("람다식");
        StringConcat concat = (s, v) -> System.out.println(s + ", "+ v);
        concat.makeString(s1, s2);



    }
}