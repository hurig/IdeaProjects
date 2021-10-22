package configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(context.getBean("getChild", Child.class));
        int n = context.getBean("randomNumber", Integer.class);
        for (int i = 0; i < n; i++) {
            System.out.println(context.getBean("getName", String.class));
        }


    }

}
