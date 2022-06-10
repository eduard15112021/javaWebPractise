package povtor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("povtor");
        Driver driver = context.getBean("driver",Driver.class);
        driver.gassPedal();
    }
}
