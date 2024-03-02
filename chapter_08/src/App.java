import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Account acc1 = new Account("0001", "Buğra", 2850);
        Account acc2 = new Account("0002", "Buğra", 3250);
        Account acc3 = new Account("0003", "Buğra", 1200);

        Account.accounts = new ArrayList<Account>();
        Account.accounts.add(acc1);
        Account.accounts.add(acc2);
        Account.accounts.add(acc3);

        Bank.transactionHistory = new ArrayList<>();

        acc1.withdraw((2000));
        acc2.deposit(1200);
        acc3.withdraw(500);

        Bank.displayBankInfo();
    }
}
