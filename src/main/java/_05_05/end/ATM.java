package _05_05.end;

public class ATM {

    public synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        if (balance - amount < 0) {
            System.out.println("Transaction denied");
        } else {
            System.out.println("Handling transaction...");
            account.debit(amount);
            System.out.println("$" + amount + " withdrawn");
        }
        System.out.println("Current balance: " + account.getBalance());
    }

}
