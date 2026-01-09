import java.util.Scanner;
public class PowerRecursion {
    static long power(int base,int exp){
        if(exp==0) return 1;
        return base*power(base,exp-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and exponent: ");
        int base = sc.nextInt(), exp = sc.nextInt();
        System.out.println("Result = " + power(base,exp));
    }
}