import java.util.*;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInput String:");
        String str = sc.nextLine();
        String ans = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            ans = ans + str.charAt(i);
        }
        System.out.println("\nReversed Word String is : " + ans + "\n");
    }
}
