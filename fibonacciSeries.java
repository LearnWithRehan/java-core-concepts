import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:- ");
        int num = sc.nextInt();
        int first =0, second = 1;
        for (int i = 1; i<=num; i++){
            System.out.print(first + " ");
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }
}
