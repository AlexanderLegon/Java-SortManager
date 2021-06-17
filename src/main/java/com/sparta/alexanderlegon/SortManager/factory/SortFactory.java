package com.sparta.alexanderlegon.SortManager.factory;

import com.sparta.alexanderlegon.SortManager.exceptions.InputException;
import com.sparta.alexanderlegon.SortManager.generics.GenericBubbleSort;
import com.sparta.alexanderlegon.SortManager.interfaces.BinaryTree;
import com.sparta.alexanderlegon.SortManager.interfaces.Sorter;
import com.sparta.alexanderlegon.SortManager.sorters.BinaryTreeImplementation;
import com.sparta.alexanderlegon.SortManager.sorters.BubbleSort;
import com.sparta.alexanderlegon.SortManager.sorters.MergeSort;

public class SortFactory {

    public static Sorter getSorter(int whatSorter) throws InputException {

        switch (whatSorter) {
            case 1:
                BubbleSort bubbleSort = new BubbleSort();
                return bubbleSort;

            case 2:
                MergeSort mergeSort = new MergeSort();
                return mergeSort;

            default:
               throw new InputException("Input one of the options shown next time");
        }
    }

    public static GenericBubbleSort getGeneric() {

        GenericBubbleSort genericBubbleSort = new GenericBubbleSort();
        return genericBubbleSort;
    }

    public static BinaryTree getBinary() {

        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
                return binaryTree;
    }

}
