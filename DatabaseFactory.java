package DesignPattern.FactoryDesignPattern;

public interface DatabaseFactory {
    Connection createConnection();
    Query createQuery();
}
