import java.util.Scanner;

public class ReverseStringRecurstion {
    //recursion
    static String reverse(String str){
        if (str.isEmpty())
            return str;
        return reverse(str.substring(1))+ str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:- ");
        String name = sc.next();
        System.out.println("Reverse String:- " + reverse(name));
    }
}
