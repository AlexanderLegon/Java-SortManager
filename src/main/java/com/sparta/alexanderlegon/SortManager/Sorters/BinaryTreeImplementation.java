package com.sparta.alexanderlegon.SortManager.sorters;

import com.sparta.alexanderlegon.SortManager.exceptions.ChildNotFoundException;
import com.sparta.alexanderlegon.SortManager.exceptions.InputException;
import com.sparta.alexanderlegon.SortManager.interfaces.BinaryTree;
import com.sparta.alexanderlegon.SortManager.printer.Printer;

public class BinaryTreeImplementation implements BinaryTree {

    public static class Node {

        int number;
        Node left, right;


        Node(int number) {
            this.number = number;
            left = null;
            right = null;
        }
    }

    public Node root;
    public int counter;
    public int[] sorted;
    public int sorter;

    public void createRoot(int number) {
        root = new Node(number);
    }

    @Override
    public int getRootElement() {
        try {
            if (root != null) {
                return root.number;
            } else {
                throw new InputException("There is no root");
            }
        } catch (InputException f) {
            Printer.print(f.getMessage());
        }
        return root.number;
    }

    @Override
    public int getNumberOfElements() {
        return counter;
    }

    @Override
    public void addElement(int element) {
        if (root == null) {
            createRoot(element);
            counter=1;
        }
        else {
            Node toCheck = root;
            Node parent;
            while (true) {
                parent = toCheck;

                if (element > parent.number) {
                    toCheck = parent.right;
                    if (toCheck == null) {
                        counter++;
                        parent.right = new Node(element);
                        return;
                    }
                }
                if (element < parent.number) {
                    toCheck = parent.left;
                    if (toCheck == null) {
                        counter++;
                        parent.left = new Node(element);
                        return;
                    }
                }
                if (element == toCheck.number) {
                    Printer.print("Additional "+element + " will not be added as duplicates are not allowed in binary trees");
                    return;
                }
            }
        }
    }

    @Override
    public void addElements(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            addElement(elements[i]);
        }
    }

    @Override
    public boolean findElement(int value) {
        Node parent;
        Node toCheck = root;
        while (true) {
            parent = toCheck;
            if (value > parent.number) {
                toCheck = parent.right;
                if (toCheck == null) {
                    return false;
                }
                if (toCheck.number == value) {
                    return true;
                    }
            }
            else if (value < parent.number) {
                toCheck = parent.left;
                if (toCheck == null) {
                    return false;
                }
                if (toCheck.number == value) {
                    return true;
                }
            }
            else{
                return true;
            }
        }
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        try {
            Node toCheck = root;
            Node parent;
            for(int i = 0; i<getRootElement();i++) {
                parent = toCheck;
                if (element < parent.number) {
                    if (parent.left == null) {
                        throw new ChildNotFoundException("Value is not found");
                    }
                    toCheck = parent.left;
                    if (toCheck.number == element) {
                        if (toCheck.left == null) {
                            throw new ChildNotFoundException("Value is not found");
                        }
                        else {
                            return toCheck.left.number;
                        }
                    }
                }
                else if (element > parent.number) {
                    if (parent.right == null) {
                        throw new ChildNotFoundException("Value is not found");
                    }
                    toCheck = parent.right;
                }
                else {
                    if (parent.left == null) {
                        throw new ChildNotFoundException("Value is not found");
                    }
                    else {
                        return parent.left.number;
                    }
                }
            }
        }
        catch(ChildNotFoundException e){
            Printer.print(e.getMessage());
        }
        throw new ChildNotFoundException("Value is not found");
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        try {
            Node toCheck = root;
            Node parent;
            for(int i = 0; i<getRootElement();i++) {
                parent = toCheck;
                if (element > parent.number) {
                    if (parent.right == null) {
                        throw new ChildNotFoundException("Value is not found");
                    }
                    toCheck = parent.right;
                    if (toCheck.number == element) {
                        if (toCheck.right == null) {
                            throw new ChildNotFoundException("Value is not found");
                        }
                        else {
                            return toCheck.right.number;
                        }
                    }
                }
                else if (element < parent.number) {
                    if (parent.left == null) {
                        throw new ChildNotFoundException("Value is not found");
                    }
                    toCheck = parent.left;
                }
                else {
                    if (parent.right == null) {
                        throw new ChildNotFoundException("Value is not found");
                    }
                    else {
                        return parent.right.number;
                    }
                }
            }
        }
        catch(ChildNotFoundException e){
            Printer.print(e.getMessage());
        }
        throw new ChildNotFoundException("Value is not found");
    }

    @Override
    public int[] getSortedTreeAsc() {

        sorted = new int[counter];
        sorter = 0;
        Node toCheck = root;
        sortTreeAsc(toCheck);
        return sorted;
    }

    public void sortTreeAsc(Node node) {
        if(node.left != null) {
            sortTreeAsc(node.left);
        }
        sorted[sorter] = node.number;
        sorter++;
        if(node.right != null) {
            sortTreeAsc(node.right);
        }
    }

    @Override
    public int[] getSortedTreeDesc() {
        sorted = new int[counter];
        sorter = 0;
        Node toCheck = root;
        sortTreeDesc(toCheck);
        return sorted;
    }

    public void sortTreeDesc(Node node) {
        if (node.right != null) {
            sortTreeDesc(node.right);
        }
        sorted[sorter] = node.number;
        sorter++;
        if (node.left != null) {
            sortTreeDesc(node.left);
        }
    }
}
