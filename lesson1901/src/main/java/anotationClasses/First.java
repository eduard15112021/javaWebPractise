package anotationClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("firstBean")
public class First {
    private String name;
    private int age;


    public First() {
        System.out.println("first was created");
    }

}
