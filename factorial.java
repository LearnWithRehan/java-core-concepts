import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        //5 = 1*2*3*4*5=120  10 = 1*2*3....*10
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int num = sc.nextInt();
        long fact = 1;

        for (int i =1; i<=num; i++){
           // fact *= i;
            fact = fact * i;
        }
        System.out.println("Factorial is:- "+ fact);

    }
}
