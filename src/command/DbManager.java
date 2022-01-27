package command;

public class DbManager {
    private String dbName;

    public DbManager(String dbName) {
        this.dbName = dbName;
    }

    public void addData() {
        System.out.println("Data added to database " + this.dbName);
    }

    public void removeData() {
        System.out.println("Data removed to database " + this.dbName);
    }
}
