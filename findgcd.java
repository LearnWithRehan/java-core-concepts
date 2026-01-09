import java.util.Scanner;

public class findgcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:- ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:- ");
        int num2 = sc.nextInt();
        int gcd = findgcdval(num1,num2);
        System.out.println("GCD/HCF: "+ gcd);
    }
    public static int findgcdval(int a , int b) {
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
