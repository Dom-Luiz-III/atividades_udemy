package exercicios;

import java.util.Scanner;
import util.Peca;

public class atv_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Peca peca1 = new Peca(0, 0, 0);

		System.out.println("Digite o código da primeira Peça:");
		int novoid = sc.nextInt();
		peca1.setPeca_id(novoid);

		System.out.println("Digite a quantidade de Peças:");
		int novaqtd = sc.nextInt();
		peca1.setPeca_qtd(novaqtd);

		System.out.println("Digite o valor da Peça:");
		double novovalor = sc.nextDouble();
		peca1.setPeca_valor(novovalor);

		Peca peca2 = new Peca(0, 0, 0);

		System.out.println("Digite o código da segunda Peça:");
		novoid = sc.nextInt();
		peca2.setPeca_id(novoid);

		System.out.println("Digite a quantidade de Peças:");
		novaqtd = sc.nextInt();
		peca2.setPeca_qtd(novaqtd);

		System.out.println("Digite o valor da Peça:");
		novovalor = sc.nextDouble();
		peca2.setPeca_valor(novovalor);

		double soma = (peca1.getPeca_valor() * peca1.getPeca_qtd()) + (peca2.getPeca_valor() * peca2.getPeca_qtd());

		System.out.printf("VALOR A PAGAR = R$ %f", soma);
		sc.close();
	}
}
