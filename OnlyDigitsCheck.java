import java.util.Scanner;
public class OnlyDigitsCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        boolean isDigit = str.matches("\\d+");
        System.out.println(isDigit ?
                "String contains only digits"
                : "String contains other characters");
    }
}