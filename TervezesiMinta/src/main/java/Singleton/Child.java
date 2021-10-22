package Singleton;

import Singleton.playground.IoCContainer;
import Singleton.playground.Slide;

public class Child {

    private String name;
    private int weight;
    private static Slide slide = IoCContainer.getSlider();

    public String getName() {
        return name;
    }

    public Child(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void slide(){
        if(slide.isFree()) {
            if (weight > slide.getMaxWeight()) {
                System.out.println(name + " beszorult a csúszdába.");
                slide.setFree(false);
            } else {
                System.out.println(name + " vidáman lecsúszott a "+ slide.getColor() +" csúszdán.");
            }
        } else {
            System.out.println(name + ", sajnos várnod kell, a csúszda foglalt.");
            System.out.println(name + " kirúgdossa a beszorult gyereket.");
            slide.setFree(true);
        }
    }

    public int getWeight() {
        return weight;
    }

}
