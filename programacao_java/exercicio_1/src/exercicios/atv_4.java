package exercicios;

import java.util.Scanner;

public class atv_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int func_id;
		double func_horas_trabalhadas;
		double func_valor_hora;
		double soma;
		
		System.out.println("Digite o código do funcionário:");
		func_id = sc.nextInt();
				
		System.out.println("Digite as horas trabalhadas pelo funcionário:");
		func_horas_trabalhadas = sc.nextDouble();
		
		System.out.println("Digite o valor que ele recebe por hora:");
		func_valor_hora = sc.nextDouble();
		
		soma = func_horas_trabalhadas * func_valor_hora;
		
		System.out.printf(""
				+ "NUMBER = %d\n"
				+ "SALARY = U$ %.2f"
				, func_id ,soma);
		
		sc.close();
	}
}