import java.util.Scanner;

public class Print2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows");
        int rows = sc.nextInt();
        System.out.println("Enter num of column");
        int column = sc.nextInt();

        //2D Array
        int[][] arr = new int[rows][column];
        //user input
        System.out.println("Enter" + rows + "X" + column+"ele");
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //print Array
        System.out.println("Array elements are");
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}