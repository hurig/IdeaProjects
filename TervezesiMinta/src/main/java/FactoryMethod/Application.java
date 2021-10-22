package FactoryMethod;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("Jolán", "Debrecen");
        person.driveTo("Levelek");
        System.out.println(person.getName() + " arrived to: "+ person.getPosition());
    }
}
