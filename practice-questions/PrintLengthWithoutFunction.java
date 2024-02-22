import java.util.Scanner;

public class PrintLengthWithoutFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] charArray = str.toCharArray();
        int length=0;
        for(char c : charArray){
            length++;
        }
        System.out.println(length);
        System.out.println(str.getBytes());
        System.out.println(str.compareTo("apple"));
       




        StringBuilder st = new StringBuilder(sc.nextLine());
        st.append('a');
        st.append("ssssss");
        System.out.println(st);
    }
}
