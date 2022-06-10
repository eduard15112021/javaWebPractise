package povtor;

import java.util.Random;

public class Car {

    public void speedDegrees(){
        Random random = new Random();
        System.out.println("speed  "+random.nextInt(150));
    }
}
