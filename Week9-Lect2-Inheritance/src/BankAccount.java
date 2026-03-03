import java.util.Objects;

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



    @Override
    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        BankAccount that = (BankAccount) o;
//        return Double.compare(balance, that.balance) == 0 && accountNumber == that.accountNumber && Objects.equals(name, that.name);
        BankAccount that = (BankAccount) o;
        if(this.accountNumber== that.accountNumber && this.name.equals(that.name) && this.balance==that.balance){
            return true;
        }else {
            return false;
        }


    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance, accountNumber);
    }
}
