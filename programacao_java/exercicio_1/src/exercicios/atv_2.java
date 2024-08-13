package exercicios;

import java.util.Scanner;

public class atv_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;

		System.out.println("Digite o valor de A:");
		a = sc.nextInt();
		System.out.println("Digite o valor de B:");
		b = sc.nextInt();
		c = a + b;

		System.out.println("Exercício 1:\n");
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);
		System.out.println("Soma dos dois: " + c);
	}
}
