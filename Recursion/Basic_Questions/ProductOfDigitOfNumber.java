import java.util.Scanner;

public class ProductOfDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter Number :");
        int number = sc.nextInt();

       int result = getProduct(number);
       System.out.println(result);
    }

    static int getProduct(int number){
        if(number<=0){
            return 1;
        }
        return number%10 * getProduct(number/10);
    }
}
