import java.util.Scanner;

public class SumEvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sumEven = 0;
        int sumOdd = 0;
        for (int num : arr){
            if (num % 2 == 0){
                sumEven += num;
            }else {
                sumOdd += num;
            }
        }
        System.out.println("Sum of even elements = " + sumEven);
        System.out.println("Sum of odd elements = " + sumOdd);
    }

}