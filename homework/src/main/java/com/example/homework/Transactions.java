package com.example.homework;

import java.time.LocalDate;
public class Transactions {
    private int value;
    private Trader trader;
    private int year;

    public Transactions(int value, Trader trader, int year)
    {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public int getValue() {return this.value;}
    public Trader getTrader() {return trader;}
    public int getYear() {return this.year; }
    @Override
    public String toString() {return "{ " + this.trader + ", " + "year: " + this.year + ", " + "value: " + this.value + "}"; }
}
