import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to Check Palindrome :");
        int number = sc.nextInt();
        boolean result = checkPalindrome(number);
        System.out.println(result);
        sc.close();
    }

    static boolean checkPalindrome(int number) {
        int originalNumber = number;
        int digit = (int) Math.log10(number) + 1;
        int reverseNumber = reverse(number, digit);
        System.out.println(reverseNumber);
        return originalNumber==reverseNumber;
    }

    private static int reverse(int number, int digit) {
        if (number <= 0) {
            return 0;
        }
        return reverse(number / 10, digit - 1) + number % 10 * (int)Math.pow(10, digit - 1);
    }
}
