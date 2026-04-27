package lab2.problem3;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savings = new SavingsAccount(1001, 5.0);
        CheckingAccount checking = new CheckingAccount(2001);

        savings.deposit(1000);
        checking.deposit(500);
        checking.withdraw(50);
        checking.deposit(100);
        checking.withdraw(20);
        checking.deposit(10);

        bank.openAccount(savings);
        bank.openAccount(checking);

        System.out.println("Before update:");
        bank.printAccounts();

        bank.update();

        System.out.println("\nAfter update:");
        bank.printAccounts();
    }
}
