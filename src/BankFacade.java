// The BankFacade class is the facade for the banking system
public class BankFacade {
    // The account associated with the BankFacade
    private Account account;
    private BankTransfer transferSubsystem;

    // Constructor for the BankFacade class
    public BankFacade(int accountNumber, double balance) {
        account = new Account(accountNumber, balance);
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        this.account.deposit(amount);
        this.transferSubsystem = new BankTransfer();
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws Exception {
        this.account.withdraw(amount);
    }

    // Method to get the current balance of the account
    public double getBalance() {
        return this.account.getBalance();
    }

    public void transfer(Account from, Account to, double amount) throws Exception {
        transferSubsystem.transfer(from, to, amount);
    }
}
