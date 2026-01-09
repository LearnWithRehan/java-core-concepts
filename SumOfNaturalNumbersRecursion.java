import java.util.Scanner;

public class SumOfNaturalNumbersRecursion {
    static  int sum(int n){
        if (n == 0)
            return 0;
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int num = sc.nextInt();
        System.out.println("Sum Of Natural Number:- " + sum(num));
    }
}
