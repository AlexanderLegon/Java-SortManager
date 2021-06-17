package com.sparta.alexanderlegon.SortManager;

import com.sparta.alexanderlegon.SortManager.generics.GenericBubbleSort;
import com.sparta.alexanderlegon.SortManager.sorters.BubbleSort;
import com.sparta.alexanderlegon.SortManager.sorters.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeBubbleTest {

    @Test
    @DisplayName("BubbleSortTest")
    public void checkBubbleSort(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] testArray = new int[]{26,1,85,2,4,78,6};
        int[] checkArray = new int[]{1,2,4,6,26,78,85};
        Assertions.assertArrayEquals(checkArray, bubbleSort.bubbleSort(testArray));
    }

    @Test
    @DisplayName("GenericBubbleSortTest")
    public void checkGenericBubbleSort(){
        GenericBubbleSort genericBubbleSort = new GenericBubbleSort();
        Integer[] testArray = new Integer[]{26,1,85,2,4,78,6};
        Integer[] checkArray = new Integer[]{1,2,4,6,26,78,85};
        Assertions.assertArrayEquals(checkArray, genericBubbleSort.bubbleSort(testArray));
    }

    @Test
    @DisplayName("MergeSortTest")
    public void checkMergeSort(){
        MergeSort mergeSort = new MergeSort();
        int[] testArray = new int[]{26,1,85,2,4,78,6};
        int[] checkArray = new int[]{1,2,4,6,26,78,85};
        Assertions.assertArrayEquals(checkArray, mergeSort.sortArray(testArray));
    }
}
