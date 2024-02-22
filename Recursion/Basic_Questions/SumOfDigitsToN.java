import java.util.Scanner;

public class SumOfDigitsToN {
    public static void main(String[] args) {
        int number;
        System.out.print("\n Enter Number : ");
        Scanner sc = new Scanner(System.in);
        number=sc.nextInt();
        int result = getSumOfDigits(number);
        System.out.println(result);
    }
    static int getSumOfDigits(int number){
        if(number ==0){
            return 0;
        }

        return number%10 + getSumOfDigits(number/10);
    }
}
