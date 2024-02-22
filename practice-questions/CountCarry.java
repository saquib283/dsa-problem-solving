import java.util.Scanner;

public class CountCarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter First Number : ");
        int num1 = sc.nextInt();
        System.out.print("\nEnter First Number : ");
        int num2 = sc.nextInt();
        int carry = countCarray(num1, num2);
        System.out.println("Carry :" + carry);

    }

    static int countCarray(int n1, int n2) {

        int carry = 0;
        int sum = 0;
        int CarryOperation = 0;
        int num1 = n1;
        int num2 = n2;
        while (num1 > 0 || num2 > 0) {
            sum = num1 % 10 + num2 % 10 + carry;
            carry = sum / 10;
            CarryOperation += carry;
            num1 = num1 / 10;
            num2 = num2 / 10;
        }
        return CarryOperation;

    }
}
