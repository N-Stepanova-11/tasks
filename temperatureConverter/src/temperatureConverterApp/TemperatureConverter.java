package temperatureConverterApp;

public class TemperatureConverter {
	public double toCelsius(double f) {
		return (f-32)/1.8;
	}
	
	public double toFahrenheit(double c) {
		return c*1.8+32;
	}
}
