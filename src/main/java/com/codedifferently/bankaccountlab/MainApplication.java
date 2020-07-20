package com.codedifferently.bankaccountlab;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList <BankAccount> Account = new ArrayList<>();

    public static void main(String[] args) {
        CheckingAccount acount1 = new CheckingAccount(1234567, "Sue", 20.00, 1234, 100.00, 0.5);
        Account.add(acount1);

       // MainApplication atm = new MainApplication();
        //atm.startMainApplication();
        System.out.println("Welcome to the Code Differently ATM. Select options by Number. Choose an option from below to start:\n1.Access Acount\n2.Create Account");
        
            Integer selection = scanner.nextInt();
            if(selection == 2){
                System.out.println("Select Account Type:\n1.Checkings\n2.Savings\n3.Business");
                Integer create = scanner.nextInt();
                if(create == 1) {
                    createCheckingAcc();
                }
                else if(create == 2) {
                    createSavingsAcc();
                } else {
                    createBusinessAcc();
                }
            }else if(selection == 1) {
                System.out.println("Enter Account Number");
                int AccNumber = scanner.nextInt();
                BankAccount viewAccount = Account.get(find(AccNumber));
                System.out.println("Enter Pin:");
                int pinNumber = scanner.nextInt();
                if(pinNumber == viewAccount.getPin()) {
                    System.out.println("What do you want to do? \n1.Withdraw\n2.Deposit\n3.Delete");
                    Integer choice = scanner.nextInt();
                    if(choice == 1){
                        System.out.print("Enter Amount:");
                        Double withdraw = scanner.nextDouble();
                        viewAccount.withdraw(withdraw);
                        System.out.println("Your new Account Balance is:"+ viewAccount.getBalance());
                    } else if(choice == 2){
                        System.out.print("Enter Amount:");
                        Double deposit = scanner.nextDouble();
                        viewAccount.deposit(deposit);
                        System.out.println("Your new Account Balance is:"+ viewAccount.getBalance());
                    } else {
                        System.out.println("Are you sure you want to delete this account?\n1.Yes\n2.No");
                        Integer deleteAcc = scanner.nextInt();
                        if(deleteAcc == 1) {
                            Account.remove(viewAccount);
                        System.out.println("Account Deleted");
                        } else {
                            System.out.print("Account still active");
                        }
                    }
                } else {
                    System.out.print("Try Again");
                }
            }
        }
        
    public static int find(int AccNumber) {
        for(int i= 0; i< Account.size(); i++){
            if(Account.get(i).getAccountNumber() == AccNumber)
                return i;
            }
            return 0;
        }
    
    public static CheckingAccount createCheckingsAcc() {
        System.out.print("Enter an acount number of 8 numbers:");
        Integer accountNum = scanner.nextInt();

        System.out.print("Enter your name:");
        String name = scanner.next();

        
        Double fees = 20.00;
        System.out.print("The Checkings Account fee is:" + fees);
        

        System.out.print("\nCreate a 4 digit pin:");
        Integer pin = scanner.nextInt();

        Double balance = 0.0;
        Double rate = 0.5;
        System.out.print("\nYour balance starts at:" + balance + "\nand your account rate is:" + rate);
        System.out.print("\nAccount had been created!");
        return new CheckingAccount(accountNum, name, fees, pin, balance, rate);
    }

    public static SavingsAccount createSavingsAcc() {
        System.out.print("Enter an acount number of 8 numbers:");
        Integer accountNum = scanner.nextInt();

        System.out.print("Enter your name:");
        String name = scanner.next();

        
        Double fees = 30.00;
        System.out.print("The Savings Account fee is:" + fees);
        

        System.out.print("\nCreate a 4 digit pin:");
        Integer pin = scanner.nextInt();

        Double balance = 0.0;
        Double rate = 0.5;
        System.out.print("\nYour balance starts at:" + balance + "\nand your account rate is:" + rate);
        System.out.print("\nAccount had been created!");
        return new SavingsAccount(accountNum, name, fees, pin, balance, rate);
    }

    public static BusinessAccount createBusinessAcc() {
        System.out.print("Enter an acount number of 8 numbers:");
        Integer accountNum = scanner.nextInt();

        System.out.print("Enter employee name:");
        String name = scanner.next();

        
        Double fees = 60.00;
        System.out.print("The Business fee is:" + fees);
        

        System.out.print("\nCreate a 4 digit pin:");
        Integer pin = scanner.nextInt();

        Double balance = 0.0;
        System.out.print("\nYour balance starts at:" + balance );

        System.out.print("\nEnter Company tax ID:");
        Integer taxId = scanner.nextInt();

        System.out.print("\nEnter Company's name:");
        String company = scanner.next();

        System.out.print("\nAccount had been created!");
        return new BusinessAccount(accountNum, name, fees, pin, balance, taxId, company);

    }
}