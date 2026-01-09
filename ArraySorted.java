import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:- ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements:- ");
        for (int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }
        boolean sorted = true;
        for (int i = 0; i<size-1; i++){
            if (array[i] > array[i + 1]){
                sorted = false;
                break;
            }
        }
        if (sorted){
            System.out.println("Array is sorted:- "  + sorted);
        }else {
            System.out.println("Array is not sorted:- " + sorted);
        }
    }

}
