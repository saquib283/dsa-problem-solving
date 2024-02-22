import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String sentence = "I really lovee python programming";
        String result = removeDuplicateChars(sentence);
        System.out.println("Output: " + result);
    }

    public static String removeDuplicateChars(String sentence) {
        StringBuilder resultBuilder = new StringBuilder();
        String[] words = sentence.split(" ");

        for (String word : words) {
            StringBuilder wordBuilder = new StringBuilder();
            Set<Character> seen = new LinkedHashSet<>(); // Use LinkedHashSet to maintain order
            for (char c : word.toCharArray()) {
                if (!seen.contains(c)) {
                    wordBuilder.append(c);
                    seen.add(c);
                }
            }
            resultBuilder.append(wordBuilder).append(" ");
        }

        return resultBuilder.toString().trim();
    }
}
