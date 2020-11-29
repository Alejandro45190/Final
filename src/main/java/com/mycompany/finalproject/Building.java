package com.mycompany.finalproject;

public abstract class Building {
    public String street;
    public int number;
    public int bedrooms;
    public int restrooms;
    public String squareFeet;
    public int monthlyPrice;

    public Building(String street, int number, int bedrooms, int restrooms, String squareFeet, int monthlyPrice) {
        this.street = street;
        this.number = number;
        this.bedrooms = bedrooms;
        this.restrooms = restrooms;
        this.squareFeet = squareFeet;
        this.monthlyPrice = monthlyPrice;
    }

    public int getPrice() {
        return monthlyPrice;
    }

    public void setPrice(int monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
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

    public String getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(String squareFeet) {
        this.squareFeet = squareFeet;
    }

    @Override
    public String toString() {
        return "Street name: " + street + " Number: " + number + " bedrooms: " + bedrooms + " restrooms: "
                + restrooms + "square feet: " + squareFeet;
    }
}
