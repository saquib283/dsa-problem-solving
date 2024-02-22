package recursionONarray;
import java.util.Scanner;

public class LinearSearchInRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array You Want To create :");
        int size =sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<=arr.length-1;i++){
            System.out.println("Enter "+i+" Element :");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Element You Want to Search in the array :");
        int element = sc.nextInt();

        Boolean result = searchArray(arr,element,0); 
        System.out.println(result);
    }

    private static Boolean searchArray(int arr[] , int key, int index){
        if(index > 0 || index >= arr.length-1){
            return false;
        }
        if(arr[index]==key){
            return true;
        }

        Boolean result = searchArray(arr, key, index+1);
        return result;

    }
}