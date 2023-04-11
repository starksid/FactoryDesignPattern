package DesignPattern.FactoryDesignPattern;

public class Postgreconnection implements Connection {
    public void creatingConnection(){
        System.out.println("Creating PostgreDB Connection");
    }    
}
