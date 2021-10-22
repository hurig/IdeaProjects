package hu.firstjason.domain;

public class Person {
    private String name;
    private int age;
    private Pen pen;

    public Person(String name, int age, Pen pen) {
        this.name = name;
        this.age = age;
        this.pen = pen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }
}
