package com.mycompany.finalproject;

public class Houses extends Building{

    private String street;
    private int houseNum;
    private int bedrooms;
    private int restrooms;
    private String squareFeet;

    public Houses(String street, int houseNum, int bedrooms, int restrooms, String squareFeet, int monthlyPrice) {
        super(street, houseNum, bedrooms, restrooms, squareFeet, monthlyPrice);
        this.street = street;
        this.houseNum = houseNum;
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

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
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
        return "Monthly price: " + monthlyPrice + ", Street name: " + street + ", House number: " + houseNum + ", bedrooms: " + bedrooms + ", restrooms: "
                + restrooms + ", square feet: " + squareFeet;
    }
}
