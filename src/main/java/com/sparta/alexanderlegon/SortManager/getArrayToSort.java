package com.sparta.alexanderlegon.SortManager;

import com.sparta.alexanderlegon.SortManager.exceptions.InputException;
import com.sparta.alexanderlegon.SortManager.printer.Printer;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class getArrayToSort {

    public static int[] getArray() throws InputException{

        Scanner input = new Scanner(System.in);
        Printer.print("Do you want random list? True/False");
        boolean rand = input.nextBoolean();
        if(rand == true){
            int arraySize = enterSize();
            int[] toSort = new int[arraySize];
            Random ran = new Random();
            for(int i=0; i<arraySize;i++){
                int temp = ran.nextInt(arraySize*2);
                if(Arrays.stream(toSort).anyMatch(j -> j == temp)){
                    i--;
                }
                else{
                    toSort[i] = temp;
                }

            }
            checkIfSorted(arraySize,toSort);
            return toSort;
        }
        else {
            int arraySize = enterSize();
            int[] toSort = new int[arraySize];
            int i = 0;
            while (i < arraySize) {
                Printer.print("Enter number to sort");
                toSort[i] = input.nextInt();
                i++;
            }
            checkIfSorted(arraySize,toSort);
            return toSort;
        }

    }

    public static int enterSize() throws InputException {
        Scanner input = new Scanner(System.in);
        Printer.print("Enter number of items in sorting array");
        int arraySize = input.nextInt();
        if (arraySize < 0) {
            throw new InputException("Please enter a positive integer");
        }
        return arraySize;
    }

    public static void checkIfSorted(int arraySize,int[] toSort) throws  InputException{
        int counter=0;
        for(int i = 0; i< arraySize; i++ ){
            if(counter == arraySize-1){
                throw new InputException("Array is already sorted");
            }
            else if(toSort[i] <= toSort[i+1]){
                counter++;
            }
            else{
                break;
            }
        }
    }
}
