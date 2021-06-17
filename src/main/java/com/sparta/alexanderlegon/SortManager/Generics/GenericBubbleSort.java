package com.sparta.alexanderlegon.SortManager.generics;

public class GenericBubbleSort <T extends Comparable<? super T>>  {

    public T[] sortArray(T[] arrayToSort){
        bubbleSort(arrayToSort);
        return arrayToSort;
    }

    public T[] bubbleSort(T[] arrayToSort){

        int arraySize = arrayToSort.length;
        int k = 0;
        while(k < arraySize){
            for(int j = 1; j < arraySize; j++){
                if(arrayToSort[j-1].compareTo(arrayToSort[j])>0) {
                    T temp;
                    temp = arrayToSort [j-1];
                    arrayToSort[j-1] = arrayToSort[j];
                    arrayToSort[j] = temp;
            }
        }
        k++;
    }
        return arrayToSort;
    }
}
