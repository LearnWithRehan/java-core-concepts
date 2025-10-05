import java.util.Scanner;

public class LCMIteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:- ");
        int num1 =sc.nextInt();
        System.out.println("Enter second number:- ");
        int num2 = sc.nextInt();
        int lcm;
        int max = Math.max(num1,num2);
        for (lcm = max; ; lcm++){
            if (lcm % num1 == 0 && lcm % num2 == 0){
                break;
            }
        }
        System.out.println("LCM:- " + lcm);
    }
}
