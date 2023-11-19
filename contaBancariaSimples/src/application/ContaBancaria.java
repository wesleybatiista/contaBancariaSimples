package application;

import java.util.Locale;
import java.util.Scanner;

import entities.conta;

public class ContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		conta conta = new conta();
		
		System.out.println("Enter account Number:");
		conta.accountNumber = sc.nextInt();
		System.out.println("Enter account holder:");
		sc.nextLine();
		conta.client = sc.nextLine();
		
		
		System.out.println("Is there na initial deposit (y/n)? ");
		conta.initialDeposit = sc.nextLine();
		if(conta.initialDeposit.equalsIgnoreCase("y")) {
			System.out.println("Enter value: ");
			double value = sc.nextDouble();
			conta.addValue(value);
			
			System.out.println("Account data:");
			System.out.println(conta.toString());
		
			System.out.println("Enter a deposit value: ");
			value = sc.nextDouble();
			conta.addValue(value);
			
			System.out.println("Updated account data:");
			System.out.println(conta.toString());
			
			System.out.println("Enter a withdraw value: ");
			
			value = sc.nextDouble();
			conta.withValue(value);
			
			System.out.println("Updated account data:");
			System.out.println(conta.toString());
		}else if(conta.initialDeposit.equalsIgnoreCase("n")) {
			System.out.println("Account data:");
			System.out.println(conta.toString());
		
			System.out.println("Enter a deposit value: ");
			double value = sc.nextDouble();
			conta.addValue(value);
			
			System.out.println("Updated account data:");
			System.out.println(conta.toString());
			
			System.out.println("Enter a withdraw value: ");
			
			value = sc.nextDouble();
			conta.withValue(value);
			
			System.out.println("Updated account data:");
			System.out.println(conta.toString());
		}
		
		
		sc.close();

	}

}