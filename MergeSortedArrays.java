import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements for first array:");
        for (int i = 0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements for second array:");
        for (int i = 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }
        int[] merged = new int[n1+n2];
        System.arraycopy(arr1,0,merged,0,n1);
        System.arraycopy(arr2,0,merged,n1,n2);
        Arrays.sort(merged);
        System.out.println("Merged sorted array: "
        + Arrays.toString(merged));
    }
}