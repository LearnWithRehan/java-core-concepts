import java.util.Scanner;

public class QuitentRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend number:- ");
        int dividend = sc.nextInt();
        System.out.println("Enter divisor number:- ");
        int divisor = sc.nextInt();

        int quitent = dividend / divisor;
        int remain = dividend % divisor;

        System.out.println("Quitent:- " + quitent);
        System.out.println("Remainder:- " +remain);
    }
}
