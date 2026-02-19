import java.util.Arrays;

public class BankAccount {
    private int balance = 0;
    public static void addMore(BankAccount b, int n){
        while(n>0){
            b.balance+=5;
            n--;
        }

    }
    public static void main(String[] args) {
        int n=5;
        BankAccount bA=new BankAccount();
        addMore(bA,n);
        System.out.println("Balance: "+bA.balance);
        System.out.println("n: "+n);
        BankAccount b2=new BankAccount();
        System.out.println("Balance: "+bA.balance);
        System.out.println("Balance: "+b2.balance);
    }
}
