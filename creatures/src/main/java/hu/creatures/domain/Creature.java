package hu.creatures.domain;

public class Creature {
    private int id;
    private String name;
    private String ability;
    private int magicalPower;

    public Creature() {
        this.id=0;
        this.name="Phoenix";
        this.ability="rebirth";
        this.magicalPower=10;
    }

    public Creature(int id, String name, String ability, int magicalPower) {
        this.id = id;
        this.name = name;
        this.ability = ability;
        this.magicalPower = magicalPower;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getMagicalPower() {
        return magicalPower;
    }

    public void setMagicalPower(int magicalPower) {
        this.magicalPower = magicalPower;
    }
}
