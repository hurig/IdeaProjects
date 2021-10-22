package hu.intro.domain;

public class Chair {
    private int legs;
    private String material;

    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "legs=" + legs +
                ", material='" + material + '\'' +
                '}';
    }
}
