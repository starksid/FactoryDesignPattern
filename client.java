package DesignPattern.FactoryDesignPattern;

public class client {
    public static void main(String[] args) {
        Database db = new MySQLDB();
        DatabaseFactory dbf = db.createFactory();
        Query q = dbf.createQuery();
        q.creatingQuery();
    }
}
