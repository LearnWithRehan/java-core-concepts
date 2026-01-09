import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter first num:- ");
        int num1 = sc.nextInt();
        System.out.println("Etner  second num:- ");
        int num2 = sc.nextInt();
        //condition
        while (num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("GCD:- " +  num1);
    }
}
