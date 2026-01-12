import java.util.Scanner;
import java.util.HashSet;
public class MissingElementsArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size (n-1 elements for 1 to n): ");
        int n=sc.nextInt();
        int[] arr=new int[n-1];
        System.out.println("Enter elements:");
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            set.add(arr[i]);
        }
        System.out.print("Missing element: ");
        for(int i=1;i<=n;i++){
            if(!set.contains(i)) System.out.print(i);
        }
    }
}