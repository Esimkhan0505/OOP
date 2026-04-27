package lab2.problem3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
    }

    @Override
    public String toString() {
        return "SavingsAccount[accountNumber=" + getAccountNumber()
                + ", balance=" + getBalance()
                + ", interestRate=" + interestRate + "%]";
    }
}
