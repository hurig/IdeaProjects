package component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Animal animal1 = context.getBean(Animal.class);
        Animal animal2 = context.getBean(Animal.class);
        Animal animal3 = context.getBean(Animal.class);
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);


    }
}
