package util;

public class CurrencyConvert {

	public static double IOF = 0.06;
	
	public static double dollarToReal(double price, double amont) {
		return price * amont * (1.0 + IOF);
	}
	
}
