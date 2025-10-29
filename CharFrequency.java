import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c:str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println("Character frequency: " + map);
    }
}