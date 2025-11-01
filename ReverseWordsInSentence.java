import java.util.Scanner;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence ");
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words){
            sb.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println("Reversed words sentence: " + sb.toString().trim());
    }
}