package exercicios;

import java.util.Scanner;

public class atv_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area;
		double pi = 3.14159;
		double raio;
		
		System.out.println("Digite o valor do raio de um círculo:");
		raio =  sc.nextDouble();
		
		area = pi*(raio*raio);
		
		System.out.printf("A área desse círculo é: %.4f", area);
		sc.close();
	}
}
