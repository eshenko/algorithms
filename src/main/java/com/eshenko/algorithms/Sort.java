package com.eshenko.algorithms;

public class Sort {

    //реализация сортировки выбором
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            int smallest = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < smallest) {
                    smallest = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = smallest;
        }
    }

}
