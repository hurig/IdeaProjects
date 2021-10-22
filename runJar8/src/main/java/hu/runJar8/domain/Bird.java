package hu.runJar8.domain;

public class Bird {
    private String species;
    private boolean wandering;
    private int height;

    public Bird(String species, boolean wandering, int height) {
        this.species = species;
        this.wandering = wandering;
        this.height = height;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isWandering() {
        return wandering;
    }

    public void setWandering(boolean wandering) {
        this.wandering = wandering;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

