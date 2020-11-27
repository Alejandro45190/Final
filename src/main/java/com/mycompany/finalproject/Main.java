package com.mycompany.finalproject;

import java.util.ArrayList;
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
        login.login();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        do{
            System.out.print("Enter if you want a house, apartment or town home:   ");
            String building = sc.nextLine().trim().toLowerCase();

            switch (building) {
                case "house" -> {
                    Scanner s = new Scanner(new File("C:\\Users\\Alejandro\\IdeaProjects\\Final\\src\\main\\java\\com\\mycompany\\finalproject\\housesAvailable.txt"));
                    ArrayList<String> list = new ArrayList<>();
                    while (s.hasNextLine()) {
                        list.add(s.nextLine());
                    }
                    s.close();
                    for (String num : list) {
                        System.out.println(num);
                    }
                    choice = yesOrno();
                }
                case "apartment" -> {
                    Scanner s2 = new Scanner(new File("C:\\Users\\Alejandro\\IdeaProjects\\Final\\src\\main\\java\\com\\mycompany\\finalproject\\apartmentAvailable.txt"));
                    ArrayList<String> list2 = new ArrayList<>();
                    while (s2.hasNextLine()) {
                        list2.add(s2.nextLine());
                    }
                    s2.close();
                    for (String num : list2) {
                        System.out.println(num);
                    }
                    choice = yesOrno();
                }
                case "town home" -> {
                    Scanner s3 = new Scanner(new File("C:\\Users\\Alejandro\\IdeaProjects\\Final\\src\\main\\java\\com\\mycompany\\finalproject\\townHomeAvailable.txt"));
                    ArrayList<String> list3 = new ArrayList<>();
                    while (s3.hasNextLine()) {
                        list3.add(s3.nextLine());
                    }
                    s3.close();
                    for (String num : list3) {
                        System.out.println(num);
                    }
                    choice = yesOrno();
                }
                default -> System.out.println("Please choose 1-3");
            }
            // see if the user wants to continue
        }while(choice.equalsIgnoreCase("y"));
    }
}
