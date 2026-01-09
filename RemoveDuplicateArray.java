import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter  Elements:- ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num:arr){
            set.add(num);
        }
        System.out.println("Array without duplicates: ");
        for (int num:set){
            System.out.print(num + " ");
        }
    }

}