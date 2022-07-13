package com.example.homework;

public class Trader {
    private String name;
    private String city;
    private boolean isVegetarian;

    public Trader(String n, String c, boolean isVegetarian)
    {
        this.name = n;
        this.city = c;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {return this.name;}
    public String getCity() {return this.city;}
    public boolean getIsVegetarian() {return this.isVegetarian;}
    @Override
    public String toString() {return "Trader " + this.name + " in " + this.city + " is " + this.isVegetarian + " vegetarian";}
}
