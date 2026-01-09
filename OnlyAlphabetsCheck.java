import java.util.Scanner;
public class OnlyAlphabetsCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        boolean isAlpha = str.matches("[a-zA-Z]+");
        System.out.println(isAlpha ? "String contains only alphabets" : "String contains other characters");
    }
}