import java.util.Scanner;

public class GCDUsingRecursion {
    static int gcd(int a, int b){
        if (b == 0)
            return a;
        return gcd(b,a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:- ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:- ");
        int b = sc.nextInt();
        System.out.println("GCD:-  " + gcd(a, b));
    }
}
