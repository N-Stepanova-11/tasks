package calculator;

public class Calculator {
	public double add(double value1, double value2) {
		return value1+value2;
	}
	
	public double subtract(double value1, double value2) {
		return value1-value2;
	}
	
	public double multiply(double value1, double value2) {
		return value1*value2;
	}
	
	public double divide(double value1, double value2) {
		if (value2!=0) {
			return (double)value1/(double)value2;
		}
		return 0;
	}
}
