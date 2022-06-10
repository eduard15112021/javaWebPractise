package anotationClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thirdBean")
public class Third {
    private String country;
    private int population;


    public Third() {
        System.out.println("Third was created");
    }
}
