package Strings.StringBuilder;
import java.util.*;

public class Bulid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder newStr = new StringBuilder(str);
        newStr.append(" + Appended Text...");
        System.out.println(newStr);
        

        

    }
}
