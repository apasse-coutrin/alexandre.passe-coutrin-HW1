package com.example.homework;

import java.time.LocalDateTime;

public class Car {
    public enum Color{WHITE,
    RED,
    YELLOW,
    BLACK,
    BLUE,
    PURPLE,
    GREEN,
    ORANGE,
    PINK,
    GRAY,
    BROWN};
    private Wheel[] wheels;
    private int makeYear;
    private LocalDateTime creationTime;
    private Car.Color color;

    public Car(int makeYear, int nbWheels, int diameter, Car.Color color)
    {
        this.wheels = new Wheel[nbWheels];
        this.makeYear = makeYear;
        this.color = color;
        this.creationTime = LocalDateTime.now();
        for(int index = 0; index < nbWheels; index++)
        {
            this.wheels[index] = new Wheel(diameter);
        }
    }

    @Override
    public String toString()
    {
        return String.format("NbWheels : %d, average : %d, years of manufacturing : %d, color : %s, creation date : %s",
                this.wheels.length, this.wheels[0].getDiameter(), this.makeYear, this.color.toString(), this.creationTime.toString());
    }

    public int getMakeYear() {return this.makeYear;}
    public Car.Color getColor() {return this.color;}
    public int getNbWheels() {return this.wheels.length;}

}
