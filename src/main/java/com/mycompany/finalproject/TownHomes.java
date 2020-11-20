package com.mycompany.finalproject;

public class TownHomes extends Building{
    private String street;
    private int townhomeNum;
    private int bedrooms;
    private int restrooms;
    private char floor;
    private int squareFeet;

    public TownHomes(String street, int number, int bedrooms, int restrooms, int squareFeet) {
        super(street, number, bedrooms, restrooms, squareFeet);
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

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }    
}
