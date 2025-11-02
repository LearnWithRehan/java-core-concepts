import java.util.Scanner;
public class RemoveSpaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.println("String without spaces: " + str.replaceAll("\\s",""));
    }
}