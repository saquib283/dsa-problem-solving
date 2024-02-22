import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number :");
            int number = sc.nextInt();

            int result = factorial(number);
            System.out.println(result);
        }
    }

    static int factorial(int number){
        if(number<0 || number==0){
            return 1;
        }
        return number*factorial(number-1);
    }
}
