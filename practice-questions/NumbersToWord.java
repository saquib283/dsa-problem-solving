import java.util.Scanner;

public class NumbersToWord {
    public static void main(String[] args) {
        String ones[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :  ");
        int N=sc.nextInt();
        String tens[] = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"} ;
        String ans = "";
        int temp = N%100;
        N = N/100;
        if(temp<20){
            ans=ones[temp];
        }
        else{
            ans+=ones[temp%10];
            ans=tens[temp/10] + " " + ans;
        }
        if(N>0 && N%10 > 0){
            ans = ones[N%10] + " Houndred " + ans;
        }
        N=N/10;
        if(N>0){
            ans=ones[N] + " Thousand " + ans;
        }

        System.out.println(ans);
    }
}
