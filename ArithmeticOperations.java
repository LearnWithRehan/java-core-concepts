import java.util.Scanner;

public class ArithmeticOperations  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:- ");
        int a = sc.nextInt();
        System.out.println("Enter second number:- ");
        int b = sc.nextInt();

        //perform operations
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = (b != 0) ? (a / b) : 0;
        int remainder = (b != 0) ? ( a % b) : 0;

        //print results
        System.out.println("Additions: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        if (b != 0){
            System.out.println("Division: " + quotient);
            System.out.println("Modulus: " + remainder);
        }else {
            System.out.println("Division: cannot divide by zero");
            System.out.println("Modulus: cannot divide by zero");
        }
    }
}
