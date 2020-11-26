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

    //реализация сортировки пузырьком
    public static int[] bubbleSort(int[] array) {
        int i = 0;
        int goodPairsCounter = 0;
        do {
            if (array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                goodPairsCounter = 0;
            } else {
                goodPairsCounter++;
            }
            i++;
            if (i == array.length - 1) {
                i = 0;
            }
        } while (goodPairsCounter != array.length - 1);
        return array;
    }

}
