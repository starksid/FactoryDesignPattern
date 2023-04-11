package DesignPattern.FactoryDesignPattern;

public class MySQLDB implements Database {
    public DatabaseFactory createFactory(){
        return new MySQLdbf();
    }

}
