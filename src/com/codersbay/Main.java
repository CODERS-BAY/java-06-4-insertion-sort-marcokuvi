package com.codersbay;

import java.util.Arrays;

public class Main {

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int startOfUnsorted = 1; startOfUnsorted < n; startOfUnsorted++) {
            int nextUnsortedElement = array[startOfUnsorted];
            int greatestSortedElementIndex = startOfUnsorted - 1;
            while ((greatestSortedElementIndex > -1) && (array[greatestSortedElementIndex] > nextUnsortedElement)) {
                array[greatestSortedElementIndex + 1] = array[greatestSortedElementIndex];
                greatestSortedElementIndex--;
            }
            array[greatestSortedElementIndex + 1] = nextUnsortedElement;
        }
    }

    public static void main(String[] a) {

        int[] unsortedArray = {9, 14, 3, 2, 43, 11, 58, 22};
        insertionSort(unsortedArray);

        System.out.println(Arrays.toString(unsortedArray));
        }
    }