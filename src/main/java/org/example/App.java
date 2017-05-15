package org.example;

import org.example.service.AopService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        AopService service = context.getBeansOfType(AopService.class).values().iterator().next();
        service.service();
        service.anotherService();
    }
}
