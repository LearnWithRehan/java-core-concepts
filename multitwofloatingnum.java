import java.util.Scanner;

public class multitwofloatingnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first floating number:- ");
        float  a = sc.nextFloat();
        System.out.println("Enter second floating number:- ");
        float b = sc.nextFloat();
        float c = a * b;
        System.out.println("Multiplication:- " + c);
    }
}
