package lab2.problem3;

public class Account {
    private double balance;
    private int accountNumber;

    public Account(int accountNumber) {
        this.balance = 0.0;
        this.accountNumber = accountNumber;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
        }
    }

    public void withdraw(double sum) {
        if (sum > 0 && sum <= balance) {
            balance -= sum;
        } else {
            System.out.println("Withdrawal failed for account " + accountNumber);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void transfer(double amount, Account other) {
        if (amount > 0 && amount <= balance) {
            withdraw(amount);
            other.deposit(amount);
        } else {
            System.out.println("Transfer failed.");
        }
    }

    @Override
    public String toString() {
        return "Account[accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }

    public final void print() {
        System.out.println(toString());
    }
}
