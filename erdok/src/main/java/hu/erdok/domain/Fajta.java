package hu.erdok.domain;

public class Fajta {

    private int id;
    private String megnevezes;
    private String besorolas;

    public Fajta(int id, String megnevezes, String besorolas) {
        this.id = id;
        this.megnevezes = megnevezes;
        this.besorolas = besorolas;
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

    public String getBesorolas() {
        return besorolas;
    }

    public void setBesorolas(String besorolas) {
        this.besorolas = besorolas;
    }
}
