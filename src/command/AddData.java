package command;

public class AddData implements Command {
    private DbManager db;

    public AddData(DbManager db) {
        this.db = db;
    }

    @Override
    public void execute() {
        this.db.addData();
    }
}
