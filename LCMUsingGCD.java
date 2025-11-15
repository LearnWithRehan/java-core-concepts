import java.util.Scanner;

public class LCMUsingGCD {
    static int gcd(int a, int b){
        return b==0 ? a: gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = (a*b)/gcd(a,b);
        System.out.println("LCM = " + lcm  );
    }
}