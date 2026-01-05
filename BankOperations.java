import java.util.HashMap;

public class BankOperations {

    private HashMap<Integer, BankAccount> accounts = new HashMap<>();

    public void createAccount(int accNo, String name, double balance) {
        accounts.put(accNo, new BankAccount(accNo, name, balance));
        System.out.println("Account created");
    }

    public void deposit(int accNo, double amount) {
        BankAccount acc = accounts.get(accNo);
        if (acc != null) {
            acc.deposit(amount);
            System.out.println("Deposit successful");
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(int accNo, double amount) {
        BankAccount acc = accounts.get(accNo);
        if (acc != null && acc.withdraw(amount)) {
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance or account not found");
        }
    }

    public void checkBalance(int accNo) {
        BankAccount acc = accounts.get(accNo);
        if (acc != null) {
            System.out.println("Balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found");
        }
    }
}
