package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account = null;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        sc.nextLine(); 

        System.out.print("Is there an initial deposit? (y/n) ");
        char decision = sc.next().charAt(0);
        
        switch (decision) {
            case 'y':
                System.out.print("Enter initial deposit value: ");
                double initialDeposit = sc.nextDouble();
                account = new Account(number, holder, initialDeposit);
                break;

            case 'n':
            	account = new Account(number, holder);
                break;

            default:
                System.out.println("Invalid option.");
        }
        
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);
  
        sc.close();
    }
}