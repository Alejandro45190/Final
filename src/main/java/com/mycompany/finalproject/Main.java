package com.mycompany.finalproject;

import java.util.Scanner;
import java.io.*;

public class Main {

    static String yesOrno()
    {
        Scanner sc = new Scanner(System.in);
        String choice;
        System.out.print("Continue? (y/n): ");
        choice = sc.next();
        System.out.println();
        return choice;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to the Realtor application!");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        String choice = "y";
        do{
            System.out.print("Enter if you want a house, apartment or town home:   ");
            String building = sc.nextLine().trim().toLowerCase();

            switch (building) {
                case "house":
                    System.out.println("We have plenty of houses for you.");
                    System.out.println();
                    File file = new File("C:\\Users\\alexr\\Documents\\NetBeansProjects\\finalProject\\src\\main\\java\\com\\mycompany\\finalproject\\housesAvailable.txt");
                    Scanner scan = new Scanner(file);
                    while(scan.hasNextLine()){
                        System.out.println(scan.nextLine());
                    }
                    choice = yesOrno();
                    break;
                case "apartment":
                    System.out.println("We have plenty of choices for apartments.");
                    System.out.println();
                    File file2 = new File("C:\\Users\\alexr\\Documents\\NetBeansProjects\\finalProject\\src\\main\\java\\com\\mycompany\\finalproject\\apartmentAvailable.txt");
                    Scanner scan2 = new Scanner(file2);
                    while(scan2.hasNextLine()){
                        System.out.println(scan2.nextLine());
                    }
                    choice = yesOrno();
                    break;
                case "town home":
                    System.out.println("We have a couple of town home for you.");
                    choice = yesOrno();
                    break;
                default:
                    System.out.println("Please choose 1-3");
            }
            // see if the user wants to continue
        }while(choice.equalsIgnoreCase("y"));
    }
}
