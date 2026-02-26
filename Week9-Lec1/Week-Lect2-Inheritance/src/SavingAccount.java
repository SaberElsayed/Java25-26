public class SavingAccount extends BankAccount{
    private double profitRate;

    SavingAccount(String name, double balance, int accountNumber, double profitRate) {
        super(name, balance, accountNumber);
        this.profitRate = profitRate;

    }


    @Override
    public String toString(){
        return  super.toString() + ", profit rate is: " +  profitRate + "\n";
    }

}
