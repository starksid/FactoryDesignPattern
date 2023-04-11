package DesignPattern.FactoryDesignPattern;

public class MySQLdbf implements DatabaseFactory{


    @Override
    public Connection createConnection() {
        return new MySQLconnection();
    }

    public Query createQuery(){
        return new MySQLquery();
    }
}
