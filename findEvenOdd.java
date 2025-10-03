import java.util.Scanner;

public class findEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int num = sc.nextInt();
        //condition
        if (num % 2 == 0){
            System.out.println(num + " is Even");
        }else {
            System.out.println(num + " is Odd");
        }
    }
}
