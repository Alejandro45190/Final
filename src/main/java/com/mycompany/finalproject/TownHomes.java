package com.mycompany.finalproject;

public class TownHomes extends Building{

    private String street;
    private int townhomeNum;
    private int bedrooms;
    private int restrooms;
    private char floor;
    private String squareFeet;

    public TownHomes(String street, int townhomeNum, int bedrooms, int restrooms, String squareFeet, int monthlyPrice) {
        super(street, townhomeNum, bedrooms, restrooms, squareFeet, monthlyPrice);
        this.street = street;
        this.townhomeNum = townhomeNum;
        this.bedrooms = bedrooms;
        this.restrooms = restrooms;
        this.squareFeet = squareFeet;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getTownhomeNum() {
        return townhomeNum;
    }

    public void setTownhomeNum(int townhomeNum) {
        this.townhomeNum = townhomeNum;
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

    public char getFloor() {
        return floor;
    }

    public void setFloor(char floor) {
        this.floor = floor;
    }

    public String getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(String squareFeet) {
        this.squareFeet = squareFeet;
    }

    @Override
    public String toString() {
        return "Monthly price: " + monthlyPrice + ", Street name: " + street + ", Townhome number: " + townhomeNum + ", bedrooms: " + bedrooms + ", restrooms: "
                + restrooms + ", square feet: " + squareFeet;
    }
}
