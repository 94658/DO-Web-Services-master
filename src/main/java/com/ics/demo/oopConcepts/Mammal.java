package com.ics.demo.oopConcepts;

public class Mammal extends Animal implements AnimalInterface{
    private int noOfLegs;
    private int gestationPeriod;


    public Mammal(TypeOfEyes typeOfEyes, String name, int noOfLegs, int gestationPeriod) {
        super(typeOfEyes, name);
        this.gestationPeriod = gestationPeriod;
        this.noOfLegs = noOfLegs;
    }

    @Override
    public void move() {
        System.out.println("Mammals walk");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "noOfLegs=" + noOfLegs +
                ", gestationPeriod=" + gestationPeriod +
                ", typeOfEyes=" + typeOfEyes +
                ", name='" + name + '\'' +
                '}';
    }
}
