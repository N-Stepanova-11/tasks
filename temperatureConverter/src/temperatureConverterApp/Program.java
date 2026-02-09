package temperatureConverterApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			TemperatureConverter tc = new TemperatureConverter();

			System.out.print("Температура в цельсиях: ");
			double celsius = scanner.nextDouble();
			System.out.printf("Результат в фаренгейтах: %.2f\n\n", tc.toFahrenheit(celsius));
			
			System.out.print("Температура в фаренгейтах: ");
			double fahrenheit = scanner.nextDouble();
			System.out.printf("Результат в цельсиях: %.2f", tc.toCelsius(fahrenheit));	
		}catch(InputMismatchException e) {
			System.out.println("Ошибочные входные данные");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
