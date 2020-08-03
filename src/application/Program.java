package application;

import java.util.Scanner;

import entities.Account;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados da conta");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Nome: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo Inicial: ");
		double saldo = sc.nextInt();
		System.out.print("Saque Limite: ");
		double saqueLimite = sc.nextInt();
		
		Account acc = new Account(number, holder, saldo, saqueLimite);
		try {
		System.out.print("Entre com a quantia para saque:");
		double amount = sc.nextDouble();
		acc.saque(amount);
		System.out.print("Novo saldo: " + String.format("%.2f", acc.getSaldo()));
		}
		catch(DomainException e) {
			System.out.println("Erro de saque: " + e.getMessage());
		}
		
		
		
		
		sc.close();

	}

}
