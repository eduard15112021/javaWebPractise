package anotationClasses;

import XMLClasses.About;
import XMLClasses.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml","applicationContext1.xml"
//        );
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml","applicationContext1.xml"
        );
        //ApplicationContext context1 = ApplicationConfigApplicationContext(Seccond.class);
        //context.close();
    }
}
