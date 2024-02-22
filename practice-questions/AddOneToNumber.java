import java.util.Arrays;

public class AddOneToNumber {
    public static void main(String[] args) {
        int[] number = {1, 2, 9}; // Example input: [1, 2, 3]
        int[] result = addOne(number);
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 4]
    }

    public static int[] addOne(int[] number) {
        int n = number.length;
        int carry = 1; // Initialize the carry to 1 to add one to the number

        for (int i = n - 1; i >= 0; i--) {
            int sum = number[i] + carry;
            number[i] = sum % 10; // Update the current digit with the sum modulo 10
            carry = sum / 10; // Update the carry for the next iteration
        }

        // If there's still a carry after the loop (e.g., 999 + 1 = 1000), we need to expand the array
        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }

        return number;
    }
}
