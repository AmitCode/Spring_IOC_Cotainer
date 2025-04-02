package org.spring.ioc.intro;

public class Bike implements Vehicle{
    @Override
    public void run() {
        System.out.println("Bike is running!...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is not running!...");
    }
}
