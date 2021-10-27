package lamda;


class AddTest {

    public static void main(String[] args) {
        //add를 바로 구현해버리기
        Add addXY = Integer::sum;

        int result = addXY.add(1, 2);

        Add multiplyXY = (x, y) -> x*y;

        int result2 = multiplyXY.add(2,3);
    }

}