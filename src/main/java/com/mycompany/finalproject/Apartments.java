package com.mycompany.finalproject;

public class Apartments extends Building{

    private String street;
    private int aptNum;
    private int bedrooms;
    private int restrooms;

    public Apartments(String street, int number, int bedrooms, int restrooms, String squareFeet, int monthlyPrice, boolean isTaken, String rentDue) {
        super(street, number, bedrooms, restrooms, squareFeet, monthlyPrice, isTaken, rentDue);
        this.street = street;
        this.aptNum = aptNum;
        this.bedrooms = bedrooms;
        this.restrooms = restrooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getAptNum() {
        return aptNum;
    }

    public void setAptNum(int aptNum) {
        this.aptNum = aptNum;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getRestrooms() {
        return restrooms;
    }

    public void setRestrooms(int restrooms) {
        this.restrooms = restrooms;
    }

    @Override
    public String toString() {
        return "Monthly price: " + monthlyPrice + ", Street name: " + street + ", Apartment number: " + aptNum + ", bedrooms: " + bedrooms + ", restrooms: "
                + restrooms + ", square feet: " + squareFeet + ", if its false its available for rent: " + isTaken + ", rent is over on: " + rentDue;
    }
}