import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        //from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int rev = 0, rem;
        System.out.println("Original Number is:- " + num);
        while (num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse Nume is :- " + rev);
    }
}
