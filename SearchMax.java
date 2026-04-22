import java.util.Scanner;

public class SearchMax {
    public static void main(String[] args) {

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        //create array
        int[] arr = new int[size];

        System.out.println("Enter Elements");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //let me
        int max = arr[0];
        for (int i = 1; i<arr.length; i++){
            //comapre each other
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max is " + max);
    }
}
