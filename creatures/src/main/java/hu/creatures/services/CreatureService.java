package hu.creatures.services;

import hu.creatures.domain.Creature;
import org.springframework.stereotype.Service;

@Service
public class CreatureService {

    public Creature getCreature() {
        return new Creature();
    }
}


