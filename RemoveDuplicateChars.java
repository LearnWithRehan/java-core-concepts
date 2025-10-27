import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray())
            set.add(c);
        StringBuilder sb = new StringBuilder();
        for (char c : set)
            sb.append(c);
        System.out.println("String without duplicates: " + sb);
    }
}