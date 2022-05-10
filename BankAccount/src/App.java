import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        BankAccount joeAccount = new BankAccount(500, "Joe");
        BankAccount janeAccount = new BankAccount(5000, "Jane");
        BankAccount peteAccount = new BankAccount(300, "Peter");
        
        double joeDeposit = joeAccount.deposit(100);
        joeAccount.accountDetails();

        double janeWithdrawl = janeAccount.withdrawal(100);
        double peteDeposit = peteAccount.deposit(100);
        janeAccount.accountDetails();
        peteAccount.accountDetails();
    }
}
