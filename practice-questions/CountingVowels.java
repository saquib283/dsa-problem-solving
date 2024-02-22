import java.util.Scanner;

public class CountingVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Input a word or Sentence : ");
        String word = sc.nextLine();
        sc.close();
        int count = getNumberOfVowels(word);
        System.out.println("The Count of Vowels are : " + count);
    }

    // private static int getNumberOfVowels1(String word) {
    //     String vowels = "aeiou";
    //     int count = 0;
    //     for (int i = 0; i < word.length(); i++) {
    //         for (int j = 0; j < vowels.length(); j++) {
    //             if (word.charAt(i) == vowels.charAt(j) || word.charAt(i) == Character.toLowerCase(vowels.charAt(j))) {
    //                 count += 1;    
    //             }
    //         }
    //     }
    //     return count;
    // }

    private static int getNumberOfVowels(String word) {
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (word.charAt(i) == vowels.charAt(j)) {
                    count += 1;
                }
            }
        }
        return count;
    }
    

}
