import java.util.Arrays;

public class checkAnagram {
    public static void main(String[] args) {
       /*What is Anagram:-
        An Anagram ek aisa word ya phrase
         hota hai jo same letters ko rearrange
         karke bana ho
        */

      String a = "listen";
      String b = "silenttt";
      char[] c1 = a.toCharArray();
      char[] c2 = b.toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
      if (Arrays.equals(c1,c2)){
          System.out.println("Anagram");
      }else {
          System.out.println("Not Anagram");
      }

    }
}
