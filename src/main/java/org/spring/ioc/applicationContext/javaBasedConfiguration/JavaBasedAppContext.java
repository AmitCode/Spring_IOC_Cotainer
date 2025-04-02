package org.spring.ioc.applicationContext.javaBasedConfiguration;

import org.spring.ioc.intro.Bike;
import org.spring.ioc.intro.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedAppContext {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedAppConfig.class);
        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
        //Retrieving bean name should be same as @Bean annotated method.
        vehicle.run();
    }
}
