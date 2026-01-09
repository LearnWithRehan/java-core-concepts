import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int num = sc.nextInt();
        int sum =0, temp = num;
        while (num > 0){
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        if (sum == temp){
            System.out.println(temp + " is Armstrong Number");
        }else {
            System.out.println(temp + " is not Armstrong Number");
        }
    }

}
