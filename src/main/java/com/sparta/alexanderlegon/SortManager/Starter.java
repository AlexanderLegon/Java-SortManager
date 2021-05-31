package com.sparta.alexanderlegon.SortManager;

import com.sparta.alexanderlegon.SortManager.Exceptions.InputException;
import com.sparta.alexanderlegon.SortManager.Interfaces.BinaryTree;
import com.sparta.alexanderlegon.SortManager.Printer.Printer;
import com.sparta.alexanderlegon.SortManager.Generics.GenericBubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class Starter {
static long start;
static long end;

    public static void start() throws InputException {
        SortFactory sF = new SortFactory();
        int[] toSort = getArrayToSort.getArray();
        Scanner input = new Scanner(System.in);
        Printer.print("Press 1 for bubbleSort, Press 2 for MergeSort, Press 3 for Generic BubbleSort, Press 4 for Binary Tree");
        int whatSorter = input.nextInt();

        if(whatSorter == 1 || whatSorter ==2){
            Printer.print("Unsorted Array : " + Arrays.toString(toSort));
            long start = System.nanoTime();
            Printer.print("Bubble Sorted Array : " + Arrays.toString( sF.getSorter(whatSorter).sortArray(toSort)));
            long end = System.nanoTime();
            Printer.print("Time to sort : " + (end-start) + "ns");
        }
        if(whatSorter == 3){
            Printer.print("Unsorted Array : " + Arrays.toString(toSort));
            Integer[] toBSort = Arrays.stream(toSort).boxed().toArray(Integer[]::new);
            start = System.nanoTime();
            Printer.print("Generic Bubble Sorted Array : " + Arrays.toString(sF.getGeneric().sortArray(toBSort)));
            end = System.nanoTime();
            Printer.print("Time to sort : " + (end - start) + "ns");
        }
        if(whatSorter == 4){
            Printer.print("Unsorted Array : " + Arrays.toString(toSort));
                BinaryTree bT = sF.getBinary();
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
        }
    }
}