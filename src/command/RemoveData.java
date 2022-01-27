package command;

public class RemoveData implements Command {
    private DbManager db;

    public RemoveData(DbManager db) {
        this.db = db;
    }

    @Override
    public void execute() {
        this.db.removeData();
    }
}
