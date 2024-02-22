 package recursionONarray;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnArrayListOnMultipleOccurance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,2,4,5,5,6,6,7};
        ArrayList <Integer> list = new ArrayList<>();
        list=searchArrayList(arr,5,0);
        System.out.println(list);
    }

    static ArrayList<Integer> searchArrayList(int arr[],int target , int index){
        ArrayList <Integer> list = new ArrayList<>();
        if(index>=arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList <Integer> belowResult = searchArrayList(arr, target, index+1);
        list.addAll(belowResult);
        return list;
    }
    
}