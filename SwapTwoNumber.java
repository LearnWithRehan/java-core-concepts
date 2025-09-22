import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1 value:- ");
        int num1 = sc.nextInt(); // num1 = 50
        System.out.println("Enter Num2 value:- ");
        int num2 = sc.nextInt(); // num2 = 30
        int temp;
        System.out.println("Original num1 vlaue:- " + num1);
        System.out.println("Original num2 vlaue:- " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Swap num1 value:- "+ num1);
        System.out.println("Swap num2 value:- "+ num2);
    }
}
