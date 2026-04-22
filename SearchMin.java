import java.util.Scanner;

public class SearchMin {
    public static void main(String[] args) {
        //from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        //create array
        int[] array = new int[size];

        System.out.println("Enter elements");
        for (int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        int min = array[0];
        for (int i = 1; i<array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Min is " + min);
    }
}
