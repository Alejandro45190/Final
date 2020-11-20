package com.mycompany.finalproject;

public class Apartments extends Building{
    private String street;
    private int aptNum;
    private int bedrooms;
    private int restrooms;

    public Apartments(String street, int number, int bedrooms, int restrooms, int squareFeet) {
        super(street, number, bedrooms, restrooms, squareFeet);
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
}
