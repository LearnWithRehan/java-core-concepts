import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:- ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 2; i<=num / 2; i++){
            if (num % i == 0){
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println(num + " is Prime Number");
        }else {
            System.out.println(num + " is not Prime Number");
        }
    }
}
