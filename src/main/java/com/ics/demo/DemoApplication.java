package com.ics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);



    }

}
//        Bird bird = new Bird(TypeOfEyes.COMPOUND, "Ostrich", TypeOfBeak.BLUNT);
//        Mammal mammal = new Mammal(TypeOfEyes.SIMPLE, "Man", 2, 9);
//        Fish fish = new Fish(TypeOfEyes.COMPOUND, "Shark fish", 4);
//
//        System.out.println("Bird: "+bird.toString()+ "\n Fish: "+ fish.toString()+ "\n Mammal: "+mammal.toString());
//        bird.move();
//        mammal.move();
//

//        Circle circle = new Circle(1, 7, 7);
//        Triangle triangle = new Triangle(3, 7, 6);
//        Square square = new Square(4, 6, 6);
//        System.out.println("Bird: "+circle.toString()+ "\n Fish: "+ triangle.toString()+ "\n Mammal: "+square.toString());
