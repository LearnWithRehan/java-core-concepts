import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:- ");
        int size = sc.nextInt();
        //create array
        int[] arr = new int[size];
        System.out.println("Enter elements:-");
        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for (int i = 1; i<size; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest Element:- " + largest);
    }
}