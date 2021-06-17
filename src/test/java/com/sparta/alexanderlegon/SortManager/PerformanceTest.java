package com.sparta.alexanderlegon.SortManager;

import com.sparta.alexanderlegon.SortManager.generics.GenericBubbleSort;
import com.sparta.alexanderlegon.SortManager.printer.Printer;
import com.sparta.alexanderlegon.SortManager.sorters.BinaryTreeImplementation;
import com.sparta.alexanderlegon.SortManager.sorters.BubbleSort;
import com.sparta.alexanderlegon.SortManager.sorters.MergeSort;
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
        double startBS100;
        double endBS100;
        double startBS1000;
        double endBS1000;
        double startBS10000;
        double endBS10000;
        double outputBS100 = 0;
        double outputBS1000 = 0;
        double outputBS10000 = 0;
        int iteration = 20;

        for(int i = 0; i < iteration;i++){

            int[] array100 = getArrays(100);
            int[] array1000 = getArrays(1000);
            int[] array10000 = getArrays(10000);

        BubbleSort bubbleSort = new BubbleSort();
        startBS100 = System.nanoTime();
        bubbleSort.sortArray(array100);
        endBS100 = System.nanoTime();
        outputBS100 = endBS100 - startBS100 + outputBS100;
        startBS1000 = System.nanoTime();
        bubbleSort.sortArray(array1000);
        endBS1000 = System.nanoTime();
        outputBS1000 = endBS1000 - startBS1000 + outputBS1000;
        startBS10000 = System.nanoTime() ;
        bubbleSort.sortArray(array10000);
        endBS10000 = System.nanoTime();
        outputBS10000 = endBS10000 - startBS10000 + outputBS10000;
        }
        Printer.print("Average time to bubbleSort 100 : " + (outputBS100)/iteration/1000000 + "ms");
        Printer.print("Average time to bubbleSort 1000 : " + (outputBS1000)/iteration/1000000 + "ms");
        Printer.print("Average time to bubbleSort 10000 : " + (outputBS10000)/iteration/1000000 + "ms");
    }

    @Test
    @DisplayName("AverageMergeSortTestPerformance")
    public void checkAverageMergeSorterPerformance() {

        double startMS100 ;
        double endMS100;
        double startMS1000;
        double endMS1000;
        double startMS10000;
        double endMS10000;
        double outputMS100 = 0;
        double outputMS1000 = 0;
        double outputMS10000 = 0;
        int iteration = 20;

        for(int i =0; i <iteration;i++){

            int[] array100 = getArrays(100);
            int[] array1000 = getArrays(1000);
            int[] array10000 = getArrays(10000);

            MergeSort mergeSort = new MergeSort();
            startMS100 = System.nanoTime();
            mergeSort.sortArray(array100);
            endMS100 = System.nanoTime();
            outputMS100 = endMS100 - startMS100 + outputMS100;
            startMS1000 = System.nanoTime();
            mergeSort.sortArray(array1000);
            endMS1000 = System.nanoTime();
            outputMS1000 = endMS1000 - startMS1000 + outputMS1000;
            startMS10000 = System.nanoTime();
            mergeSort.sortArray(array10000);
            endMS10000 = System.nanoTime();
            outputMS10000 = endMS10000 - startMS10000 + outputMS10000;
        }
        Printer.print("Average time to mergeSort 100 : " + (outputMS100)/iteration/1000000 + "ms");
        Printer.print("Average time to mergeSort 1000 : " + (outputMS1000)/iteration/1000000 + "ms");
        Printer.print("Average time to mergeSort 10000 : " + (outputMS10000)/iteration/1000000 + "ms");
    }
    @Test
    @DisplayName("AverageGenericBubbleSortTestPerformance")
    public void checkAverageGenericBubbleSorterPerformance() {
        double startGBS100 ;
        double endGBS100;
        double startGBS1000;
        double endGBS1000;
        double startGBS10000;
        double endGBS10000;
        double outputGBS100 = 0;
        double outputGBS1000 = 0;
        double outputGBS10000 = 0;
        int iteration = 20;

        for(int i =0; i <iteration;i++){

            int[] array100 = getArrays(100);
            int[] array1000 = getArrays(1000);
            int[] array10000 = getArrays(10000);
            Integer[] g100 = Arrays.stream( array100 ).boxed().toArray( Integer[]::new );
            Integer[] g1000 = Arrays.stream( array1000 ).boxed().toArray( Integer[]::new );
            Integer[] g10000 = Arrays.stream( array10000 ).boxed().toArray( Integer[]::new );

            GenericBubbleSort genericBubbleSort = new GenericBubbleSort();
            startGBS100 = System.nanoTime();
            genericBubbleSort.sortArray(g100);
            endGBS100 = System.nanoTime();
            outputGBS100 = endGBS100 - startGBS100 + outputGBS100;
            startGBS1000 = System.nanoTime();
            genericBubbleSort.sortArray(g1000);
            endGBS1000 = System.nanoTime();
            outputGBS1000 = endGBS1000 - startGBS1000 + outputGBS1000;
            startGBS10000 = System.nanoTime();
            genericBubbleSort.sortArray(g10000);
            endGBS10000 = System.nanoTime();
            outputGBS10000 = endGBS10000 - startGBS10000 + outputGBS10000;
        }
        Printer.print("Average time to genericBubbleSort 100 : " + (outputGBS100)/iteration/1000000 + "ms");
        Printer.print("Average time to genericBubbleSort 1000 : " + (outputGBS1000)/iteration/1000000 + "ms");
        Printer.print("Average time to genericBubbleSort 10000 : " + (outputGBS10000)/iteration/1000000 + "ms");
    }

    @Test
    @DisplayName("AverageBinarySortTestPerformance")
    public void checkAverageBinarySorterPerformance() {
        double startBT100;
        double endBT100;
        double startBT1000;
        double endBT1000;
        double startBT10000;
        double endBT10000;
        double outputBT100 = 0;
        double outputBT1000 = 0;
        double outputBT10000 = 0;
        int iteration = 20;

        for(int i = 0; i < iteration;i++){

            int[] array100 = getArrays(100);
            int[] array1000 = getArrays(1000);
            int[] array10000 = getArrays(10000);
            BinaryTreeImplementation binaryTreeImplementation100 = new BinaryTreeImplementation();
            BinaryTreeImplementation binaryTreeImplementation1000 = new BinaryTreeImplementation();
            BinaryTreeImplementation binaryTreeImplementation10000 = new BinaryTreeImplementation();
            binaryTreeImplementation100.addElements(array100);
            binaryTreeImplementation1000.addElements(array1000);
            binaryTreeImplementation10000.addElements(array10000);

            startBT100 = System.nanoTime();
            binaryTreeImplementation100.getSortedTreeAsc();
            endBT100 = System.nanoTime();
            outputBT100 = endBT100 - startBT100 + outputBT100;
            startBT1000 = System.nanoTime();
            binaryTreeImplementation1000.getSortedTreeAsc();
            endBT1000 = System.nanoTime();
            outputBT1000 = endBT1000 - startBT1000 + outputBT1000;
            startBT10000 = System.nanoTime() ;
            binaryTreeImplementation10000.getSortedTreeAsc();
            endBT10000 = System.nanoTime();
            outputBT10000 = endBT10000 - startBT10000 + outputBT10000;
        }
        Printer.print("Average time to binaryAscSort 100 : " + (outputBT100)/iteration/1000000 + "ms");
        Printer.print("Average time to binaryAscSort 1000 : " + (outputBT1000)/iteration/1000000 + "ms");
        Printer.print("Average time to binaryAscSort 10000 : " + (outputBT10000)/iteration/1000000 + "ms");
    }

    @Test
    @DisplayName("AllSortTestPerformance")
    public void checkAllSorterPerformance(){

        // This is soo long just so it uses the same arrays for each type
        int[] array100 = getArrays(100);
        int[] array1000 = getArrays(1000);
        int[] array10000 = getArrays(10000);

        BubbleSort bS = new BubbleSort();
        double startBS100 = System.nanoTime();
        bS.sortArray(array100);
        double endBS100= System.nanoTime();
        Printer.print("Time to bubbleSort 100 : " + (endBS100-startBS100)/1000000 + "ms");
        double startBS1000 = System.nanoTime();
        bS.sortArray(array1000);
        double endBS1000 = System.nanoTime();
        Printer.print("Time to bubbleSort 1000 : " + (endBS1000-startBS1000)/1000000 + "ms");
        double startBS10000 = System.nanoTime();
        bS.sortArray(array10000);
        double endBS10000 = System.nanoTime();
        Printer.print("Time to bubbleSort 10000 : " + (endBS10000-startBS10000)/1000000 + "ms");

        MergeSort mS = new MergeSort();
        double startMS100 = System.nanoTime();
        mS.sortArray(array100);
        double endMS100= System.nanoTime();
        Printer.print("Time to mergeSort 100 : " + (endMS100-startMS100)/1000000 + "ms");
        double startMS1000 = System.nanoTime();
        mS.sortArray(array1000);
        double endMS1000 = System.nanoTime();
        Printer.print("Time to mergeSort 1000 : " + (endMS1000-startMS1000)/1000000 + "ms");
        double startMS10000 = System.nanoTime();
        mS.sortArray(array10000);
        double endMS10000 = System.nanoTime();
        Printer.print("Time to mergeSort 10000 : " + (endMS10000-startMS10000)/1000000 + "ms");

        Integer[] g100 = Arrays.stream( array100 ).boxed().toArray( Integer[]::new );
        Integer[] g1000 = Arrays.stream( array1000 ).boxed().toArray( Integer[]::new );
        Integer[] g10000 = Arrays.stream( array10000 ).boxed().toArray( Integer[]::new );

        GenericBubbleSort gBS = new GenericBubbleSort();
        double startGBS100 = System.nanoTime();
        gBS.sortArray(g100);
        double endGBS100= System.nanoTime();
        Printer.print("Time to genericBubbleSort 100 : " + (endGBS100-startGBS100)/1000000 + "ms");
        double startGBS1000 = System.nanoTime();
        gBS.sortArray(g1000);
        double endGBS1000 = System.nanoTime();
        Printer.print("Time to genericBubbleSort 1000 : " + (endGBS1000-startGBS1000)/1000000 + "ms");
        double startGBS10000 = System.nanoTime();
        gBS.sortArray(g10000);
        double endGBS10000 = System.nanoTime();
        Printer.print("Time to genericBubbleSort 10000 : " + (endGBS10000-startGBS10000)/1000000 + "ms");

        BinaryTreeImplementation mBT1 = new BinaryTreeImplementation();
        BinaryTreeImplementation mBT2 = new BinaryTreeImplementation();
        BinaryTreeImplementation mBT3 = new BinaryTreeImplementation();
        mBT1.addElements(array100);
        mBT2.addElements(array1000);
        mBT3.addElements(array10000);
        double startMBT100 = System.nanoTime();
        mBT1.getSortedTreeAsc();
        double endMBT100 = System.nanoTime();
        Printer.print("Time to BinarySort 100 : " + (endMBT100 - startMBT100)/1000000 + "ms");
        double startMBT1000 = System.nanoTime();
        mBT2.getSortedTreeAsc();
        double endMBT1000 = System.nanoTime();
        Printer.print("Time to BinarySort 1000 : " + (endMBT1000 - startMBT1000)/1000000 + "ms");
        double startMBT10000 = System.nanoTime();
        mBT3.getSortedTreeAsc();
        double endMBT10000 = System.nanoTime();
        Printer.print("Time to BinarySort 10000 : " + (endMBT10000 - startMBT10000)/1000000 + "ms");
    }

}