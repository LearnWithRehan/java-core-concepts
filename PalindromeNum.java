import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int num = sc.nextInt();
        int rev=0,temp= num;
        while (num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (temp == rev){
            System.out.println(temp + " is a palindrome ");
        }else {
            System.out.println(temp +  " is not a palindrome");
        }
    }
}
