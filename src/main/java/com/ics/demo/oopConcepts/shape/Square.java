package com.ics.demo.oopConcepts.shape;

public class Square extends Shape implements ShapeInterface {


    public Square(int noOfEdges, int length, int width) {
        super(noOfEdges, length, width);
    }

    @Override
    public int getArea(int lenght, int width) {
        return (lenght*width);
    }

    @Override
    public String toString() {
        return "No of edges: "+ getNoOfEdges()+
                "Area: "+ getArea(getLenght(), getWidth());
    }
}
