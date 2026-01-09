import java.util.Arrays;
import java.util.List;

public class MapUsingStrem {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,6,7);
        list.stream().map(n -> n * n)
                .forEach(System.out :: println);
    }
}
