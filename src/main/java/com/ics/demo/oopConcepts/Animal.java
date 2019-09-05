package com.ics.demo.oopConcepts;

public abstract class Animal {
    protected TypeOfEyes typeOfEyes;
    protected String  name;

    public Animal(TypeOfEyes typeOfEyes, String name) {
        this.typeOfEyes = typeOfEyes;
        this.name = name;
    }

    public TypeOfEyes getTypeOfEyes() {
        return typeOfEyes;
    }

    public void setTypeOfEyes(TypeOfEyes typeOfEyes) {
        this.typeOfEyes = typeOfEyes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
