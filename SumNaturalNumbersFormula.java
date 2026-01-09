import java.util.Scanner;

public class SumNaturalNumbersFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int num = sc.nextInt();
        //formula
        int sum = num * (num + 1)/2;
        System.out.println("Sum of Natural Number:- " + sum);
    }
}
