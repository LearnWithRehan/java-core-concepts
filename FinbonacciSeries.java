import java.util.Scanner;

public class FinbonacciSeries {
    public static void main(String[] args) {
        //from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Find Fibonacci Series up to");
        int fibonaccinum = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 1; i<=fibonaccinum; i++){
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
