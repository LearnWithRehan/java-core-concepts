import java.util.Scanner;

public class palindromeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:= ");
        String name = sc.nextLine();
        String temp = "";
        for (int i = name.length()-1; i>=0; i--){
            temp += name.charAt(i);
        }
        if (name.equals(temp)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
