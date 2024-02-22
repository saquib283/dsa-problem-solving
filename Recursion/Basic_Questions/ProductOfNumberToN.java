import java.util.Scanner;

public class ProductOfNumberToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();

        int result = getProduct(number);
        System.out.println(result);
    }

    static int getProduct(int number) {
        if (number <= 1) {
            return number;
        }

        return number* getProduct(number - 1);
    }
}
