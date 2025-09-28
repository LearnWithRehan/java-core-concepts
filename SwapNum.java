import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a:- ");
        int a = sc.nextInt();
        System.out.println("enter value of b:- ");
        int b = sc.nextInt();
        System.out.println("Original a:- " + a);
        System.out.println("Original b:- " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swap Value of a = " + a + " b = " + b);
    }
}
