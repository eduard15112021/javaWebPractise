package povtor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "povtor")
public class AppConfig {
    @Bean(name = "driver")
    public Driver getDriver(){
        return new Driver();
    }

    @Bean(name = "car")
    public Car getCar(){
        return new Car();
    }
}
