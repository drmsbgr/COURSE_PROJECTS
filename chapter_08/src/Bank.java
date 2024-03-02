import java.util.List;

public class Bank {
    public static List<String> transactionHistory;

    public static void displayBankInfo() {
        for (String item : transactionHistory) {
            System.out.println(item);
        }
    }

    public static void trackTransaction(String desc) {
        transactionHistory.add(desc);
    }
}
