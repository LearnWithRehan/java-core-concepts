import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:- ");
        for (int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i< n; i++){
            if (arr[i] > largest){
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];

            }
        }
        System.out.println("Second Largest Element = " + second);
    }
}