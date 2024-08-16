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
		
		System.out.println("Digite o código da primeira Peça:");
		novoid = sc.nextInt();
		peca2.setPeca_id(novoid);
		
		System.out.println("Digite a quantidade de Peças:");
		novaqtd = sc.nextInt();
		peca2.setPeca_qtd(novaqtd);
		
		System.out.println("Digite o valor da Peça:");
		novovalor = sc.nextDouble();
		peca2.setPeca_valor(novovalor);
		
		double soma = (peca1.getPeca_valor() * peca1.getPeca_qtd()) + (peca2.getPeca_valor() * peca2.getPeca_qtd());
		
		System.out.println("VALOR A PAGAR = " + soma);
		sc.close();
	}
}

//int func_id;
//double func_horas_trabalhadas;
//double func_valor_hora;
//double soma;
//

//		
//System.out.println("Digite as horas trabalhadas pelo funcionário:");
//func_horas_trabalhadas = sc.nextDouble();
//
//System.out.println("Digite o valor que ele recebe por hora:");
//func_valor_hora = sc.nextDouble();
//
//soma = func_horas_trabalhadas * func_valor_hora;
//
//System.out.printf(""
//		+ "NUMBER = %d\n"
//		+ "SALARY = U$ %.2f"
//		, func_id ,soma);





//public class Pessoa {
//
//
//// Método principal (main) para testar a classe
//public static void main(String[] args) {
//  // Criando um objeto da classe Pessoa
//  Pessoa pessoa1 = new Pessoa("João", 30);
//  
//  // Exibindo as informações da pessoa
//  pessoa1.exibirInformacoes();
//  
//  // Alterando o nome da pessoa
//  pessoa1.setNome("Carlos");
//  
//  // Exibindo as informações novamente após a alteração
//  pessoa1.exibirInformacoes();
//}
//}
