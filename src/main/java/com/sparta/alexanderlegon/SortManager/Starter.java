package com.sparta.alexanderlegon.SortManager;

import com.sparta.alexanderlegon.SortManager.Exceptions.InputException;
import com.sparta.alexanderlegon.SortManager.Printer.Printer;
import com.sparta.alexanderlegon.SortManager.Generics.GenericBubbleSort;
import com.sparta.alexanderlegon.SortManager.Sorters.MainBinaryTree;
import com.sparta.alexanderlegon.SortManager.Sorters.MergeSort;
import com.sparta.alexanderlegon.SortManager.Sorters.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class Starter {
    public static void start() throws InputException {
        SortFactory sF = new SortFactory();
        sF.sortFactory();
    }
}
//        int[] toSort = getArrayToSort.getArray();
//
//        Scanner input = new Scanner(System.in);
//        Printer.print("Press 1 for bubbleSort, Press 2 for MergeSort, Press 3 for Generic BubbleSort, Press 4 for Binary Tree");
//        int whatSorter = input.nextInt();
//
//        //Make sortfactory instead of this starter
//
//        if (whatSorter == 1) {
//            BubbleSort bS = new BubbleSort();
//            Printer.print("Unsorted Array : " + Arrays.toString(toSort));
//            long start = System.nanoTime();
//            Printer.print("Bubble Sorted Array : " + Arrays.toString( bS.sortArray(toSort)));
//            long end = System.nanoTime();
//            Printer.print("Time to sort : " + (end-start) + "ns");
//        }
//
//        if (whatSorter == 2){
//            MergeSort mS = new MergeSort();
//            Printer.print("Unsorted Array : " + Arrays.toString(toSort));
//            long start = System.nanoTime();
//            Printer.print("Merge Sorted Array :" + Arrays.toString(mS.sortArray(toSort)));
//            long end = System.nanoTime();
//            Printer.print("Time to sort : " + (end-start) + "ns");
//        }
//
//        if (whatSorter == 3) {
//            //This was done using generics to pratise using generics
//            GenericBubbleSort<Integer> bS = new GenericBubbleSort<>();
//            Printer.print("Unsorted Array : " + Arrays.toString(toSort));
//            Integer[] toBSort = Arrays.stream(toSort).boxed().toArray(Integer[]::new);
//            long start = System.nanoTime();
//            Printer.print("Generic Bubble Sorted Array : " + Arrays.toString( bS.sortArray(toBSort)));
//            long end = System.nanoTime();
//            Printer.print("Time to sort : " + (end-start) + "ns");
//        }
//
//        if (whatSorter == 4){
//            MainBinaryTree bT = new MainBinaryTree();
//            Printer.print("Unsorted Array : " + Arrays.toString(toSort));
//            bT.addElements(toSort);
//
//            int i = 1;
//            while(i == 1){
//                Scanner binaryIn = new Scanner(System.in);
//                Printer.print("Press 1 for AscSort, Press 2 for DescSort, Press 3 to addValue , Press 4 to find root, Press 5 to find a value, Press 6 to quit");
//                int binaryInput = binaryIn.nextInt();
//                if(binaryInput == 1){
//                    long start = System.nanoTime();
//                    Printer.print("Binary Tree Sorted Array :" + Arrays.toString(bT.getSortedTreeAsc()));
//                    long end = System.nanoTime();
//                    Printer.print("Time to sort : " + (end-start) + "ns");
//                    i=0;
//                }
//                if(binaryInput == 2){
//                    long start = System.nanoTime();
//                    Printer.print("Binary Tree Sorted Array :" + Arrays.toString(bT.getSortedTreeDesc()));
//                    long end = System.nanoTime();
//                    Printer.print("Time to sort : " + (end-start) + "ns");
//                    i=0;
//                }
//                if(binaryInput == 3){
//                    Scanner addEle = new Scanner(System.in);
//                    Printer.print("Write Number to Input into binary sorter");
//                    int addElement = addEle.nextInt();
//                    bT.addElement(addElement);
//                    Printer.print("Added "+ addElement + " to the binary tree");
//                }
//                if(binaryInput == 4){
//                    Printer.print("root element : " + bT.getRootElement());
//                }
//                if(binaryInput == 5){
//                    Scanner findEle = new Scanner(System.in);
//                    Printer.print("Write Number to find in binary tree");
//                    if(bT.findElement(findEle.nextInt()) == true){
//                        Printer.print("Value is present");
//                    }
//                    else{
//                        Printer.print("Value is not found");
//                    }
//                }
//                if(binaryInput == 6){
//                    i=0;
//                }
//            }
//
//        }
//
//        if(whatSorter != 1 && whatSorter != 2 && whatSorter != 3){
//            throw new InputException("Input one of the options shown next time");
//        }
//    }
//}
// put exception in array length input and number input