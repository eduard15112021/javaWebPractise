package dz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Person person = context.getBean("person",Person.class);
        System.out.println(person.getName());
        Boolean flag = true;
        Car car= person.chooseTheCar();
        while (flag){
            System.out.println("------------------------------"+"\n"+"выберите действие:"+"\n"+"1) выбрать другую машину"+"\n"+"2) завести машину"+"\n"
                    +"3) нажать на педаль газа"+"\n" +"4) закрыть программу");
            int i=scanner.nextInt();
            switch (i){
                case (1):
                    car=person.chooseTheCar();
                    break;
                case (2):
                    car.StartCar(car);
                    break;
                case (3):
                    car.gasPedal(car);
                    break;
                default:flag=false;
            }
        }
    }
}
