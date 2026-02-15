package practice1;

public class SavingsAccount {
    public static void main(String[] args) {
        double balance = 100000.0;   // initial balance
        double interestRate = 0.08;  // 8%

        double interest = balance * interestRate;
        double newBalance = balance + interest;

        System.out.println("Initial balance: " + balance);
        System.out.println("Interest rate: " + (interestRate * 100) + "%");
        System.out.println("Interest added: " + interest);
        System.out.println("New balance: " + newBalance);
    }
}
