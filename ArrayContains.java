import java.util.Scanner;

public class ArrayContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements:- ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter element to check:- ");
        int n = sc.nextInt();
        boolean found = false;
        for (int num : array){
            if (num == n){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println(n + " is present in array");
        }else {
            System.out.println(n + " is not present in array");
        }
    }
}