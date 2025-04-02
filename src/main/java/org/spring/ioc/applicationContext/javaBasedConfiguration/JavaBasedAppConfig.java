package org.spring.ioc.applicationContext.javaBasedConfiguration;

import org.spring.ioc.intro.Bike;
import org.spring.ioc.intro.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaBasedAppConfig {

    @Bean
    public Vehicle vehicle(){
        return new Bike();
    }
}
