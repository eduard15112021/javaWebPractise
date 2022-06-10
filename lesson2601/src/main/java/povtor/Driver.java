package povtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class Driver {

    @Autowired
    private Car car;

    public void gassPedal(){
        car.speedDegrees();
    }
}
