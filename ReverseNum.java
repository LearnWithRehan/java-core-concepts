import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int num = sc.nextInt();
        System.out.println("Original Number:- " + num);
        int rev = 0;
        while (num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reverse Number:- "+ rev);
    }
}
