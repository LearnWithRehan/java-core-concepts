import java.util.Scanner;

public class FindLargestofthreenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number:- ");
        int num1 = sc.nextInt();
        System.out.println("Enter a second number:- ");
        int num2 = sc.nextInt();
        System.out.println("Enter a third number:- ");
        int num3 = sc.nextInt();
        //condition

        if (num1 >=  num2 && num1 >= num3){
            System.out.println(num1 + " is a big number");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is a big number");

        }else {
            System.out.println(num3 + " is a big number");
        }
    }
}
