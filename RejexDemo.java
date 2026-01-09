import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RejexDemo {
    public static void main(String[] args) {
        //one or more lowercase letter
        String regex = "[a-z]+";
        String input = "hello345";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()){
            System.out.println("Match found: " + matcher.group());
        }else {
            System.out.println("No match");
        }

    }
}
