public class WordCountRecursive
{
    // Recursive function to count words
    static int countWords(String str, int index, boolean inWord) {
        // Base case: end of string
        if (index == str.length())
            return inWord ? 1 : 0;

        char ch = str.charAt(index);

        // If current char is space
        if (ch == ' ')
            return (inWord ? 1 : 0) + countWords(str, index + 1, false);

        // If character is part of a word
        return countWords(str, index + 1, true);
    }

    public static void main(String[] args) {
        String sentence = "Java is a powerful language";
        int wordCount = countWords(sentence.trim(), 0, false);

        System.out.println("Sentence: " + sentence);
        System.out.println("Total words: " + wordCount);
    }
}
