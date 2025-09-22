import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        int table = sc.nextInt();
        // 5 x  1 = 5
        // 5 x 2 = 10..........
        for (int i =1; i<=20; i++){
            System.out.println(table + " x " +i + " =  " + table * i );
        }
    }
}
