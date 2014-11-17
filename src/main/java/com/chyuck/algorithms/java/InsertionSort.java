package com.chyuck.algorithms.java;

public final class InsertionSort {

    public static int[] sort(int[] array) throws IllegalArgumentException {
        if (array == null) throw new IllegalArgumentException("array is null");

        if (array.length <= 1) return array;

        for(int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentElement) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = currentElement;
        }

        return array;
    }
}
