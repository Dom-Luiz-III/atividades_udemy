package exercicios;

import java.util.Scanner;

public class atv_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;

		System.out.println("Digite o valor de A:");
		double a = sc.nextDouble();
				
		System.out.println("Digite o valor de B:");
		double b = sc.nextDouble();
		
		System.out.println("Digite o valor de C:");
		double c = sc.nextDouble();
		
		double triangulo = (a*c)/2;
		double circulo = pi*(c*c);
		double trapezio = ((a+b)*c)/2;
		double quadrado = b*b;
		double retangulo = a*b;
		
		System.out.printf(""
				+ "\nTRIÂNGULO = %.3f\n"
				+ "CIRCULO = %.3f\n"
				+ "TRAPÉZIO = %.3f\n"
				+ "QUADRADO = %.3f\n"
				+ "RETANGULO = %.3f\n"
				, triangulo ,circulo, trapezio, quadrado, retangulo);
		
		sc.close();
	}
}