package com.devdutt.searching;
/*
     Best-case complexity is O(1):- where the element is found at the middle index.
     Worst-case complexity is O(log2n).
*/

public class BinaySearch {
    public static void searchBinary(int[] arr, int first, int last, int key) {
        if (first > last) {
            System.out.println("Element not found");
        }
        // calculate the mid element;
        int mid = first + (last - first) / 2;
        while (first <= last) {
            if (arr[mid] == key) {
                System.out.println(key + " Element found at index " + mid);
                break;
            } else if (arr[mid] < key) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
            mid = first + (last - first) / 2;
        }//while
    }//method

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int key = 60;
        int last = arr.length - 1;
        searchBinary(arr, 0, last, key);
    }//main
}//class
