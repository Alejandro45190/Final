package com.mycompany.finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Start {

    static String yesOrno()
    {
        Scanner sc = new Scanner(System.in);
        String choice;
        System.out.print("Continue? (y/n): ");
        choice = sc.next();
        System.out.println();
        return choice;
    }

    public static void startProgram()  throws FileNotFoundException {
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
                    System.out.println("What are the price range you are looking at?");
                    Scanner priceRange = new Scanner(System.in);
                    int price;
                    price = priceRange.nextInt();

                    Houses a1 = new Houses("West Elm", 483, 2, 1, "1,000 sqft", 672);
                    Houses a2 = new Houses("N Belknap St", 793, 2, 1, "980 sqft", 850);
                    Houses a3 = new Houses("W Pecan St", 1025, 3, 2, "1,532 sqft", 1050);
                    Houses a4 = new Houses("S College Farm Rd", 760, 2, 2, "870 sqft", 1500);
                    Houses a5 = new Houses("N Estes St", 1399, 3, 1, "1,692 sqft", 95000);
                    Houses a6 = new Houses("N Race St", 671, 3, 1, "934 sqft", 105000);
                    Houses a7 = new Houses("N Ollie St", 1011, 3, 2, "1,537 sqft", 134000);
                    Houses a8 = new Houses("S First Ave", 484, 2, 2, "2,030 sqft", 2218000);

                    ArrayList<Houses> h1 = new ArrayList<>();
                    h1.add(a1);
                    h1.add(a2);
                    h1.add(a3);
                    h1.add(a4);
                    h1.add(a5);
                    h1.add(a6);
                    h1.add(a7);
                    h1.add(a8);

                    int count = 0;
                    for (int i = 0; i < h1.size(); i++) {
                        if (h1.get(i).getPrice() <= price) {
                            System.out.println(h1.get(i));
                        } else if (price < 672) {
                            System.out.println("We don't have any houses lower than that amount.");
                            break;
                        }
                        count++;
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
                    System.out.println("What are the price range you are looking for?");
                    Scanner priceRange2 = new Scanner(System.in);
                    int price2;
                    price2 = priceRange2.nextInt();

                    Apartments b1 = new Apartments("1000 E Lingleville Rd", 243, 1, 1, "N/A", 448);
                    Apartments b2 = new Apartments("1000 E Lingleville Rd", 400, 2, 1, "N/A", 1185);
                    Apartments b3 = new Apartments("1136 W Washington Ave", 320, 1, 1, "N/A", 620);
                    Apartments b4 = new Apartments("1136 W Washington Ave", 122, 2, 2, "N/A", 660);
                    Apartments b5 = new Apartments("1136 W Washington Ave", 460, 3, 2, "N/A", 675);
                    Apartments b6 = new Apartments("1136 W Washington Ave", 500, 4, 2, "N/A", 700);
                    Apartments b7 = new Apartments("1136 W Washington Ave", 120, 5, 3, "N/A", 785);
                    Apartments b8 = new Apartments("1191 W Vanderbilt St", 119, 1, 1, "N/A", 575);
                    Apartments b9 = new Apartments("1191 W Vanderbilt St", 243, 2, 2, "N/A", 730);
                    Apartments b10 = new Apartments("1191 W Vanderbilt St", 352, 3, 2, "N/A", 840);
                    Apartments b11 = new Apartments("1191 W Vanderbilt St", 201, 4, 2, "N/A", 895);

                    ArrayList<Apartments> a1 = new ArrayList<>();
                    a1.add(b1);
                    a1.add(b2);
                    a1.add(b3);
                    a1.add(b4);
                    a1.add(b5);
                    a1.add(b6);
                    a1.add(b7);
                    a1.add(b8);
                    a1.add(b9);
                    a1.add(b10);
                    a1.add(b11);
                    int count2 = 0;
                    for (int j = 0; j < a1.size(); j++) {
                        if (a1.get(j).getPrice() <= price2) {
                            System.out.println(a1.get(j));
                        } else if (price2 < 448) {
                            System.out.println("We don't have any apartments lower than that amount.");
                            break;
                        }
                        count2++;
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
                    System.out.println("What are the price range you are looking for?");
                    Scanner priceRange3 = new Scanner(System.in);
                    int price3;
                    price3 = priceRange3.nextInt();

                    TownHomes c1 = new TownHomes("1790 N. Graham Street", 123, 2, 2, "N/A", 500);
                    TownHomes c2 = new TownHomes("1790 N. Graham Street", 220, 3, 2, "N/A", 680);
                    TownHomes c3 = new TownHomes("101 E. Riverside Dr.", 100, 1, 2, "N/A", 450);
                    TownHomes c4 = new TownHomes("101 E. Riverside Dr.", 232, 2, 2, "N/A", 780);
                    TownHomes c5 = new TownHomes("101 E. Riverside Dr.", 333, 3, 2, "N/A", 1000);
                    TownHomes c6 = new TownHomes("101 E. Riverside Dr.", 264, 4, 4, "N/A", 1230);
                    TownHomes c7 = new TownHomes("385 E. Elm St.", 109, 1, 2, "N/A", 450);
                    TownHomes c8 = new TownHomes("385 E. Elm St.", 225, 2, 2, "N/A", 780);
                    TownHomes c9 = new TownHomes("385 E. Elm St.", 326, 3, 2, "N/A", 1000);

                    ArrayList<TownHomes> t1 = new ArrayList<>();
                    t1.add(c1);
                    t1.add(c2);
                    t1.add(c3);
                    t1.add(c4);
                    t1.add(c5);
                    t1.add(c6);
                    t1.add(c7);
                    t1.add(c8);
                    t1.add(c9);
                    int count3 = 0;
                    for (int k = 0; k < t1.size(); k++) {
                        if (t1.get(k).getPrice() <= price3) {
                            System.out.println(t1.get(k));
                        } else if (price3 < 450) {
                            System.out.println("We don't have any town homes lower than that amount.");
                            break;
                        }
                        count3++;
                    }
                    choice = yesOrno();
                }
                default -> System.out.println("Please choose 1-3");
            }
            // see if the user wants to continue
        }while(choice.equalsIgnoreCase("y"));
    }
}
