package com.mycompany.finalproject;

public class Ranches extends Building {

    private String acres;

    public Ranches(String street, int number, int bedrooms, int restrooms, String squareFeet, int monthlyPrice, boolean isTaken, String acres, String rentDue) {
        super(street, number, bedrooms, restrooms, squareFeet, monthlyPrice, isTaken, rentDue);
        this.acres = acres;
    }

    public String getAcres() {
        return acres;
    }

    public void setAcres(String acres) {
        this.acres = acres;
    }

    @Override
    public String toString() {
        return "Monthly price: " + monthlyPrice + ", Street name: " + street + ", Ranch number: " + number + ", bedrooms: " + bedrooms + ", restrooms: "
                + restrooms + ", acres: " + acres + ", square feet: " + squareFeet + ", true if its taken or false its available for rent: " + isTaken + ", rent is over on: " + rentDue;
    }
}
