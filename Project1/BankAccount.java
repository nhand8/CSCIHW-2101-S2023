package Project1;

import java.util.Scanner;


public class BankAccount {
    public double balance;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public double getBalance(){
        return balance;
    }

    public void monthlyFee(){
        withdraw(10);
    }

    public void calcCompoundInterest(double p, int t, double r, int n){
        double amount = p * Math.pow(1 + (r / n), n*t);
        double compinterest = amount - p;
        System.out.println("Compound Interest after "+ t + " years: "+ compinterest);
        System.out.println("Amount after "+ t + " years: "+ amount);
    }

    public void investment(double balance, double r, double targetBalance){
        int year = 0; 
        while(balance<= targetBalance){
            year++;
            double interest = balance * r / 100;
            balance = balance + interest;
        }
        System.out.println("Total Balance: $"+ balance);
        System.out.println("Investment doubled After "+ year + " years.");
    }

    public static int menu() {
        
        int selection;
        Scanner input = new Scanner(System.in);

        /*******************************************/
        System.out.println("Please select an option:");
        System.out.println("------------------------\n");
        System.out.println("1: Get Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Transfer");
        System.out.println("5: Set up Savings Account");
        System.out.println("0: Quit");
        System.out.println("------------------------\n");

        selection = input.nextInt();

        return selection;
    }
    
    public void overdraft(int withdraw, BankAccount Bank){
        Scanner input = new Scanner(System.in);
        if(withdraw > Bank.getBalance()){
            System.out.println("You're withdrawing more than what's currently available in your account. You will be charged with an overdraft fee of $35 if you continue with this transaction. Will you continue? Y or N.");
            String answer = input.nextLine();
            if (answer.equals("Y")){
                Bank.withdraw(withdraw);
                Bank.withdraw(35);
            }
            else if (answer.equals("N")){
                System.out.println("Have a great day!");
            }
        }
        else{
            Bank.withdraw(withdraw);
        }
    }

    public void transfer(BankAccount bankAccount1, BankAccount bankAccount2, double transferAmount){
        bankAccount1.withdraw(transferAmount);
        bankAccount2.deposit(transferAmount);
        System.out.println(bankAccount2.getBalance());
    }

    public void calcSimpleInterest(double p, double r, int t){
        double amount = p * r * t;
        double divdedBy = amount/100;
        System.out.println("Amount after "+ t + " years: "+ divdedBy);
    }

    public void savingsAccount(BankAccount Bank){
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to set up a savings account? Y or N?");
        String answer = input.nextLine();
            if (answer.equals("Y")){
                    if(Bank.getBalance() > 1000){
                    System.out.println("Would you like a compound or flat interest rate? The compound interest rate is set at 0.0001%. The flat interest rate is set at .0001%. Flat or compound?");
                    String answer1 = input.nextLine();
                        if(answer1.equals("Flat")){
                            calcSimpleInterest(1000, 0.001, 10);
                        }
                        else if(answer1.equals("Compound")){
                            calcCompoundInterest(1000, 10, 0.00001, 4);
                        }
                        else{
                            System.out.println("You don't have enough money");
                        }
            }
            else if(answer.equals("N")){
                System.out.println("Have a great day!");
    }

            }
        }
    }
