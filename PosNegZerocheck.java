import java.util.Scanner;

public class PosNegZerocheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int num = sc.nextInt();
        //condition
        if (num > 0){
            System.out.println(num + " Positive Number");
        } else if (num < 0) {
            System.out.println(num + " Negative number");
        }else {
            System.out.println(num + " Zero");
        }
    }
}
