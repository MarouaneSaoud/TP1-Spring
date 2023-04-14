package pres;

import metiers.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("dao","metiers");

        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println(metier.calcule());
    }
}
