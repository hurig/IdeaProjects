package component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope("prototype")
public class Animal {
    private String species;
    private String continent;

    public Animal(){
        String[] specieses = {"wolf", "fox", "bear", "rabbit", "eagle"};
        String[] continents = {"Europe", "Asia", "North-America", "South-America", "Africa", "Australia"};
        Random random = new Random();
        this.species=specieses[random.nextInt(specieses.length)];
        this.continent=continents[random.nextInt(continents.length)];
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", continent='" + continent + '\'' +
                '}';
    }
}
