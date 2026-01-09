import java.util.Scanner;

public class LexicographicSubstrings {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k), largest = smallest;
        for (int i = 1; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            if (sub.compareTo(smallest) < 0) smallest = sub;
            if (sub.compareTo(largest) > 0) largest = sub;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User se input lene ke liye prompt
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Enter substring length: ");
        int k = sc.nextInt();

        System.out.println("\nResult:");
        System.out.println(getSmallestAndLargest(s, k));

        sc.close();
    }
}
