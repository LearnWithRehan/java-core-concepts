import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        System.out.println("Enter elements:- ");
        for (int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i<size; i++){
            sum += arr[i];
        }
        System.out.println("Sum of Array Elements:- " + sum);

    }
}
