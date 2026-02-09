package temperatureConverterApp;

public class TemperatureConverter {
	private final double minCelsius = -273.15;
	private final double minFahrenheit = -459.67;
	
	public double toCelsius(double f) {
		if (f < minFahrenheit) {
			throw new IllegalArgumentException("Температура ниже абсолютного нуля");
		}
		return (f-32)/1.8;
	}
	
	public double toFahrenheit(double c) {
		if (c < minCelsius) {
			throw new IllegalArgumentException("Температура ниже абсолютного нуля");
		}
		return c*1.8+32;
	}
}
