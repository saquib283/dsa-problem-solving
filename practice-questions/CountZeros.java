import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int count = countZeros(number,0);
        System.out.println("Number of zeros in " + number + " is : " + count);

    }

    static int countZeros(int number ,int count){
        if(number<=0){
            return count;
        }
        if (number%10==0) {
            count=count+1;
        }
        return countZeros(number/10, count);
    }
}
