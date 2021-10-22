package hu.intro.services;

import hu.intro.domain.Chair;
import org.springframework.stereotype.Service;

@Service
public class ChairService {

    public Chair getChair(){
        return new Chair(4, "wood");
    }
}
