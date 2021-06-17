package com.sparta.alexanderlegon.SortManager;

import com.sparta.alexanderlegon.SortManager.exceptions.InputException;
import com.sparta.alexanderlegon.SortManager.generics.GenericBubbleSort;
import com.sparta.alexanderlegon.SortManager.interfaces.BinaryTree;
import com.sparta.alexanderlegon.SortManager.interfaces.Sorter;
import com.sparta.alexanderlegon.SortManager.sorters.BubbleSort;
import com.sparta.alexanderlegon.SortManager.sorters.MainBinaryTree;
import com.sparta.alexanderlegon.SortManager.sorters.MergeSort;

public class SortFactory {

    public static Sorter getSorter(int whatSorter) throws InputException {

        switch (whatSorter) {
            case 1:
                BubbleSort bS = new BubbleSort();
                return bS;

            case 2:
                MergeSort mS = new MergeSort();
                return mS;

            default:
               throw new InputException("Input one of the options shown next time");
        }
    }

    public static GenericBubbleSort getGeneric() {

        GenericBubbleSort gBT = new GenericBubbleSort();
        return gBT;
    }

    public static BinaryTree getBinary() {

        MainBinaryTree bT = new MainBinaryTree();
                return bT;
    }

}
