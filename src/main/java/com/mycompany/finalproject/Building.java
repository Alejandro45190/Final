package com.mycompany.finalproject;

public class Building {
    private String street;
    private int number;
    private int bedrooms;
    private int restrooms;
    private int squareFeet;

    public Building(String street, int number, int bedrooms, int restrooms, int squareFeet) {
        this.street = street;
        this.number = number;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }
}
