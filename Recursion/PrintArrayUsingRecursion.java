public class PrintArrayUsingRecursion {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7};
        int size = arr.length-1;
        printArray(arr , size );
    };

    static void printArray(int[] arr , int size){
        if(size<0){
            return;
        }
        printArray(arr, size-1);
        System.out.print(arr[size]);
        
    }

    // static void printArray(int arr[],int size , int n){
    //     if(n==size){
    //         return ;
    //     }
    //     System.out.print(" "+arr[n]);
    //     printArray(arr, size, n+1);

    // }
}
