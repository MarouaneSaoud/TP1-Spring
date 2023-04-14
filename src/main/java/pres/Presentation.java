package pres;

import ext.DaoImpl2;
import metiers.MetierImpl;

public class Presentation {
    public static void main(String[] args){
        /*injection des dépendancs par instanciation statique =>new*/
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcule());
        System.out.println("Resultats="+metier.calcule());

    }
}
