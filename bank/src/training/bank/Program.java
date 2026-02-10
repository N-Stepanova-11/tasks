package training.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.print("Номер аккаунта: ");
			int accountNumber = scanner.nextInt();
			BankAccount bankAccount = new BankAccount(accountNumber);
			
			System.out.print("Внесите средства на счет: ");
			bankAccount.deposit(scanner.nextDouble());

			System.out.print("Списать со счета: ");
			bankAccount.withdraw(scanner.nextDouble());
			
			System.out.println(bankAccount.getInfo());
		}catch(InputMismatchException e) {
			System.out.println("Данные введены неверно!");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}
}
