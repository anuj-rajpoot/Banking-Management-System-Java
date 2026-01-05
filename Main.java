import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankOperations bank = new BankOperations();

        while (true) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Account No: ");
                int acc = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Balance: ");
                double bal = sc.nextDouble();
                bank.createAccount(acc, name, bal);
            }
            else if (choice == 2) {
                bank.deposit(sc.nextInt(), sc.nextDouble());
            }
            else if (choice == 3) {
                bank.withdraw(sc.nextInt(), sc.nextDouble());
            }
            else if (choice == 4) {
                bank.checkBalance(sc.nextInt());
            }
            else if (choice == 5) {
                System.out.println("Exit");
                break;
            }
        }
        sc.close();
    }
}
