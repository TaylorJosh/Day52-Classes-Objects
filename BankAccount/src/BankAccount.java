public class BankAccount {
    double accountBalance;
    String name;

    public BankAccount(double accountBalance,
    String name){
        this.accountBalance = accountBalance;
        this.name = name;
    }

    public double deposit(double depositAmount){
        double balanceAfterDeposit = (this.accountBalance + depositAmount);
        this.accountBalance = balanceAfterDeposit;
        return balanceAfterDeposit;
    }

    public double withdrawal(double withdrawlAmount){
        double balanceAfterWithdrawl = (this.accountBalance - withdrawlAmount);
        this.accountBalance = balanceAfterWithdrawl;
        return balanceAfterWithdrawl;
    }

    public void accountDetails(){
        System.out.println("Account holder: " + this.name );
        System.out.println("Current account balance: " + this.accountBalance );
    }

}
