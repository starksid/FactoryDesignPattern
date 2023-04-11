package DesignPattern.FactoryDesignPattern;

public class PostgreDBF implements DatabaseFactory{
    public Connection createConnection(){
        return new Postgreconnection();
    }


    public DesignPattern.FactoryDesignPattern.Query createQuery(){
        return new PostgreQuery();
    }

}
