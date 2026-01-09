import java.util.Scanner;

public class CountVowelsRecursion {
    static int countVowel(String str, int index){
        if (index == str.length())
            return 0;
        char ch = Character.toLowerCase(str.charAt(index));
        int count = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1: 0;
        return count + countVowel(str, index + 1);
    }
    public static void main(String[] args) {
        //total vowel is a,e,i,o,u
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:- ");
        String str = sc.nextLine();
        System.out.println("Number of Vowels:- " + countVowel(str,0));
    }
}
