import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <=N; i++) {
            int temp = 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp+=2;
            }
            temp-=4;
            for (int j = 1; j < i; j++) {
                System.out.print(temp+" ");
                temp-=2;
            }
            System.out.println();
        }
        
    }
}
