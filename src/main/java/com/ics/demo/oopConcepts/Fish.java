package com.ics.demo.oopConcepts;

public class Fish extends Animal implements AnimalInterface{
    private int noOfFins;


    public Fish(TypeOfEyes typeOfEyes, String name, int noOfFins) {
        super(typeOfEyes, name);
        this.noOfFins = noOfFins;
    }



    @Override
    public void move() {
        System.out.println("Fish swim");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "noOfFins=" + noOfFins +
                ", typeOfEyes=" + typeOfEyes +
                ", name='" + name + '\'' +
                '}';
    }
}
