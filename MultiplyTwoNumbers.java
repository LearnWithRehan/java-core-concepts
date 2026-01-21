import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        float a = sc.nextFloat();
        System.out.println("Enter second value");
        float b = sc.nextFloat();
        float product = a * b;
        System.out.println("The product is " + product);
    }
}
