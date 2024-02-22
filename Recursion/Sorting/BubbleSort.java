package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 1 };
        System.out.println("The Given array is :" + " " + Arrays.toString(arr));
        // bubblesort(arr);
        bubble1(arr, arr.length - 1, 0);
        System.out.println("The Sorted array is :" + " " + Arrays.toString(arr));

    }

    private static void bubble(int arr[], int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                // swap(arr, c, c + 1);
                int temp = arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr, r, c + 1);
        } else {
            bubble(arr, r - 1, c);
        }
    }
    private static void bubble1(int arr[], int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                swap(arr, c, c + 1);
            }
            bubble(arr, r, c + 1);
        } else {
            bubble(arr, r - 1, 0); // Corrected this line
        }
    }
    


    private static void bubblesort(int[] arr) {
        sortArray(arr, 0, 1, arr.length - 1);
    }

    private static void swap(int arr[], int currentIndex, int nextIndex) {
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[nextIndex];
        arr[nextIndex] = temp;
    }

    private static void sortArray(int[] arr, int i, int next, int end) {
        if (i >= end) {
            return;
        }
        if (i < next) {

            if (arr[i] > arr[next]) {
                swap(arr, i, next);
                sortArray(arr, i + 1, next, end);
            } else {
                sortArray(arr, i, next + 1, end);
            }

        }

    }

}
