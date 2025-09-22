import java.util.Scanner;

public class SumOFNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");  //100 1,2,3 ........100
        int number = sc.nextInt();
        int sum = 0;   // 0 +1+2+3

        for (int i = 1; i<= number; i++){
           // sum += i;
            sum = sum + i;   //1
        }
        System.out.println("Sum of Natural Number is:- " + sum);
    }
}

