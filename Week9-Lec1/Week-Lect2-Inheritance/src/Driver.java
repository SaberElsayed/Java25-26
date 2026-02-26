public class Driver {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Saber", 0, 12345);

        System.out.println(bankAccount);

        SavingAccount s= new SavingAccount("Ali", 0, 1555, 2.5);

        System.out.println(s);
    }
}
