import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array:- ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Enter elements of first array:- ");
        for (int i =0; i < n1; i++){
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter size of second array:- ");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Enter elements of second array:- ");
        for (int i = 0; i<n2; i++){
            array2[i] = sc.nextInt();
        }
        int[] merged = new int[n1 + n2];
        for (int i = 0; i < n1; i++){
            merged[i] = array1[i];
        }
        for (int i = 0; i<n2; i++){
            merged[n1 + i] = array2[i];
        }
        System.out.println("Merged array: " + Arrays.toString(merged));

    }

}
