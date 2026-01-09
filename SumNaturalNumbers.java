import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=num; i++){
            sum += i;

        }
        System.out.println("Sum Of Natural Number:- " + sum);
    }
}
