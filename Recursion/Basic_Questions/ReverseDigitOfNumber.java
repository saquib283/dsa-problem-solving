import java.util.Scanner;

public class ReverseDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Number :");
        int number = sc.nextInt();
        printReverse(number);
    }

    static void printReverse(int number){
        if(number<=0){
            return;
        }
        int remainder = number%10;
        System.out.print(remainder + " ");
        printReverse(number/10);
    }
}
