package hu.runJar8.services;

import hu.runJar8.domain.Bird;
import org.springframework.stereotype.Service;

@Service
public class BirdService {

    public Bird getABird(){
        return new Bird("eagle", false, 75);
    }

}
