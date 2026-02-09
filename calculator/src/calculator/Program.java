package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.print("Value1: ");
			double value1 = scanner.nextDouble();
			System.out.print("Value2: ");
			double value2 = scanner.nextDouble();
			
			Calculator calc = new Calculator();
			System.out.printf("add: %.2f\n", calc.add(value1, value2));
			System.out.printf("substract: %.2f\n", calc.subtract(value1, value2));
			System.out.printf("multiply: %.2f\n", calc.multiply(value1, value2));
			System.out.printf("divide: %.2f\n", calc.divide(value1, value2));
		}catch(InputMismatchException e) {
			System.out.println("Ошибочные входные данные!");
		}
	}
}
