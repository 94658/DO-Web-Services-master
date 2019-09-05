package com.ics.demo.oopConcepts;

public class Bird extends Animal implements AnimalInterface{
    private TypeOfBeak typeOfBeak;

    public Bird(TypeOfEyes typeOfEyes, String name, TypeOfBeak typeOfBeak) {
        super(typeOfEyes, name);
        this.typeOfBeak = typeOfBeak;
    }


    public TypeOfBeak getTypeOfBeak() {
        return typeOfBeak;
    }

    public void setTypeOfBeak(TypeOfBeak typeOfBeak) {
        this.typeOfBeak = typeOfBeak;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "typeOfBeak=" + typeOfBeak +
                ", typeOfEyes=" + typeOfEyes +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Birds fly");
    }
}
