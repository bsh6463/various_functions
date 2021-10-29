package exception;

public class ArrayIndexException {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try{
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" 예외 : " + e.getMessage());
            System.out.println(e.toString());
        }

        //catch를 통해 예외를 처리하면 실행됨. -> 죽지 않음
        //만약 예외 처리를 안하면 catch에서 중단됨.
        //물론 정상 상황일 경우에도 실행됨.
        System.out.println("here~~~");
    }
}
