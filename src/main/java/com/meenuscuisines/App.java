package com.meenuscuisines;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
import com.meenuscuisines.Desktop;
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext("AppConfig.class");
        Desktop dt=context.getBean(Desktop.class);
        dt.compile();
//        //        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
////        Alien obj=(Alien)context.getBean("alien","Alien.class");
////        obj.code();
////        int age = obj.getAge();
////        System.out.println(age);
//        System.out.println( "Hello World!" );
    }
}
