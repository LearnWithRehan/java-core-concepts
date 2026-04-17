import java.util.Scanner;

public class Print1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num of elements:- ");
        int no = sc.nextInt();
        int[] arr = new int[no];

        //user input
        System.out.println("Enter " + no + " Elements");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //print array
        System.out.println("Array elements are");
        for (int i  = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}