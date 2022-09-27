package com.devdutt.searching;

public class BinarySearchRecursion {
    public static int searchBinaryByRecursion(int[] arr, int first, int last, int key) {
        int mid = first + (last - first) / 2;
        if (first > last) {
            return -1;
        } else {
            if (arr[mid] == key) {
                return mid;
            }//if
        }//else
        if (arr[mid] < key) {
            return searchBinaryByRecursion(arr, mid + 1, last, key);
        } else {
            return searchBinaryByRecursion(arr, first, mid - 1, key);
        }
    }//method

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int key = 30;
        int last = arr.length - 1;
        int result = searchBinaryByRecursion(arr, 0, last, key);
        if (result < 0) {
            System.out.println("Element not found");
        } else {
            System.out.println(key + " Element found at index: " + result);
        }
    }
}
