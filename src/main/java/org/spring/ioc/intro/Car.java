package org.spring.ioc.intro;

public class Car implements Vehicle{
    @Override
    public void run() {
        System.out.println("Car is running!...");
    }

    @Override
    public void stop() {
        System.out.println("Car is not running!...");
    }
}
