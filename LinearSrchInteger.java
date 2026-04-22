import java.util.Scanner;

public class LinearSrchInteger {
    public static void main(String[] args) {
        //from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter Elements:- ");
        for (int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        //search item
        System.out.println("select Item");
        int item = sc.nextInt();
        for (int i = 0; i<array.length; i++){
            if (array[i] == item){
                System.out.println("Index Position is: " + i);
            }
        }
    }
}
