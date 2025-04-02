package org.spring.ioc.intro;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

//Spring IOC Container a core component of spring framework which manages the lifecycle,
//dependency injection and configuration of the java bean(object).
//Spring IOC principles allow the container to instantiate and destruction of the object
//rather than they are managing by themselves.
public class SpringIOCContainer {
    public static void main(String[] args){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("config.xml");
        System.out.println("Is Ioc Loaded: " +beanFactory.getClass());
        Vehicle vehicle = beanFactory.getBean("Object1", Vehicle.class);
        vehicle.run();
    }
}
