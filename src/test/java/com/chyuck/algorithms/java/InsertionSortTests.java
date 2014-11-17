package com.chyuck.algorithms.java;

import junit.framework.TestCase;
import org.junit.Assert;

public class InsertionSortTests extends TestCase {

    public void testSort() throws Exception {
        // arrange
        int[] array = new int[] { 5,3,8,4,3,11 };

        // act
        int[] result = InsertionSort.sort(array);

        // assert
        Assert.assertArrayEquals(new int[]{3, 3, 4, 5, 8, 11}, result);
    }

    public void testSort_EmptyArray() throws Exception {
        // arrange
        int[] array = new int[] {  };

        // act
        int[] result = InsertionSort.sort(array);

        // assert
        Assert.assertArrayEquals(new int[]{}, result);
    }
}