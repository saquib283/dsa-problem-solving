import java.util.Scanner;

public class SumOfnumberToN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter Number : ");
            int number = sc.nextInt();
            int result = getSum(number);
            System.out.println(result);
        }
    }

    static int getSum(int number){
        if(number==0){
            return number;
        }
        return number + getSum(number-1);
    }
}
