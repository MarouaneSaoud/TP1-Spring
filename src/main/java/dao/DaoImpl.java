package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /* se connecter a la bd pour récuperrer la temp*/
        double temp=Math.random()*40;

        return temp;
    }
}
