package com.sparta.alexanderlegon.SortManager;

import com.sparta.alexanderlegon.SortManager.exceptions.InputException;
import com.sparta.alexanderlegon.SortManager.printer.Printer;

public class Main {
    public static void main(String[] args) {
        try{
        Starter.start();
        }
        catch (InputException e) {
            System.out.println(e.getMessage());
        }
        finally {
            Printer.print("Program terminated");
        }
    }
}
