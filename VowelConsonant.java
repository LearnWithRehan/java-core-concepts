import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        char c = sc.nextLine().charAt(0);
        //vowel:- a,e,i,o,u
        if (c == 'a' ||  c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println(c + " is Vowel");
        }else {
            System.out.println(c + " is Consonant");
        }
    }
}
