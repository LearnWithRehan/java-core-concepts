import java.util.Scanner;

public class RevStr {
    public static void main(String[] args) {
        //from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:- ");
        String name = sc.next();
        String rev = "";
        int len = name.length();
        System.out.println("Original String:- " + name);
        for (int i = len-1; i>=0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse String is:- " + rev);
    }
}
