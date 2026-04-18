import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        //form user input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of elements");
        int no = sc.nextInt();
        int[] a = new int[no];

        System.out.println("Enter elements");
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Original Array");
        for (int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }

        int temp;
        //Bubble Sort
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j<a.length-1; j++){
                if (a[j] > a[j+1]){
                  temp = a[j];
                  a[j] = a[j+1];
                  a[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Array");
        for (int i =0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}