public class BankAccount extends Object{
    private String name;
    public double balance;
    private int accountNumber;
    public BankAccount(String name, double balance, int accountNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public  void setBalance(double balance) {
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Balance: " + balance + ", Account Number: " + accountNumber;
    }
}
