package app;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConvert;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollar you be bougt? ");
		double qtd = sc.nextDouble();
		System.out.println();
		
		double amont = CurrencyConvert.dollarToReal(price, qtd);
		System.out.printf("Amont to be paid in reais = %.2f", amont);
		
		sc.close();

	}

}
