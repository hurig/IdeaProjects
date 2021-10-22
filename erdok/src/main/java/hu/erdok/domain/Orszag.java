package hu.erdok.domain;

public class Orszag {
    private int id;
    private String megnevezes;
    private int terulet;

    public Orszag(int id, String megnevezes, int terulet) {
        this.id = id;
        this.megnevezes = megnevezes;
        this.terulet = terulet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMegnevezes() {
        return megnevezes;
    }

    public void setMegnevezes(String megnevezes) {
        this.megnevezes = megnevezes;
    }

    public int getTerulet() {
        return terulet;
    }

    public void setTerulet(int terulet) {
        this.terulet = terulet;
    }
}
