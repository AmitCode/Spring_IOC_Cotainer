package org.spring.ioc.beanFactory;

import org.spring.ioc.intro.Car;
import org.spring.ioc.intro.Vehicle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Bean factory is the simplest ioc container that will be responsible for instantiating,
//configure and manage the life cycle of spring beans.
//Spring Bean is the java object which is created,managed and destroyed by spring ioc container.
//It is the parent interface of ApplicationContext.

public class BeanFactoryIntro {
    public static void main(String[] args){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("config.xml");
        Vehicle vehicle = beanFactory.getBean("Object2", Vehicle.class);
        vehicle.run();
        System.out.println("Bean class info: " +beanFactory.getClass().getName());
        //System.out.println("Bean Type info: " +vehicle.getClass().getName());
        //System.out.println("");
        System.out.println("Is Object4 exists: " +beanFactory.containsBean("Object4"));
    }
}
