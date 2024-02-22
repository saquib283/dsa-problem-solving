import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N==1){
            System.out.print(1);
        }
        else if(N>=2){
            System.out.print(1 + " " +1+" ");
            fib(1,1,N-2);
        }
    }

    static void fib(int a , int b , int N){
        if(N==0){
            return;
        }
        System.out.print(a+b);
        fib(b, a+b, N-1);
    }
}
