import java.util.Scanner;

public class SubstringReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String oldString = sc.nextLine();
        String newString = sc.nextLine();
        String ans = original.replace(oldString, newString);
        System.out.println(ans);
    }
}
