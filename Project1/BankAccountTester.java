package Project1;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount dylanChecking = new BankAccount();
        BankAccount freddieChecking = new BankAccount(10000);

        System.out.println(dylanChecking.getBalance());
        System.out.println("Balance Starting");
        System.out.println(freddieChecking.getBalance());
        freddieChecking.withdraw(500);
        System.out.println("Balance After withdraw");
        System.out.println(freddieChecking.getBalance());
        freddieChecking.deposit(100);
        System.out.println("Balance After Deposit");
        System.out.println(freddieChecking.getBalance());

        System.out.println(dylanChecking.getBalance());
        
        dylanChecking.deposit(50000);
        dylanChecking.calcInterest(dylanChecking.getBalance(), 10, 0.40, 12);


    }
}