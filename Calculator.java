import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Simple Calculator----------");
        System.out.println("Enter First Number:- ");
        double num1 = sc.nextDouble();
        System.out.println("Enter Second Number:- ");
        double num2 = sc.nextDouble();
        System.out.println("Choose operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulo (%)");
        System.out.println("Enter your choice: ");
        int choise = sc.nextInt();

        double result = 0;
        switch (choise){
            case 1 -> result = num1 + num2;
            case 2 -> result = num1 - num2;
            case 3 -> result = num1 * num2;
            case 4 -> {
                if (num2 != 0){
                    result = num1 / num2;
                }else {
                    System.out.println("Error: Cannot divide by zero");
                    return;
                }
            }
            case 5 -> result = num1 % num2;
            default -> {
                System.out.println("Invalid Choice");
                return;
            }
        }
        System.out.println("Result:- " + result);
    }
}
