import java.util.HashSet;
import java.util.Scanner;

public class unionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array:- ");  //3
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        System.out.println("Enter element of first array");
        for (int i = 0; i<a; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of second array");
        int b = sc.nextInt();
        int[] arr2 =new int[b];
        System.out.println("Enter element of second array");
        for (int i =0; i<b; i++){
            arr2[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1){
            set.add(num);
        }
        for (int num : arr2){
            set.add(num);
        }

        System.out.println("Union " + set);

    }
}
