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
        BubbleSort bS = new BubbleSort();
        int[] testArray = new int[]{26,1,85,2,4,78,6};
        int[] checkArray = new int[]{1,2,4,6,26,78,85};
        Assertions.assertArrayEquals(checkArray, bS.bubbleSort(testArray));
    }

    @Test
    @DisplayName("GenericBubbleSortTest")
    public void checkGenericBubbleSort(){
        GenericBubbleSort bS = new GenericBubbleSort();
        Integer[] testArray = new Integer[]{26,1,85,2,4,78,6};
        Integer[] checkArray = new Integer[]{1,2,4,6,26,78,85};
        Assertions.assertArrayEquals(checkArray, bS.bubbleSort(testArray));
    }

    @Test
    @DisplayName("MergeSortTest")
    public void checkMergeSort(){
        MergeSort mS = new MergeSort();
        int[] testArray = new int[]{26,1,85,2,4,78,6};
        int[] checkArray = new int[]{1,2,4,6,26,78,85};
        Assertions.assertArrayEquals(checkArray, mS.sortArray(testArray));
    }
}
