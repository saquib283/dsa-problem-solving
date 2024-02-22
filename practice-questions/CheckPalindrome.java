import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Number :");
        int number = sc.nextInt();
        boolean isPalindrome = checkPalindrome(number);
        System.out.println(isPalindrome);
    }

    static boolean checkPalindrome(int n) {
        int originalNumber = n;
        int digit = (int) Math.log10(n)+1;
        int reverseNumber = reverseNumber(n,digit);
        System.out.println(reverseNumber);
        return originalNumber == reverseNumber;
    }

    static int reverseNumber(int number ,int digit) {
        if (number<=0) {
            return 0;
        }
        return (int) (number%10 * Math.pow(10, digit-1) + reverseNumber(number/10 , digit-1));
    }

}