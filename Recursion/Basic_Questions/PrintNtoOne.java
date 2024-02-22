import java.util.Scanner;

public class PrintNtoOne {
    public static void main(String[] args) {
        int number ;
        Scanner sc = new Scanner(System.in);
        number=sc.nextInt();

        printNtoOne(number);
    }
    static void printNtoOne(int number){
        if(number>0){
            System.out.println(number);
            printNtoOne(number-1);
        }
        return;
    }
}
