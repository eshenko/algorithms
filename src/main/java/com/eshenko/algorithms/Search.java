package com.eshenko.algorithms;

public class Search {

    //реализация бинарного поиска
    public static int myBinarySearch(int key, int[] sortedArray) {
        int index = -1;
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

}
