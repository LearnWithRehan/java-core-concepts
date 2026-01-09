import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:- ");
        String str = sc.nextLine();
        String revStr = "";
        for (int i = str.length()-1; i>=0; i--){
            revStr += str.charAt(i);
        }
        if (str.equals(revStr)){
            System.out.println(str + " is a Palindrome String");
        }else {
            System.out.println(str + " is not a Palindrome String");
        }
    }
}
