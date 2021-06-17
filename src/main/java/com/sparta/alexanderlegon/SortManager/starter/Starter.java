package com.sparta.alexanderlegon.SortManager.starter;

import com.sparta.alexanderlegon.SortManager.factory.SortFactory;
import com.sparta.alexanderlegon.SortManager.exceptions.InputException;
import com.sparta.alexanderlegon.SortManager.interfaces.BinaryTree;
import com.sparta.alexanderlegon.SortManager.printer.Printer;
import com.sparta.alexanderlegon.SortManager.util.arrayToSort;

import java.util.Arrays;
import java.util.Scanner;

public class Starter {
static long start;
static long end;

    public static void start() throws InputException {
        SortFactory sF = new SortFactory();
        int[] toSort = arrayToSort.getArray();
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
                Printer.print("Press 1 to Ascending Sort \nPress 2 to Descending Sort \nPress 3 to Add a new value \nPress 4 to Find root value \n" +
                        "Press 5 to Find if a value is present \nPress 6 to Find total number of elements\nPress 7 to Quit"); //add some \n for new line
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