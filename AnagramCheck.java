import java.util.Scanner;
import java.util.Arrays;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().replaceAll("\\s","").toLowerCase();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().replaceAll("\\s","").toLowerCase();
        if(str1.length() != str2.length()) {
            System.out.println("Not an anagram");
            return;
        }
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b) ? "Anagram" : "Not an anagram");
    }
}