import java.util.HashMap;
import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:- ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency of elements: " + map);
    }

}