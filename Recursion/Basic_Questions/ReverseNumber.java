public class ReverseNumber {
    public static int reverse(int number) {
        if (number == 0) {
            return 0;
        } else {
            int lastDigit = number % 10;
            int remainingNumber = number / 10;

            // Recursively reverse the remaining digits and build the reversed number
            int reversedNumber = reverse(remainingNumber);

            // Calculate the number of digits in the remainingNumber
            int count = (int) Math.log10(remainingNumber) + 1;

            // Construct the reversed number by moving digits to the left
            return reversedNumber + lastDigit * (int) Math.pow(10, count);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int originalNumber = 12345;
        int reversed = reverse(originalNumber);
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversed);
    }
}
