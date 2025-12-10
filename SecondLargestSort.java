import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements:- ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second largest element:- " + arr[n-2]);
    }
}