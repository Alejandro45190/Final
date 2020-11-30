package com.mycompany.finalproject;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        welcome w = () -> System.out.println("Welcome to the realtor program!");
        w.message();
        Start.startProgram();
    }
}