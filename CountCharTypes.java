import java.util.Scanner;

public class CountCharTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        int letter =0,digit=0,special=0;
        for (char c:str.toCharArray()){
            if (Character.isLetter(c))
                letter++;
            else if (Character.isDigit(c))
                digit++;
            else special++;
        }
        System.out.println("Letters=" + letter +", " +
                "Digit="+digit+", "+
                "Special characters="+special
        );
    }
}