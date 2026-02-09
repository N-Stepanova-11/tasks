package calculator;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Value1: ");
		int value1 = scanner.nextInt();
		System.out.print("Value2: ");
		int value2 = scanner.nextInt();
		System.out.println("add: " + Calculator.add(value1, value2));
		System.out.println("substract: " + Calculator.substract(value1, value2));
		System.out.println("multiply: " + Calculator.multiply(value1, value2));
		System.out.println("divide: " + Calculator.divide(value1, value2));
	}
}
