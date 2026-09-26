package util;

public class CurrencyConverter {

	public static double dollarValue = 3.10;
	
	public static double FinalValue(double value) {
		return value * dollarValue * 1.06; 		
	}
	
}
