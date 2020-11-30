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
        login.login();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        do{
            System.out.print("Enter if you want a house, apartment, town home, or ranch:   ");
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

                    Houses a1 = new Houses("West Elm", 483, 2, 1, "1,000", 672, false, "November 23, 2021");
                    Houses a2 = new Houses("N Belknap St", 793, 2, 1, "980", 850, true, "July 23, 2021");
                    Houses a3 = new Houses("W Pecan St", 1025, 3, 2, "1,532", 1050, false, "December 11, 2020");
                    Houses a4 = new Houses("S College Farm Rd", 760, 2, 2, "870", 1500, true, "December 28, 2020");
                    Houses a5 = new Houses("N Estes St", 1399, 3, 1, "1,692", 95000, true, true, "January 1, 2021");
                    Houses a6 = new Houses("N Race St", 671, 3, 1, "934", 105000, false, true, "January 8, 2021");
                    Houses a7 = new Houses("N Ollie St", 1011, 3, 2, "1,537", 134000, false, true, "December 31, 2020");
                    Houses a8 = new Houses("S First Ave", 484, 2, 2, "2,030", 2218000, true, true, "December 31, 2020");

                    ArrayList<Houses> h1 = new ArrayList<>();
                    h1.add(a1);
                    h1.add(a2);
                    h1.add(a3);
                    h1.add(a4);
                    h1.add(a5);
                    h1.add(a6);
                    h1.add(a7);
                    h1.add(a8);

                    for (int i = 0; i < h1.size(); i++) {
                        if (h1.get(i).getMonthlyPrice() <= price) {
                            System.out.println(h1.get(i));
                        } else if (price < 672) {
                            System.out.println("We don't have any houses lower than that amount.");
                            break;
                        }
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

                    Apartments b1 = new Apartments("1000 E Lingleville Rd", 243, 1, 1, "N/A", 448, false, "January 1, 2021");
                    Apartments b2 = new Apartments("1000 E Lingleville Rd", 400, 2, 1, "N/A", 1185, true, "December 21, 2021");
                    Apartments b3 = new Apartments("1136 W Washington Ave", 320, 1, 1, "N/A", 620, false, "March 7, 2022");
                    Apartments b4 = new Apartments("1136 W Washington Ave", 122, 2, 2, "N/A", 660, false, "November 30, 2020");
                    Apartments b5 = new Apartments("1136 W Washington Ave", 460, 3, 2, "N/A", 675, false, "November 28, 2020");
                    Apartments b6 = new Apartments("1136 W Washington Ave", 500, 4, 2, "N/A", 700, true, "January 3, 2021");
                    Apartments b7 = new Apartments("1136 W Washington Ave", 120, 5, 3, "N/A", 785, false, "January 1, 2022");
                    Apartments b8 = new Apartments("1191 W Vanderbilt St", 119, 1, 1, "N/A", 575, true, "December 12, 2020");
                    Apartments b9 = new Apartments("1191 W Vanderbilt St", 243, 2, 2, "N/A", 730, false, "February 1, 2021");
                    Apartments b10 = new Apartments("1191 W Vanderbilt St", 352, 3, 2, "N/A", 840, false, "February 3, 2022");
                    Apartments b11 = new Apartments("1191 W Vanderbilt St", 201, 4, 2, "N/A", 895, true, "January 1, 2020");

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
                    for (int j = 0; j < a1.size(); j++) {
                        if (a1.get(j).getMonthlyPrice() <= price2) {
                            System.out.println(a1.get(j));
                        } else if (price2 < 448) {
                            System.out.println("We don't have any apartments lower than that amount.");
                            break;
                        }
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

                    TownHomes c1 = new TownHomes("1790 N. Graham Street", 123, 2, 2, "N/A", 500, false, "January 2, 2021");
                    TownHomes c2 = new TownHomes("1790 N. Graham Street", 220, 3, 2, "N/A", 680, false, "December 20, 2020");
                    TownHomes c3 = new TownHomes("101 E. Riverside Dr.", 100, 1, 2, "N/A", 450, false, "December 29, 2020");
                    TownHomes c4 = new TownHomes("101 E. Riverside Dr.", 232, 2, 2, "N/A", 780, true, "January 3, 2023");
                    TownHomes c5 = new TownHomes("101 E. Riverside Dr.", 333, 3, 2, "N/A", 1000, false, "January 1, 2021");
                    TownHomes c6 = new TownHomes("101 E. Riverside Dr.", 264, 4, 4, "N/A", 1230, false, "July 8, 2022");
                    TownHomes c7 = new TownHomes("385 E. Elm St.", 109, 1, 2, "N/A", 450, false, "July 31, 2021");
                    TownHomes c8 = new TownHomes("385 E. Elm St.", 225, 2, 2, "N/A", 780, true, "August 1, 2023");
                    TownHomes c9 = new TownHomes("385 E. Elm St.", 326, 3, 2, "N/A", 1000, true, "August 4, 2022");

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
                    for (int k = 0; k < t1.size(); k++) {
                        if (t1.get(k).getMonthlyPrice() <= price3) {
                            System.out.println(t1.get(k));
                        } else if (price3 < 450) {
                            System.out.println("We don't have any town homes lower than that amount.");
                            break;
                        }
                    }
                    choice = yesOrno();
                }
                case "ranch" -> {
                    Scanner s4 = new Scanner(new File("C:\\Users\\Alejandro\\IdeaProjects\\Final\\src\\main\\java\\com\\mycompany\\finalproject\\ranchAvailable.txt"));
                    ArrayList<String> list4 = new ArrayList<>();
                    while (s4.hasNextLine()) {
                        list4.add(s4.nextLine());
                    }
                    s4.close();
                    for (String num : list4) {
                        System.out.println(num);
                    }
                    System.out.println("What are the price range you are looking for?");
                    Scanner priceRange4 = new Scanner(System.in);
                    int price4;
                    price4 = priceRange4.nextInt();

                    ranches d1 = new ranches("4th Avenue", 200, 1, 1, "87120", 2000, true, "2", "December 5, 2020");
                    ranches d2 = new ranches("Hawthorne Avenue", 108, 2, 1, "108900", 3000, true, "2.5", "January 15, 2021");
                    ranches d3 = new ranches("Cleveland Street", 366, 3, 2, "108900", 3500, true, "2.5", "February 7, 2021");
                    ranches d4 = new ranches("Amherst Street", 310, 2, 2, "87120", 3000, false, "2", "November 30, 2020");
                    ranches d5 = new ranches("Riverside Drive", 256, 3, 2, "130680", 4000, false, "3", "November 3, 2020");
                    ArrayList<ranches> r1 = new ArrayList<>();
                    r1.add(d1);
                    r1.add(d2);
                    r1.add(d3);
                    r1.add(d4);
                    r1.add(d5);
                    for (int k = 0; k < r1.size(); k++) {
                        if (r1.get(k).getMonthlyPrice() <= price4) {
                            System.out.println(r1.get(k));
                        } else if (price4 < 2000) {
                            System.out.println("We don't have any ranches lower than that amount.");
                            break;
                        }
                    }
                    choice = yesOrno();
                }
                default -> System.out.println("Please type one of the words.");
            }
            // see if the user wants to continue
        }while(choice.equalsIgnoreCase("y"));
    }
}