import java.util.List;

public class Account {
    private String accountNumber;
    private String owner;
    private double balance;

    public Account(String accountNumber, String owner, double balance) {
        super();
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        Bank.trackTransaction("Hesabınıza " + amount + " miktar yatırıldı.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            Bank.trackTransaction("Hesabınızdan " + amount + " miktar çekildi.");
        }
    }

    public void viewBalance() {
        System.out.println(owner + "\n" + accountNumber + "\n" + balance);
    }

    public static List<Account> accounts;
}
