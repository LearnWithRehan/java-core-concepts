import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        //from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements:- ");
        for (int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        //print original array
        System.out.println("Original Array");
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }


        int min,temp;
        for (int i = 0; i<array.length; i++){
            min = i;
            for (int j = i+1; j<array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        System.out.println();
        System.out.println("Sorted Array:- ");
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
