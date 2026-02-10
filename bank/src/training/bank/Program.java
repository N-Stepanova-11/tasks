package training.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void showMenu() {
		System.out.println("Выберите код операции:");
		System.out.println("1 - Внести средства на счет");
		System.out.println("2 - Снять средства со счета ");
		System.out.println("3 - Показать баланс");
		System.out.println("4 - Выйти");
	}
	
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.print("Номер аккаунта: ");
			int accountNumber = scanner.nextInt();
			BankAccount bankAccount = new BankAccount(accountNumber);
			
			boolean running = true;
			while (running) {
				showMenu();				
				int menuItem = scanner.nextInt();
				if (menuItem<1 || menuItem>4) {
					throw new IllegalArgumentException("Нет такой операции!");
				}
				switch (menuItem) {
					case 1:
						System.out.print("Внесите средства на счет: ");
						bankAccount.deposit(scanner.nextDouble());
						break;
					case 2:
						System.out.print("Списать со счета: ");
						bankAccount.withdraw(scanner.nextDouble());
						break;
					case 3:
						System.out.println(bankAccount.getInfo());
						break;
					case 4:
						running = false;
						break;
				}
			}
		}catch(InputMismatchException e) {
			System.out.println("Данные введены неверно!");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}
}
