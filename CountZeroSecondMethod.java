import java.util.Scanner;

public class CountZeroSecondMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter a number:");
        int number = sc.nextInt();
        int count = countZeros(number);
        System.out.println("\n Number of zeros in " + number + " is : " + count);
    }
    static int countZeros(int number){
        return actualCount(number,0);
    }
    private static int actualCount(int number , int count){
        if(number<=0){
            return count;
        }
        if(number%10==0){
            count=count + 1;
        }
        return actualCount(number/10, count);
    }
}
