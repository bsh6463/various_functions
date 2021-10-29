package stream;

import java.util.ArrayList;
import java.util.List;

class TravelCustomerTest {

    public static void main(String[] args) {

        TravelCustomer customerA = new TravelCustomer("A", 40, 100);
        TravelCustomer customerB = new TravelCustomer("B", 20, 100);
        TravelCustomer customerC = new TravelCustomer("C", 10, 50);

        List<TravelCustomer> customers = new ArrayList<>();

        customers.add(customerA);
        customers.add(customerB);
        customers.add(customerC);

        System.out.println("고객 명단 출력");
        customers.stream().map(c -> c.getName()).forEach(c -> System.out.println(c));
        System.out.println("============================");

        System.out.println("고객 비용 합계");
        //mapToint : int stream으로 반환
        int result = customers.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("비용 합계 : " + result);
        System.out.println("============================");

        System.out.println("20세 이상 고객");
        customers.stream().filter(travelCustomer -> travelCustomer.getAge() >= 20).map(c -> c.getName()).sorted()
                            .forEach(System.out::println);
        System.out.println("============================");
    }


}