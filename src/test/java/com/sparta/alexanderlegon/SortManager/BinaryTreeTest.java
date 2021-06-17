package com.sparta.alexanderlegon.SortManager;

import com.sparta.alexanderlegon.SortManager.exceptions.ChildNotFoundException;
import com.sparta.alexanderlegon.SortManager.exceptions.InputException;
import com.sparta.alexanderlegon.SortManager.sorters.MainBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinaryTreeTest {

    @Test
    @DisplayName("getRoot")
    public void addAndGetRootElement() throws InputException {
        MainBinaryTree bT = new MainBinaryTree();
        bT.addElement(7);
        Assertions.assertEquals(7, bT.getRootElement());
    }

    @Test
    @DisplayName("getRightElement")
    public void addRightElement(){
        MainBinaryTree bT = new MainBinaryTree();
        bT.addElement(7);
        bT.addElement(8);
        bT.addElement(12);
        Assertions.assertEquals(true, bT.findElement(12));
    }
    @Test
    @DisplayName("getLeftElement")
    public void addLeftElement(){
        MainBinaryTree bT = new MainBinaryTree();
        bT.addElement(7);
        bT.addElement(6);
        bT.addElement(1);
        bT.addElement(4);
        Assertions.assertEquals(true, bT.findElement(1));
    }
    @Test
    @DisplayName("doDuplicateWork")
    public void doDuplicateElementWork(){
        MainBinaryTree bT = new MainBinaryTree();
        bT.addElement(7);
        bT.addElement(6);
        bT.addElement(6);
        bT.addElement(1);
        Assertions.assertEquals(3, bT.getNumberOfElements());
    }
    @Test
    @DisplayName("getNumberOfElement")
    public void getNumberOfElement(){
        MainBinaryTree bT = new MainBinaryTree();
        bT.addElement(7);
        bT.addElement(6);
        bT.addElement(6);
        bT.addElement(1);
        Assertions.assertEquals(3, bT.getNumberOfElements());
    }

    @Test
    @DisplayName("addArrayAndReturnOfElement")
    public void addArray(){
        MainBinaryTree bT = new MainBinaryTree();
        int[] intArray = new int[]{ 5,2,1,4,3,6,7,9,8,10 };
        bT.addElements(intArray);
        Assertions.assertEquals(10, bT.getNumberOfElements());
    }
    @Test
    @DisplayName("getLeftChild")
    public void getLeftChild() throws  ChildNotFoundException{
        MainBinaryTree bT = new MainBinaryTree();
        int[] intArray = new int[]{ 5,2,3,4,1,6,7,9,8,10 };
        bT.addElements(intArray);
        Assertions.assertEquals(8, bT.getLeftChild(9));
    }

    @Test
    @DisplayName("getLeftChildError")
    public void getLeftChildError() throws ChildNotFoundException{
        MainBinaryTree bT = new MainBinaryTree();
        int[] intArray = new int[]{ 5,2,3,4,1,6,7,9,8,10 };
        bT.addElements(intArray);
        ChildNotFoundException thrown = Assertions.assertThrows(ChildNotFoundException.class,() -> bT.getLeftChild(8));
        Assertions.assertEquals("Value is not found",thrown.getMessage());
    }
    @Test
    @DisplayName("getRightChild")
    public void getRightChild() throws  ChildNotFoundException{
        MainBinaryTree bT = new MainBinaryTree();
        int[] intArray = new int[]{ 5,2,3,4,1,6,7,9,8,10 };
        bT.addElements(intArray);
        Assertions.assertEquals(3, bT.getRightChild(2));
    }
    @Test
    @DisplayName("getRightChildError")
    public void getRightChildError() throws ChildNotFoundException{
        MainBinaryTree bT = new MainBinaryTree();
        int[] intArray = new int[]{ 5,2,3,4,1,6,7,8,9,10 };
        bT.addElements(intArray);
        ChildNotFoundException thrown = Assertions.assertThrows(ChildNotFoundException.class,() -> bT.getRightChild(10));
        Assertions.assertEquals("Value is not found",thrown.getMessage());
    }
    @Test
    @DisplayName("getSortedAsc")
    public void getSortedAsc(){
        MainBinaryTree bT = new MainBinaryTree();
        int[] intArray = new int[]{ 5,2,3,4,1,6,7,9,8,10 };
        int[] sortedArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        bT.addElements(intArray);
        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(bT.getSortedTreeAsc()));
    }
    @Test
    @DisplayName("getSortedDesc")
    public void getSortedDesc(){
        MainBinaryTree bT = new MainBinaryTree();
        int[] intArray = new int[]{ 5,2,3,4,1,6,7,9,8,10 };
        int[] sortedArray = new int[]{ 10,9,8,7,6,5,4,3,2,1 };
        bT.addElements(intArray);
        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(bT.getSortedTreeDesc()));
    }
}
