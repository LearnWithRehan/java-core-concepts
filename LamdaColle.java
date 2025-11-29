import java.util.Arrays;
import java.util.List;

public class LamdaColle {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C","D");
        list.forEach(s -> System.out.println(s));
    }
}
