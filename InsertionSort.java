import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {

        //from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:- ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter Element");
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        //Original Array
        System.out.println("Original Array");
        for (int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }


        int temp,j;
        for (int i = 1; i<a.length; i++){
           temp = a[i];
           j = i;
           while (j>0 && a[j-1] > temp){
               a[j] = a[j-1];
               j = j-1;
           }
           a[j] = temp;
        }
        System.out.println();
        System.out.println("Sorted Array");
        for (int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
