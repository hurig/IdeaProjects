package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class Config {

    @Bean
    public String getName(){
        return "Sanyi";
    }
    @Bean
    public int randomNumber(){
        return new Random().nextInt(8)+1;
    }
    @Bean
    public Child getChild(){
        return  new Child("Tünde", 18, 175);
    }


}
