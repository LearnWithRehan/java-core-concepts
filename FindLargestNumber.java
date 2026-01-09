import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:- ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number:- ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number:- ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println("Largest Number:- "+ num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Largest Number:- "+ num2);

        }else {
            System.out.println("Largest Number:- "+ num3);
        }
    }
}
