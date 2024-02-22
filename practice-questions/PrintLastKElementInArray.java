import java.util.Scanner;

public class PrintLastKElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Size Of the Array :");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("\t");
            arr[i]=sc.nextInt();
        }
        System.out.print("\nEnter How Much Element from last You want to print : ");
        int n = sc.nextInt();
        sc.close();
        printLastKelement(arr,n);

    }

    static void printLastKelement(int arr[],int n){

        int length = arr.length;
        int notToPrint = length-n;

        if(notToPrint<0){
            System.out.println("Enter Valid Index  , Highest Index is "+(length-1));
            return;
        }

        for (int i = notToPrint; i < arr.length; i++) {

            // if(i<notToPrint){
            //     continue;
            // }
            // else{
            //     System.out.print("\n"+arr[i]);
            // }

            System.out.println(arr[i]);
            
        }

    }

}
