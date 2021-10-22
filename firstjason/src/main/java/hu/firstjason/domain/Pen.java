package hu.firstjason.domain;

public class Pen {
    private int serial;
    private String color;
    private boolean empty;

    public Pen(int serial, String color, boolean empty) {
        this.serial = serial;
        this.color = color;
        this.empty = empty;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
