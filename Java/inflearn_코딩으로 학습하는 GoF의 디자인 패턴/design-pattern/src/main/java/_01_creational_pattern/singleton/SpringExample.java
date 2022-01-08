package _01_creational_pattern.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);
        String hello3 = applicationContext.getBean("hello", String.class);
        System.out.println(hello == hello2);
        System.out.println(hello2 == hello3);
    }
}
