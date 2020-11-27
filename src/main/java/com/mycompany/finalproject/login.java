package com.mycompany.finalproject;

import java.util.Scanner;

public class login {

    private static String username;
    private static String password;

    public login(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static void login() {
        int redo = 0;
        Scanner sc = new Scanner(System.in);
        while (redo != 1) {
            System.out.println("Enter username: ");
            String username = sc.nextLine();
            System.out.println("Enter password: ");
            String password = sc.nextLine();
            if (username.equals("Admin") && password.equals("Tarleton2020")) {
                System.out.println("Correct credentials.");
                redo =+ 1;
            }
            else {
                System.out.println("Incorrect credentials.");
            }
        }
    }
}
