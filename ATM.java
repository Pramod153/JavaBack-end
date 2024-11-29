package com.control_statements;

import java.util.Scanner;

public class ATM {
	
	public static final String userPassword="1234";
	public static double balance=500.00;
	public static int max_count =3;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int withdraw,deposit;
		boolean authenticated = false;
		while(count<max_count) {
			System.out.println("enter your password:");
			String option=sc.nextLine();
			
			if(option.equals(userPassword)) {
				authenticated=true;
				break;
			}else {
				count++;
				System.out.println("invalid Password try again");
			}
		}
		if(!authenticated) {
			System.out.println("you reach password limits");
			sc.close();
			return;
		}
		System.out.println("Access granted,welcome !!");
		
		while (true) {
            System.out.println("**Automated Teller Machine**");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
           
            System.out.print("Choose the operation you want to perform:");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = sc.nextInt();
                     if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money\n");
                    } else {
                        System.out.println("Insufficient Balance \n");
                    }
                     break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully depsited\n");
                    break;

                case 3:
                   
                    System.out.println("Balance : " + balance);
                    break;

                default:
                    
                    System.out.println("Invalid Choice");
            }
	}

}
}
