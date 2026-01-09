import java.util.Scanner;

public class MaxArrayRecursion {
    static int max(int[] arr, int n){
        if (n == 1)
            return arr[0];
        return Math.max(arr[n-1], max(arr,n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum element = " + max(arr,n));
    }
}