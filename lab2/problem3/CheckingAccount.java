package lab2.problem3;

public class CheckingAccount extends Account {
    private int transactionCount;
    public static final int FREE_TRANSACTIONS = 3;
    public static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int accountNumber) {
        super(accountNumber);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee() {
        int paidTransactions = transactionCount - FREE_TRANSACTIONS;
        if (paidTransactions > 0) {
            double fee = paidTransactions * TRANSACTION_FEE;
            super.withdraw(fee);
        }
        transactionCount = 0;
    }

    @Override
    public String toString() {
        return "CheckingAccount[accountNumber=" + getAccountNumber()
                + ", balance=" + getBalance()
                + ", transactionCount=" + transactionCount + "]";
    }
}
