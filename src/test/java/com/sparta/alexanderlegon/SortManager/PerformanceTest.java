package com.sparta.alexanderlegon.SortManager;

import com.sparta.alexanderlegon.SortManager.generics.GenericBubbleSort;
import com.sparta.alexanderlegon.SortManager.printer.Printer;
import com.sparta.alexanderlegon.SortManager.sorters.BubbleSort;
import com.sparta.alexanderlegon.SortManager.sorters.MergeSort;
import com.sparta.alexanderlegon.SortManager.sorters.MainBinaryTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class PerformanceTest {

    public static int[] getArrays(int number) {

        int[] array = new int[number];
        Random ran = new Random();

        for (int i = 0; i < number; i++) {
            int temp = ran.nextInt(number *2);
            if (Arrays.stream(array).anyMatch(j -> j == temp)) {
                i--;
            } else {
                array[i] = temp;
            }
        }
        return array;
    }

    @Test
    @DisplayName("AverageBubbleSortTestPerformance")
    public void checkAverageBubbleSorterPerformance() {
        long startBS100;
        long endBS100;
        long startBS1000;
        long endBS1000;
        long startBS10000;
        long endBS10000;
        long outputBS100 = 0;
        long outputBS1000 = 0;
        long outputBS10000 = 0;
        int iteration = 20;

        for(int i = 0; i < iteration;i++){

            int[] array100 = getArrays(100);
            int[] array1000 = getArrays(1000);
            int[] array10000 = getArrays(10000);

        BubbleSort bS = new BubbleSort();
        startBS100 = System.nanoTime();
        bS.sortArray(array100);
        endBS100 = System.nanoTime();
        outputBS100 = endBS100 - startBS100 + outputBS100;
        startBS1000 = System.nanoTime();
        bS.sortArray(array1000);
        endBS1000 = System.nanoTime();
        outputBS1000 = endBS1000 - startBS1000 + outputBS1000;
        startBS10000 = System.nanoTime() ;
        bS.sortArray(array10000);
        endBS10000 = System.nanoTime();
        outputBS10000 = endBS10000 - startBS10000 + outputBS10000;
        }
        Printer.print("Average time to bubbleSort 100 : " + (outputBS100)/iteration + "ns");
        Printer.print("Average time to bubbleSort 1000 : " + (outputBS1000)/iteration + "ns");
        Printer.print("Average time to bubbleSort 10000 : " + (outputBS10000)/iteration + "ns");
    }

    @Test
    @DisplayName("AverageMergeSortTestPerformance")
    public void checkAverageMergeSorterPerformance() {

        long startMS100 ;
        long endMS100;
        long startMS1000;
        long endMS1000;
        long startMS10000;
        long endMS10000;
        long outputMS100 = 0;
        long outputMS1000 = 0;
        long outputMS10000 = 0;
        int iteration = 20;

        for(int i =0; i <iteration;i++){

            int[] array100 = getArrays(100);
            int[] array1000 = getArrays(1000);
            int[] array10000 = getArrays(10000);

            MergeSort mS = new MergeSort();
            startMS100 = System.nanoTime();
            mS.sortArray(array100);
            endMS100 = System.nanoTime();
            outputMS100 = endMS100 - startMS100 + outputMS100;
            startMS1000 = System.nanoTime();
            mS.sortArray(array1000);
            endMS1000 = System.nanoTime();
            outputMS1000 = endMS1000 - startMS1000 + outputMS1000;
            startMS10000 = System.nanoTime();
            mS.sortArray(array10000);
            endMS10000 = System.nanoTime();
            outputMS10000 = endMS10000 - startMS10000 + outputMS10000;
        }
        Printer.print("Average time to mergeSort 100 : " + (outputMS100)/iteration + "ns");
        Printer.print("Average time to mergeSort 1000 : " + (outputMS1000)/iteration + "ns");
        Printer.print("Average time to mergeSort 10000 : " + (outputMS10000)/iteration + "ns");
    }
    @Test
    @DisplayName("AverageGenericBubbleSortTestPerformance")
    public void checkAverageGenericBubbleSorterPerformance() {
        long startGBS100 ;
        long endGBS100;
        long startGBS1000;
        long endGBS1000;
        long startGBS10000;
        long endGBS10000;
        long outputGBS100 = 0;
        long outputGBS1000 = 0;
        long outputGBS10000 = 0;
        int iteration = 20;

        for(int i =0; i <iteration;i++){

            int[] array100 = getArrays(100);
            int[] array1000 = getArrays(1000);
            int[] array10000 = getArrays(10000);
            Integer[] g100 = Arrays.stream( array100 ).boxed().toArray( Integer[]::new );
            Integer[] g1000 = Arrays.stream( array1000 ).boxed().toArray( Integer[]::new );
            Integer[] g10000 = Arrays.stream( array10000 ).boxed().toArray( Integer[]::new );

            GenericBubbleSort gBS = new GenericBubbleSort();
            startGBS100 = System.nanoTime();
            gBS.sortArray(g100);
            endGBS100 = System.nanoTime();
            outputGBS100 = endGBS100 - startGBS100 + outputGBS100;
            startGBS1000 = System.nanoTime();
            gBS.sortArray(g1000);
            endGBS1000 = System.nanoTime();
            outputGBS1000 = endGBS1000 - startGBS1000 + outputGBS1000;
            startGBS10000 = System.nanoTime();
            gBS.sortArray(g10000);
            endGBS10000 = System.nanoTime();
            outputGBS10000 = endGBS10000 - startGBS10000 + outputGBS10000;
        }
        Printer.print("Average time to genericBubbleSort 100 : " + (outputGBS100)/iteration + "ns");
        Printer.print("Average time to genericBubbleSort 1000 : " + (outputGBS1000)/iteration + "ns");
        Printer.print("Average time to genericBubbleSort 10000 : " + (outputGBS10000)/iteration + "ns");
    }

    @Test
    @DisplayName("AverageBinarySortTestPerformance")
    public void checkAverageBinarySorterPerformance() {
        long startBT100;
        long endBT100;
        long startBT1000;
        long endBT1000;
        long startBT10000;
        long endBT10000;
        long outputBT100 = 0;
        long outputBT1000 = 0;
        long outputBT10000 = 0;
        int iteration = 20;

        for(int i = 0; i < iteration;i++){

            int[] array100 = getArrays(100);
            int[] array1000 = getArrays(1000);
            int[] array10000 = getArrays(10000);
            MainBinaryTree mBT1 = new MainBinaryTree();
            MainBinaryTree mBT2 = new MainBinaryTree();
            MainBinaryTree mBT3 = new MainBinaryTree();
            mBT1.addElements(array100);
            mBT2.addElements(array1000);
            mBT3.addElements(array10000);

            startBT100 = System.nanoTime();
            mBT1.getSortedTreeAsc();
            endBT100 = System.nanoTime();
            outputBT100 = endBT100 - startBT100 + outputBT100;
            startBT1000 = System.nanoTime();
            mBT2.getSortedTreeAsc();
            endBT1000 = System.nanoTime();
            outputBT1000 = endBT1000 - startBT1000 + outputBT1000;
            startBT10000 = System.nanoTime() ;
            mBT3.getSortedTreeAsc();
            endBT10000 = System.nanoTime();
            outputBT10000 = endBT10000 - startBT10000 + outputBT10000;
        }
        Printer.print("Average time to binaryAscSort 100 : " + (outputBT100)/iteration + "ns");
        Printer.print("Average time to binaryAscSort 1000 : " + (outputBT1000)/iteration + "ns");
        Printer.print("Average time to binaryAscSort 10000 : " + (outputBT10000)/iteration + "ns");
    }

    @Test
    @DisplayName("AllSortTestPerformance")
    public void checkAllSorterPerformance(){

        // This is soo long just so it uses the same arrays for each type
        int[] array100 = getArrays(100);
        int[] array1000 = getArrays(1000);
        int[] array10000 = getArrays(10000);

        BubbleSort bS = new BubbleSort();
        long startBS100 = System.nanoTime();
        bS.sortArray(array100);
        long endBS100= System.nanoTime();
        Printer.print("Time to bubbleSort 100 : " + (endBS100-startBS100) + "ns");
        long startBS1000 = System.nanoTime();
        bS.sortArray(array1000);
        long endBS1000 = System.nanoTime();
        Printer.print("Time to bubbleSort 1000 : " + (endBS1000-startBS1000) + "ns");
        long startBS10000 = System.nanoTime();
        bS.sortArray(array10000);
        long endBS10000 = System.nanoTime();
        Printer.print("Time to bubbleSort 10000 : " + (endBS10000-startBS10000) + "ns");

        MergeSort mS = new MergeSort();
        long startMS100 = System.nanoTime();
        mS.sortArray(array100);
        long endMS100= System.nanoTime();
        Printer.print("Time to mergeSort 100 : " + (endMS100-startMS100) + "ns");
        long startMS1000 = System.nanoTime();
        mS.sortArray(array1000);
        long endMS1000 = System.nanoTime();
        Printer.print("Time to mergeSort 1000 : " + (endMS1000-startMS1000) + "ns");
        long startMS10000 = System.nanoTime();
        mS.sortArray(array10000);
        long endMS10000 = System.nanoTime();
        Printer.print("Time to mergeSort 10000 : " + (endMS10000-startMS10000) + "ns");

        Integer[] g100 = Arrays.stream( array100 ).boxed().toArray( Integer[]::new );
        Integer[] g1000 = Arrays.stream( array1000 ).boxed().toArray( Integer[]::new );
        Integer[] g10000 = Arrays.stream( array10000 ).boxed().toArray( Integer[]::new );

        GenericBubbleSort gBS = new GenericBubbleSort();
        long startGBS100 = System.nanoTime();
        gBS.sortArray(g100);
        long endGBS100= System.nanoTime();
        Printer.print("Time to genericBubbleSort 100 : " + (endGBS100-startGBS100) + "ns");
        long startGBS1000 = System.nanoTime();
        gBS.sortArray(g1000);
        long endGBS1000 = System.nanoTime();
        Printer.print("Time to genericBubbleSort 1000 : " + (endGBS1000-startGBS1000) + "ns");
        long startGBS10000 = System.nanoTime();
        gBS.sortArray(g10000);
        long endGBS10000 = System.nanoTime();
        Printer.print("Time to genericBubbleSort 10000 : " + (endGBS10000-startGBS10000) + "ns");

        MainBinaryTree mBT1 = new MainBinaryTree();
        MainBinaryTree mBT2 = new MainBinaryTree();
        MainBinaryTree mBT3 = new MainBinaryTree();
        mBT1.addElements(array100);
        mBT2.addElements(array1000);
        mBT3.addElements(array10000);
        long startMBT100 = System.nanoTime();
        mBT1.getSortedTreeAsc();
        long endMBT100 = System.nanoTime();
        Printer.print("Time to BinarySort 100 : " + (endMBT100 - startMBT100) + "ns");
        long startMBT1000 = System.nanoTime();
        mBT2.getSortedTreeAsc();
        long endMBT1000 = System.nanoTime();
        Printer.print("Time to BinarySort 1000 : " + (endMBT1000 - startMBT1000) + "ns");
        long startMBT10000 = System.nanoTime();
        mBT3.getSortedTreeAsc();
        long endMBT10000 = System.nanoTime();
        Printer.print("Time to BinarySort 10000 : " + (endMBT10000 - startMBT10000) + "ns");
    }

}