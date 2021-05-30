package com.sparta.alexanderlegon.SortManager.Interfaces;

import com.sparta.alexanderlegon.SortManager.Exceptions.ChildNotFoundException;

//no dupes allowed
//linked list value and 2 pointers left and right, if nothing pointer is null
//node class is a nested class in binary tree class cause its not used by merge or bubblesort
public interface BinaryTree {
    int getRootElement(); // base value

    int getNumberOfElements(); // how many values are in the array

    void addElement(int element); //add array

    void addElements(int[] elements); //iterate through calling the non array version

    boolean findElement(int value); //do logic searching down to where the value should be at the end, if found at any point return true

    int getLeftChild(int element) throws ChildNotFoundException; //return left child if found otherwise through exception

    int getRightChild(int element)throws ChildNotFoundException;

    int[] getSortedTreeAsc(); //use get left child recursively, check for right childs and take them

    int[] getSortedTreeDesc();
}
