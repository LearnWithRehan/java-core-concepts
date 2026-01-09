import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:- ");
        String str = sc.nextLine();
        char result = 0;
        for (int i =0; i<str.length();  i++){
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                result = ch;
                break;
            }
        }
        if (result != 0){
            System.out.println("First non-repeationg character:- " + result);
        }else {
            System.out.println("No non-repeation character found");
        }
    }
}
