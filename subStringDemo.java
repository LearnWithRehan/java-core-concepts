import java.util.Scanner;

public class subStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:- ");
        String s = sc.nextLine();
        System.out.println("Enter start position");
        int start = sc.nextInt();
        System.out.println("Enter end position");
        int end = sc.nextInt();
        System.out.println(s.substring(start,end));
    }
}
