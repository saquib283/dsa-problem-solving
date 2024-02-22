package Strings;
import java.util.*;
public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Hello World : From String 😘";
        String str = sc.nextLine();
        System.out.println(str1);
        System.out.println(str);
        // Length of the string
        System.out.println( "Length of the String :"+str.length());
        System.out.println("Character at Index 0 in String :"+str.charAt(0));
        System.out.println(str.compareTo(str1));

        // Trim string
        str.trim();
        str.toLowerCase();
        str.toUpperCase();
        str.isEmpty();
        str.toCharArray();
        str.substring(0, 5);
    }
}
