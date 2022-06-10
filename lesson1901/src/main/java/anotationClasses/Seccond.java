package anotationClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration
@Component
public class Seccond {
    private String marc;
    private int cost;

    //@Bean(name = "seccond")
    public Seccond() {
        System.out.println("second was created");
    }

}
