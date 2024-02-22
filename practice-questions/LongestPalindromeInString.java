import java.util.Scanner;

public class LongestPalindromeInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxlen =1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length()-1; j >= i; j--) {
                if(palin(str,i,j)){
                    maxlen=Math.max(maxlen, j-i+1);
                }
            }
        }

        System.out.println(maxlen);
    }

    static boolean palin(String str , int i , int j){
        while (i<j) {
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
