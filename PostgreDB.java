package DesignPattern.FactoryDesignPattern;

import javax.management.Query;

public class PostgreDB implements Database{
    public DatabaseFactory createFactory(){
        return  new PostgreDBF();
    }

}
