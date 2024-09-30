package de.telran.hw_6_24sept_QuickSortRevers;

import java.util.Arrays;

public class QuickSortRevers {
    public static void main(String[] args) {
//        Напишите  метод для быстрой сортировки массива целых чисел (Quick sort)
//        в порядке убывания значений их элементов.

        int[] array = {7, -2, 4, 1, 6, 5, 0, -4, 2};
        quickSortRecursive(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public static void quickSortRecursive(int[] array, int start, int end) {
        if (start >= end) { // условие выходы из рекурсии
            //System.out.println("start "+ start + " end " + end);
            return;
        }
        int indexPivot = partition(array, start, end);
        quickSortRecursive(array, start, indexPivot - 1);
        quickSortRecursive(array, indexPivot + 1, end);
    }
    private static int partition(int[] array, int partitionStart, int partitionEnd) {
        int pivot = array[partitionEnd]; //choose pivot element
       //  System.out.println("pivot = "+pivot);
        int index = partitionStart;

        for (int i = partitionStart; i < partitionEnd; i++) {
            if(array[i] >= pivot) {
                swap(array, i, index);
                index++;
            }
        }
        swap(array, partitionEnd, index);

        return index;
    }

    private static void swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
    }
}
