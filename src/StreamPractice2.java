import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice2 {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("James");
        sList.add("Edward");

        Stream<String> stream = sList.stream();  // 스트림 생성
        stream.forEach(s-> System.out.println(s)); // forEach 문: 람다식 표현 // 스트림 소모

        for (String s : sList){ // 향상된 표현으로 표현
            System.out.println(s);
        }

        sList.stream().sorted().forEach(s-> System.out.println(s));

    }
}
