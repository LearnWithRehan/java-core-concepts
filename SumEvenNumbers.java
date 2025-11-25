import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2,count=0;count<n;i+=2,count++){
            sum += i;
        }
        System.out.println("Sum of even numbers:- " + sum);
    }
}