import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        //Total vowel is = a,e,i,o,u
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:- ");
        String str = sc.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("Number of  Vowels:- " + count);
    }

}