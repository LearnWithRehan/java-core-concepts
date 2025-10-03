import java.util.Scanner;

public class FibonacciRecursive {
    static int fib(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:- ");
        int num = sc.nextInt();
        for (int i = 1; i<=num; i++){
            System.out.print(fib(i)+ " ");
        }
    }

}