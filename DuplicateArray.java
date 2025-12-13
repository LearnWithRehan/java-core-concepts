import java.util.HashSet;
import java.util.Scanner;

public class DuplicateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Duplicate Elements: ");
        for (int num : arr){
            if (!set.add(num)){
                System.out.println(num + " ");
            }
        }
    }

}