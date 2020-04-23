package bg.tu_varna.java;

import java.util.HashMap;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Създаване на колекция с ключ и стойност за съхранение на акауните
		HashMap<Integer, BankAccount> accounts = new HashMap<Integer, BankAccount>();
		
		// Създаване на цикъл за въвеждане
		Scanner scanner = new Scanner(System.in);
		String command = scanner.nextLine();
		while (!command.equals("End")) {
			String[] cmdArgs = command.split("\\s+");
			// Проверка на въведената команда
			String cmdType = cmdArgs[0];
			switch (cmdType) {
			case "Create":
				exexCreate(cmdArgs, accounts);				
				break;
			case "Deposit":
				exexDeposit(cmdArgs, accounts);				
				break;
			case "Withdraw":
				exexWithdraw(cmdArgs, accounts);				
				break;
			case "Print":
				exexPrint(cmdArgs, accounts);				
				break;
			}
			
			command = scanner.nextLine();
		}
	}

	private static void exexPrint(String[] cmdArgs, HashMap<Integer, BankAccount> accounts) {
		int id = Integer.valueOf(cmdArgs[1]);
		if(!accounts.containsKey(id)) {
			System.out.println("Account does not exist");
		} else {
			System.out.println(accounts.get(id));
		}		
	}

	private static void exexWithdraw(String[] cmdArgs, HashMap<Integer, BankAccount> accounts) {
		int id = Integer.valueOf(cmdArgs[1]);
		int withdraw = Integer.valueOf(cmdArgs[2]);
		if(!accounts.containsKey(id)) {
			System.out.println("Account does not exist");
		} else if(accounts.get(id).getBalance() < withdraw) {
			System.out.println("Insufficient balances");
		} else {
			accounts.get(id).withdraw(withdraw);
		}
	}

	private static void exexDeposit(String[] cmdArgs, HashMap<Integer, BankAccount> accounts) {
		int id = Integer.valueOf(cmdArgs[1]);
		int deposit = Integer.valueOf(cmdArgs[2]);
		if(!accounts.containsKey(id)) {
			System.out.println("Account does not exist");
		} else {
			accounts.get(id).deposit(deposit);
		}
	}

	private static void exexCreate(String[] cmdArgs, HashMap<Integer, BankAccount> accounts) {
		int id = Integer.valueOf(cmdArgs[1]);
		if(accounts.containsKey(id)) {
			System.out.println("Account already exists");
		} else {
			BankAccount account = new BankAccount();
			account.setId(id);
			accounts.put(id, account);
		}
	}
}
