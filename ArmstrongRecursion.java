import java.util.Scanner;

public class ArmstrongRecursion {

    // Recursive function to calculate power
    static int power(int digit, int exp) {
        if (exp == 0) return 1;
        return digit * power(digit, exp - 1);
    }

    // Recursive function to calculate sum of digits raised to power n
    static int armstrongSum(int num, int n) {
        if (num == 0) return 0;
        int digit = num % 10;
        return power(digit, n) + armstrongSum(num / 10, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Find total number of digits
        int n = String.valueOf(num).length();

        // Calculate Armstrong sum using recursion
        int result = armstrongSum(num, n);

        if (result == num) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is NOT an Armstrong Number.");
        }
    }
}
