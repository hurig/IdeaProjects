package Singleton.playground;

import java.util.Random;

public class Slide {

    private final String COLOR = "green";
    private final int MAXWEIGHT = 100;
    private boolean free = true;

    protected static Slide getInstance(){
        return new Slide();
    }

    private Slide() {
    }


    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public String getColor() {
        return COLOR;
    }

    public int getMaxWeight() {
        return MAXWEIGHT;
    }
}
