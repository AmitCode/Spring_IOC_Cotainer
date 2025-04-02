package org.spring.ioc.beanFactory;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

//Since XmlBeanFactory is excluded from Spring from version 3.1.
/*The DefaultListableBeanFactory is one of the most widely used and flexible implementations of the BeanFactory interface in Spring.
It is the backbone of most ApplicationContext implementations (such as AnnotationConfigApplicationContext and ClassPathXmlApplicationContext), providing powerful features like bean registration, dependency injection, and lifecycle management.*/
public class DefaultListableBeanFactoryIntro {
    public static void main(String[] args){

        DefaultListableBeanFactory beanFactory =
                new DefaultListableBeanFactory();
        BeanDefinitionBuilder beanDefinitionBuilder =
                BeanDefinitionBuilder.genericBeanDefinition(UserClass.class);
        beanFactory.registerBeanDefinition("myBean",beanDefinitionBuilder.getBeanDefinition());
        UserClass userClass = beanFactory.getBean("myBean", UserClass.class);
        userClass.message();
    }
}
