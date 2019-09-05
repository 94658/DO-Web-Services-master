package com.ics.demo.oopConcepts.shape;

public class Circle extends Shape implements ShapeInterface{


    public Circle(int noOfEdges, int lenght, int width) {
        super(noOfEdges, lenght, width);
    }

    @Override
    public int getArea(int lenght, int width) {
        return (22/7* lenght * width);
    }

    @Override
    public String toString() {
        return "No of edges: "+ getNoOfEdges()+
                "Area: "+ getArea(getLenght(), getWidth());
    }
}
