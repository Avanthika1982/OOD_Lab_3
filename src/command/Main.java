package command;

public class Main {

    public static void main(String[] args) {
	    DbManager db = new DbManager("School_Management_System");

        DbTransactions dbTransactions = new DbTransactions();

        dbTransactions.addTransaction(new AddData(db));
        dbTransactions.addTransaction(new RemoveData(db));

        dbTransactions.processTransactions();
    }
}
