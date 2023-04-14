package pres;

import metiers.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpring {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        IMetier iMetier =(IMetier) applicationContext.getBean("metier");
        System.out.println(iMetier.calcule());
    }
}
