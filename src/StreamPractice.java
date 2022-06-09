import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamPractice {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,};

        IntStream stream = Arrays.stream(arr); //스트림 생성됨

        int sum = stream.sum(); // 스트림 생성됨. Arrays 클래스 / stream(arr)은 int stream 이다.
        System.out.println(sum);

        int count = (int)Arrays.stream(arr).count(); // 스트림은 일회성이기 때문에 다시 생성해야 한다.
        System.out.println(count);
    }
}
