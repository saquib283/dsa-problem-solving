import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number : ");
        int num=sc.nextInt();

        boolean isArmstrong = checkArmStrong(num);

        if(isArmstrong){
            System.out.println("The Number is Armstrong");
        }
        else{
            System.out.println("The Number is Not Armstrong");

        }
         sc.close();
        
    }

    static boolean checkArmStrong (int number){
       int temp = number;
       int count = 0;

       while (temp!=0) {
        temp=temp/10;
        count++;
       }
       temp=number;
       int sum =0;
       while (temp!=0) {
        int digit = temp%10;
        sum+=Math.pow(digit, count);
        temp=temp/10;
       }
       return sum==number;
    }
}
