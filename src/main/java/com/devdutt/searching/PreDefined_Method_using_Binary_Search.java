package com.devdutt.searching;

import java.util.Arrays;

public class PreDefined_Method_using_Binary_Search {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int key = 30;
        int result = Arrays.binarySearch(arr, key);
        if (result < 0)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index:- " + result);
    }//main
}//class
