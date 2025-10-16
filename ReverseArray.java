import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:- ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements:- ");
        for (int i =0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Reverse Array Elements:- ");
        for (int i = size-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
