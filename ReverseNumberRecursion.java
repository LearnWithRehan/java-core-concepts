import java.util.Scanner;

public class ReverseNumberRecursion {
    static int reverse(int num, int rev){
        if (num == 0){
            return rev;
        }
        int digit = num % 10;
        rev = rev * 10 + digit;
        return reverse(num/10,rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int number = sc.nextInt();
        System.out.println("Original Number:- " + number);
        int result = reverse(number,0);
        System.out.println("Reverse Number:- " + result);
    }
}
