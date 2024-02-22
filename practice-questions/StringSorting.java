import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int arr[] = new int[26];
        str=str.toLowerCase();
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int val = (int)(ch -'a');
            arr[val]++;
        }
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            while (arr[i]>0) {
                arr[i]--;
                System.out.println(ch);
            }
        }
    }
}
