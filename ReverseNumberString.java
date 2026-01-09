import java.util.Scanner;

public class ReverseNumberString {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int num = sc.nextInt();
        System.out.println("Original Number:- " + num);
        String reverse = new StringBuilder(String.valueOf(num)).reverse().toString();
        System.out.println("Reverse Number:- "+ reverse);
    }
}
