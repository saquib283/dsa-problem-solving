import java.util.Scanner;

public class BinarySearchInRecursion {

    static void InputInArray(int arr[] , int size){
        if(size<0){
            return;
        }
        Scanner sc = new Scanner(System.in);
        InputInArray(arr, size-1);
        System.out.println("Enter "+size+" Element");
        arr[size] = sc.nextInt();

        
    }

    static void printArray(int[] arr , int size){
        if(size<0){
            return;
        }
        
        printArray(arr, size-1);
        System.out.print(arr[size]);
       
        
    }

    static boolean binarySearch(int arr[],int key, int low, int high ){
        // Check if low is less than or equal to high.
        if (low <= high) {
            // Calculate Mid element of Array.
            int mid = low+(high-low)/2;
            // Check Mid Element is Equal to Key.
            if(arr[mid]==key){
                return true;
            }
            // If key is Greater than Mid Element then , call Binary Search for low = mid+1 and high;
            else if(key > arr[mid]){
                return binarySearch(arr, key, mid+1, high);
            }
            // If key is Smaller than Mid Element then , call Binary Search for low and high = mid-1;
            else if (key < arr[mid]){
                return binarySearch(arr, key, low, mid-1);
            }
        }
        // If low is Greater than high , then Key is Not present and return false.
        return false;
    }

    

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Size of Array :");
            int size = sc.nextInt();
            int arr[] = new int[size];
            InputInArray(arr, size-1);
            System.out.println("Enter Key You Want to search in Array : ");
            int key = sc.nextInt();
            boolean exists = binarySearch(arr, key, 0,size-1);
            if(exists){
                System.out.println("Element is Present :");
            }
            else{
                System.out.println("Element is !NOT Present :");
            }

            

    }
}