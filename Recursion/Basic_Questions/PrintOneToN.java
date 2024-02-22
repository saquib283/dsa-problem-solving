import java.util.Scanner;

public class PrintOneToN {
    public static void main(String[] args) {
        int number ;
        Scanner sc = new Scanner(System.in);
        number=sc.nextInt();

        printOneToN(number);
    }

    static void printOneToN(int number){
        if(number<=0){
            return;
        }
        printOneToN(number-1);
        System.out.print(number+" ");
    }
}