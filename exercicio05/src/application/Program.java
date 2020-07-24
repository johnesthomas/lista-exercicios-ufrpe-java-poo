package application;

import java.util.Scanner;

import entities.Venda;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("C�digo: ");
		String codigo = sc.nextLine();
		System.out.print("Descri��o: ");
		String descricao = sc.nextLine();
		System.out.print("Pre�o do Item: ");
		double precoItem = sc.nextDouble();
		System.out.print("Quantidade de Itens: ");
		int quantidadeItens = sc.nextInt();

		Venda venda = new Venda(codigo, descricao, precoItem, quantidadeItens);

		System.out.println();
		System.out.println(venda);

		sc.close();
	}
}