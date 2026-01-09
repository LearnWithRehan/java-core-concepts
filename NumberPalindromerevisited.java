import java.util.Scanner;

public class NumberPalindromerevisited{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:- ");
        int num = sc.nextInt();
        int originalnum = num;
        int rev=0 ;
        while (num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (originalnum == rev){
            System.out.println(originalnum + " is a palindrome number");
        }else {
            System.out.println(originalnum + " is  not a palindrome number");
        }
    }
}
