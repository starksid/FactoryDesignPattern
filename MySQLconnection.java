package DesignPattern.FactoryDesignPattern;

public class MySQLconnection implements Connection{
    public void creatingConnection(){
        System.out.println("Creating MySQL connection");
    }
}
