import java.util.Scanner;
import java.util.HashSet;
public class ArrayIntersection {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        System.out.println("Enter elements for first array:");
        for(int i=0;i<n1;i++) arr1[i]=sc.nextInt();
        System.out.print("Enter size of second array: ");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        System.out.println("Enter elements for second array:");
        for(int i=0;i<n2;i++) arr2[i]=sc.nextInt();
        HashSet<Integer> set1=new HashSet<>();
        for(int num:arr1) set1.add(num);
        System.out.print("Intersection: ");
        for(int num:arr2){
            if(set1.contains(num)) System.out.print(num+" ");
        }
    }
}