import java.util.Scanner;

public class SecondSmallesEle {
    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        //create array
        int[] array = new int[size];

        System.out.println("Enter elements");
        for (int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original array");
        for (int i =0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();


        int temp;
        for (int i = 0; i<array.length; i++){
            for (int j = i+1; j<array.length; j++){
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second largest ele " + array[1]);
    }
}
