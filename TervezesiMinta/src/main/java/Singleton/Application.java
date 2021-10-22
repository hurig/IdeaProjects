package Singleton;

public class Application {

    public static void main(String[] args) {
        Child child1 = new Child("Klárika", 102);
        Child child2 = new Child("Botond", 60);
        child1.slide();
        child2.slide();
        child2.slide();
    }
}
