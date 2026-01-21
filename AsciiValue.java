import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
        int ascii = ch;
        System.out.println("ASCII VALUE:- " + ascii);
    }
}
