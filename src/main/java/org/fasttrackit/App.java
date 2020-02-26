package org.fasttrackit;

import javafx.scene.chart.CategoryAxis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("----------------------------------");
        System.out.println( "Welcome to the racing game! Testing version..." );
        System.out.println("----------------------------------");

        Car carReference = new Car();
        carReference.name = "Opel";
        carReference.color = "Green";
        carReference.maxSpeed = 300;
        carReference.mileage = 10.9;

        Engine engine1 = new Engine();
        engine1.manufacturer = "GM";
        engine1.capacity = 3000;
        carReference.engine = engine1;

        System.out.println("Engine details:");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);
        System.out.println("-----------------------------");

        engine1.capacity = 4000;
        System.out.println("New engine details:");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);
        System.out.println("-----------------------------");


        System.out.println("Properties of " + carReference.name + ":");
        System.out.println("Color: " + carReference.color);
        System.out.println("Max Speed: " + carReference.maxSpeed);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Racing number: " + carReference.racingNumber);
        System.out.println("Damage: " + carReference.damaged);
        System.out.println("-----------------------------");

        Car carNew = new Car();
        carNew.name = "Tesla";
        carNew.damaged = true;

        System.out.println("Properties of " + carNew.name + ":");
        System.out.println("Color: " + carNew.color);
        System.out.println("Damage: " + carNew.damaged);
        System.out.println("-----------------------------");
    }
}
