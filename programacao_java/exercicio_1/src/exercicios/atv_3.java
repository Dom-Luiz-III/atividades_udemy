package exercicios;

import java.util.Scanner;

public class atv_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		
		
		System.out.println("Digite o valor de A:");
		a = sc.nextInt();
		
		System.out.println("Digite o valor de B:");
		b = sc.nextInt();
		
		System.out.println("Digite o valor de C:");
		c = sc.nextInt();
		
		System.out.println("Digite o valor de D:");
		d = sc.nextInt();
		
		int total = (a*b)-(c*d);
		
		System.out.println("DIFERENÇA = "+ total);
		sc.close();
	}
}