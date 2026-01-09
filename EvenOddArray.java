import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:- ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements:- ");
        for (int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int even=0;
        int odd = 0;
        for (int num : array){
            if (num % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Count Even:- " + even + ", Count Odd:- " + odd);
    }

}