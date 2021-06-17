package com.sparta.alexanderlegon.SortManager;

import com.sparta.alexanderlegon.SortManager.exceptions.ChildNotFoundException;
import com.sparta.alexanderlegon.SortManager.exceptions.InputException;
import com.sparta.alexanderlegon.SortManager.sorters.BinaryTreeImplementation;
import org.junit.jupiter.api.*;

import java.util.Arrays;

public class BinaryTreeTest {
BinaryTreeImplementation binaryTreeImplementation;

    @BeforeEach
    public void startBinaryTree(){
        binaryTreeImplementation = new BinaryTreeImplementation();
    }

    @Test
    @DisplayName("getRoot")
    public void addAndGetRootElement() throws InputException {
        binaryTreeImplementation.addElement(7);
        Assertions.assertEquals(7, binaryTreeImplementation.getRootElement());
    }

    @Test
    @DisplayName("getRightElement")
    public void addRightElement(){
        binaryTreeImplementation.addElement(7);
        binaryTreeImplementation.addElement(8);
        binaryTreeImplementation.addElement(12);
        Assertions.assertEquals(true, binaryTreeImplementation.findElement(12));
    }
    @Test
    @DisplayName("getLeftElement")
    public void addLeftElement(){
        binaryTreeImplementation.addElement(7);
        binaryTreeImplementation.addElement(6);
        binaryTreeImplementation.addElement(1);
        binaryTreeImplementation.addElement(4);
        Assertions.assertEquals(true, binaryTreeImplementation.findElement(1));
    }
    @Test
    @DisplayName("doDuplicateWork")
    public void doDuplicateElementWork(){
        binaryTreeImplementation.addElement(7);
        binaryTreeImplementation.addElement(6);
        binaryTreeImplementation.addElement(6);
        binaryTreeImplementation.addElement(1);
        Assertions.assertEquals(3, binaryTreeImplementation.getNumberOfElements());
    }
    @Test
    @DisplayName("getNumberOfElement")
    public void getNumberOfElement(){
        binaryTreeImplementation.addElement(7);
        binaryTreeImplementation.addElement(6);
        binaryTreeImplementation.addElement(6);
        binaryTreeImplementation.addElement(1);
        Assertions.assertEquals(3, binaryTreeImplementation.getNumberOfElements());
    }

    @Test
    @DisplayName("addArrayAndReturnOfElement")
    public void addArray(){
        int[] intArray = new int[]{ 5,2,1,4,3,6,7,9,8,10 };
        binaryTreeImplementation.addElements(intArray);
        Assertions.assertEquals(10, binaryTreeImplementation.getNumberOfElements());
    }
    @Test
    @DisplayName("getLeftChild")
    public void getLeftChild() throws  ChildNotFoundException{
        int[] intArray = new int[]{ 5,2,3,4,1,6,7,9,8,10 };
        binaryTreeImplementation.addElements(intArray);
        Assertions.assertEquals(8, binaryTreeImplementation.getLeftChild(9));
    }

    @Test
    @DisplayName("getLeftChildError")
    public void getLeftChildError() throws ChildNotFoundException{
        int[] intArray = new int[]{ 5,2,3,4,1,6,7,9,8,10 };
        binaryTreeImplementation.addElements(intArray);
        ChildNotFoundException thrown = Assertions.assertThrows(ChildNotFoundException.class,() -> binaryTreeImplementation.getLeftChild(8));
        Assertions.assertEquals("Value is not found",thrown.getMessage());
    }
    @Test
    @DisplayName("getRightChild")
    public void getRightChild() throws  ChildNotFoundException{
        int[] intArray = new int[]{ 5,2,3,4,1,6,7,9,8,10 };
        binaryTreeImplementation.addElements(intArray);
        Assertions.assertEquals(3, binaryTreeImplementation.getRightChild(2));
    }
    @Test
    @DisplayName("getRightChildError")
    public void getRightChildError() throws ChildNotFoundException{
        int[] intArray = new int[]{ 5,2,3,4,1,6,7,8,9,10 };
        binaryTreeImplementation.addElements(intArray);
        ChildNotFoundException thrown = Assertions.assertThrows(ChildNotFoundException.class,() -> binaryTreeImplementation.getRightChild(10));
        Assertions.assertEquals("Value is not found",thrown.getMessage());
    }
    @Test
    @DisplayName("getSortedAsc")
    public void getSortedAsc(){
        int[] intArray = new int[]{ 5,2,3,4,1,6,7,9,8,10 };
        int[] sortedArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        binaryTreeImplementation.addElements(intArray);
        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(binaryTreeImplementation.getSortedTreeAsc()));
    }
    @Test
    @DisplayName("getSortedDesc")
    public void getSortedDesc(){
        int[] intArray = new int[]{ 5,2,3,4,1,6,7,9,8,10 };
        int[] sortedArray = new int[]{ 10,9,8,7,6,5,4,3,2,1 };
        binaryTreeImplementation.addElements(intArray);
        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(binaryTreeImplementation.getSortedTreeDesc()));
    }
}
