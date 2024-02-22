import java.util.HashMap;
import java.util.Scanner;

public class EliminateDuplicateValues {
    public static void main(String[] args) {
        System.out.println("Enter Size of the array :  ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter "+i+"Element : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(!hs.containsKey(arr[i])){
                hs.put(arr[i], 1);
            }
            else{
                hs.put(arr[i], hs.get(arr[i])+1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(hs.get(arr[i])==1){
                System.out.print(arr[i] + " ");
            }
        }
    }

}
