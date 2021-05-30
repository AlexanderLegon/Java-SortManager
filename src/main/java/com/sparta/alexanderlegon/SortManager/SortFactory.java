package com.sparta.alexanderlegon.SortManager;

import com.sparta.alexanderlegon.SortManager.Exceptions.InputException;
import com.sparta.alexanderlegon.SortManager.Generics.GenericBubbleSort;
import com.sparta.alexanderlegon.SortManager.Printer.Printer;
import com.sparta.alexanderlegon.SortManager.Sorters.BubbleSort;
import com.sparta.alexanderlegon.SortManager.Sorters.MainBinaryTree;
import com.sparta.alexanderlegon.SortManager.Sorters.MergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class SortFactory {
    public static int[] toSort;
    public static int whatSorter;
    public static long start;
    public static long end;

    public static void sortFactory() throws InputException{
        toSort = getArrayToSort.getArray();
        Scanner input = new Scanner(System.in);
        Printer.print("Press 1 for bubbleSort, Press 2 for MergeSort, Press 3 for Generic BubbleSort, Press 4 for Binary Tree");
        whatSorter = input.nextInt();
        sorter(toSort,whatSorter);
    }

    public static void sorter(int[] toSort,int whatSorter) throws InputException{

        switch(whatSorter){
             case 1 :
                 BubbleSort bS = new BubbleSort();
                 Printer.print("Unsorted Array : " + Arrays.toString(toSort));
                 start = System.nanoTime();
                 Printer.print("Bubble Sorted Array : " + Arrays.toString( bS.sortArray(toSort)));
                 end = System.nanoTime();
                 Printer.print("Time to sort : " + (end-start) + "ns");
                 break;

             case 2:
                MergeSort mS = new MergeSort();
                Printer.print("Unsorted Array : " + Arrays.toString(toSort));
                start = System.nanoTime();
                Printer.print("Merge Sorted Array :" + Arrays.toString(mS.sortArray(toSort)));
                end = System.nanoTime();
                Printer.print("Time to sort : " + (end-start) + "ns");
                break;

             case 3:
                GenericBubbleSort<Integer> gBS = new GenericBubbleSort<>();
                Printer.print("Unsorted Array : " + Arrays.toString(toSort));
                Integer[] toBSort = Arrays.stream(toSort).boxed().toArray(Integer[]::new);
                start = System.nanoTime();
                Printer.print("Generic Bubble Sorted Array : " + Arrays.toString( gBS.sortArray(toBSort)));
                end = System.nanoTime();
                Printer.print("Time to sort : " + (end-start) + "ns");
                break;

             case 4:
                MainBinaryTree bT = new MainBinaryTree();
                Printer.print("Unsorted Array : " + Arrays.toString(toSort));
                bT.addElements(toSort);
                int i = 1;

                while(i == 1){
                Scanner binaryIn = new Scanner(System.in);
                Printer.print("Press 1 for AscSort, Press 2 for DescSort, Press 3 to addValue , Press 4 to find root," +
                        " Press 5 to find a value, Press 6 to find number of elements, Press 7 to quit");
                int binaryInput = binaryIn.nextInt();

                    if(binaryInput == 1){
                        start = System.nanoTime();
                        Printer.print("Binary Tree Sorted Array :" + Arrays.toString(bT.getSortedTreeAsc()));
                        end = System.nanoTime();
                        Printer.print("Time to sort : " + (end-start) + "ns");
                    }
                    if(binaryInput == 2){
                        start = System.nanoTime();
                        Printer.print("Binary Tree Sorted Array :" + Arrays.toString(bT.getSortedTreeDesc()));
                        end = System.nanoTime();
                        Printer.print("Time to sort : " + (end-start) + "ns");
                    }
                    if(binaryInput == 3){
                        Scanner addEle = new Scanner(System.in);
                        Printer.print("Write Number to Input into binary sorter");
                        int addElement = addEle.nextInt();
                        if(bT.findElement(addElement) == false){
                        bT.addElement(addElement);
                        Printer.print("Added "+ addElement + " to the binary tree");}
                        else{
                            Printer.print(addElement + " is already present");
                        }
                    }
                    if(binaryInput == 4){
                        Printer.print("root element : " + bT.getRootElement());
                    }
                    if(binaryInput == 5){
                        Scanner findEle = new Scanner(System.in);
                        Printer.print("Write Number to find in binary tree");
                        if(bT.findElement(findEle.nextInt()) == true){
                            Printer.print("Value is present");
                        }
                        else{
                            Printer.print("Value is not found");
                        }
                    }
                    if(binaryInput == 6){
                        Printer.print("Number of Elements : " + bT.getNumberOfElements());
                    }
                    if(binaryInput == 7){
                        i=0;
                    }
                }
                break;
             default:
                throw new InputException("Input one of the options shown next time");
        }
    }
}

