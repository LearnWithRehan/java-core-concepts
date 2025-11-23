import java.util.Arrays;
import java.util.List;

public class LamdaCollectionDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C");
        list.forEach(s -> System.out.println(s));
    }
}
