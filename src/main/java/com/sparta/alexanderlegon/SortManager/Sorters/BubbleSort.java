package com.sparta.alexanderlegon.SortManager.Sorters;
import com.sparta.alexanderlegon.SortManager.Interfaces.Sorter;
import com.sparta.alexanderlegon.SortManager.Printer.Printer;

public class BubbleSort implements Sorter  {

    @Override
    public int[] sortArray(int[] arrayToSort){
        bubbleSort(arrayToSort);
        return arrayToSort;
    }

    public int[] bubbleSort(int[] arrayToSort){

        boolean swapped = false;
        int arraySize = arrayToSort.length;
        int reducingSize = arraySize;
        int k = 0;
        while(k < arraySize){
            for(int j = 1; j < reducingSize; j++){
                if(arrayToSort[j-1] > arrayToSort[j]) {
                    int temp;
                    temp = arrayToSort [j-1];
                    arrayToSort[j-1] = arrayToSort[j];
                    arrayToSort[j] = temp;
                    swapped = true;
                }
            }
            if(swapped != true){
                return arrayToSort;
            }
            else{
            k++;
            reducingSize--;
            swapped = false;
            }
        }
        return arrayToSort;
    }
}
