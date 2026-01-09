import java.util.Scanner;

public class PalindromeIgnoreSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().replaceAll("\\s","")
                .toLowerCase();
        String rev = new StringBuilder(str)
                .reverse().toString();
        System.out.println(str.equals(rev)
        ? "palindrome" : "Not palindrome");
    }
}
