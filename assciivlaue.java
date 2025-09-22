import java.util.Scanner;

public class assciivlaue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        char c = sc.next().charAt(0);
        int asscii = c;
        System.out.println(asscii);
    }
}
