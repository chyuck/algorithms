package com.chyuck.algorithms.java;

public class SelectionSort {

    public static int[] sort(int[] array) throws IllegalArgumentException{
        if (array == null) throw new IllegalArgumentException("array is null");

        if (array.length <= 1) return array;

        for (int i = 0; i < array.length; i++) {

            int minValueIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minValueIndex])
                    minValueIndex = j;
            }

            int temp = array[i];
            array[i] = array[minValueIndex];
            array[minValueIndex] = temp;
        }

        return array;
    }
}
