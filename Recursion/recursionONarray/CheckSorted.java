package recursionONarray;

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the size: ");
        int size = s.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nEnter " + i + " Element : ");
            arr[i] = s.nextInt();
        }

        boolean result = checkSorted(arr, 0);
        System.out.println(result);
    }

    static boolean checkSorted(int[] arr, int i) {
        if(i>=arr.length-1){
            return true;
        }
        return checkEachIndex(arr, i) && checkSorted(arr, i+1);
    }

    static boolean checkEachIndex(int arr[] ,int i){
        if(arr[i]<arr[i+1]){
            return true;
        }
        return false;
    }
}
