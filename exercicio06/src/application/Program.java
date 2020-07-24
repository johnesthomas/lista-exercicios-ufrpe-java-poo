package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LivroNotas livroNotas = new LivroNotas();
		double nota = 0;
		int cont = 1;

		do {

			System.out.println("Digite a nota #" + (cont) + ":");
			nota = sc.nextDouble();

			if (nota > 0) {

				livroNotas.adicionaNota(nota);
				livroNotas.setQuantidadeNotas(cont);

				cont++;
			}

		} while (nota > 0);

		System.out.println(livroNotas);

		sc.close();
	}
}