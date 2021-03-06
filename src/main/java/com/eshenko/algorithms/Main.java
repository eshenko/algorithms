package com.eshenko.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 * O - сложность алгоритма или скорость выполнения алгоритма,
 * показывает скорость роста времени выполнения алгоритма (роста количества операций) при увеличении входных данных.
 *
 * Принцип РАЗДЕЛЯЙ И ВЛАСТВУЙ - рекурсивный подход, при котором задача делится на более простые задачи,
 *     те в свою очередь на еще более простые, пока задачи не станут элементарными,
 *     далее результат выполнения всех задач объединяется.
 *
 * Формирование РЕКУРСИИ - определяется базовый элемент (элементарная задача) и рекурсивный элемент,
 *     который необходимо делить до получения базового элемента.
 *
 * O(log n) - при каждой итерации отсекается половина элементов.
 *     БИНАРНЫЙ ПОИСК - работает только с отсортированным списком/массивом,
 *     список делится пополам, если искомое значение больше среднего элемента,
 *     то отсекается левая часть, если меньше, то правая,
 *     далее оставшаяся половина делится пополам и также искомое значение сравнивается со средним элементом,
 *     так до тех пор, пока искомый элемент не будет найден.
 *
 * O(n) - перебор всех элементов.
 *     ЛИНЕЙНЫЙ ПОИСК
 *
 * O(n log n) - БЫСТРАЯ СОРТИРОВКА -
 *              СОРТИРОВКА СЛИЯНИЕМ (но константа больше, поэтому быстрая сортировка лучше) -
 *
 * O(n^2) - цикл в цикле.
 *     СОРТИРОВКА ВЫБОРОМ - находится наибольший элемент и переносится в конец массива (если сортировка по возрастанию),
 *     далее находится наибольший элемент, не учитывая последний, и переносится на предпоследнее место,
 *     так до тех пор пока не останется один элемент.
 *     (первый цикл перемещает элементы и запускает вложенный цикл, вложенный цикл ищет максимальный элемент).
 *
 * O(n!) - задача о комивояжере
 *
 */

public class Main {
    public static void main(String[] args) {

        //своя реализация бинарного поиска
        int[] sortedArray = {-3, 0, 2, 5, 7, 10, 1000};
        System.out.println(Search.myBinarySearch(7, sortedArray) + "\n");

        //бинарный поиск с помощью метода класса Arrays
        int[] sortedArray2 = {-3, 0, 2, 5, 7, 10, 1000};
        System.out.println(Arrays.binarySearch(sortedArray2, 7) + "\n");

        //бинарный поиск с помощью метода класса Collections
        List<Integer> sortedList = Arrays.asList(-3, 0, 2, 5, 7, 10, 1000);
        System.out.println(Collections.binarySearch(sortedList, 7) + "\n");

        //своя реализация сортировки выбором
        int[] unsortedArray = {3, 0, 10, -4, 500, 7};
        Sort.selectionSort(unsortedArray);
        System.out.println("selectionSort");
        System.out.println(Arrays.toString(unsortedArray) + "\n");

        //своя реализация сортировки пузырьков
        int[] unsortedArray3 = {3, 0, 10, -4, 500, 7};
        Sort.bubbleSort(unsortedArray3);
        System.out.println("bubbleSort");
        System.out.println(Arrays.toString(unsortedArray3) + "\n");

        //сортировка с помощью метода класса Arrays
        int[] unsortedArray2 = {3, 0, 10, -4, 500, 7};
        Arrays.sort(unsortedArray2);
        System.out.println(Arrays.toString(unsortedArray2) + "\n");

        //сортировка с помощью метода класса Collections
        List<Integer> unsortedList = Arrays.asList(3, 0, 10, -4, 500, 7);
        Collections.sort(unsortedList);
        System.out.println(unsortedList.toString() + "\n");

        //нахождение факториала через рекурсию
        System.out.println(Other.fact(20) + "\n");

        //нахождение факториала через цикл
        System.out.println(Other.factLoop(20) + "\n");

    }

}
