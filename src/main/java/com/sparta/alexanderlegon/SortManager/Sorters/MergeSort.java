package com.sparta.alexanderlegon.SortManager.Sorters;


import com.sparta.alexanderlegon.SortManager.Interfaces.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sortArray(int[] input) {
        int [] toSort = input;
        int length = input.length;
        toSort = split(toSort, length);
        return toSort;
    }

    public static int[] split(int[] toSort, int totalLength) {

        if (totalLength < 2) {
            return toSort;
        }
        int leftLength = totalLength / 2;
        int[] lList = new int[leftLength];
        int[] rList = new int[totalLength - leftLength];
        for (int i = 0; i < leftLength; i++) {
            lList[i] = toSort[i];
        }
        for (int i = leftLength; i < totalLength; i++) {
            rList[i - leftLength] = toSort[i];
        }
        //tail recursion
        split(lList, leftLength);
        split(rList, totalLength - leftLength);
        return compareAndMerge(toSort, lList, rList, leftLength, totalLength - leftLength);
    }

    public static int[] compareAndMerge(int output[], int[] lList, int[] rList, int leftLength, int rightLength) {

        int i = 0;
        int j = 0;
        int k;

            for (k = 0; k < (leftLength + rightLength); k++) {

                if (i < leftLength && j < rightLength) {
                    if (lList[i] <= rList[j]) {
                        output[k] = lList[i++];
                    }
                    else {
                        output[k] = rList[j++];
                    }
                }
                else if(i < leftLength){
                    output[k] = lList[i++];
                }
                else if(j < rightLength){
                    output[k] = rList[j++];
                }
            }
            return output;
    }
}
