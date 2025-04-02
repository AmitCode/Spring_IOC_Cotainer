package org.spring.ioc.applicationContext;

import org.spring.ioc.intro.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//ApplicationContext is the sub-interface of Bean Factory which is responsible for
//create, configuring and managing the life cycle of spring bean.
//ApplicationContext is the superset of Bean Factory that means it also provides the
//features of Bean Factory also.
public class XmlBasedConfigurationAppContext {
    public static void main(String[] args){
        ApplicationContext appContext = new
                ClassPathXmlApplicationContext("config.xml");
        Vehicle vehicle = appContext.getBean("Object2", Vehicle.class);
        vehicle.run();
    }
}
