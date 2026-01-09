import java.util.Scanner;

public class FibonacciSer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int n = sc.nextInt();
        int a=0,b=1;
        System.out.print("Fibonacci: ");
        for (int i = 1; i<=n; i++){
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
