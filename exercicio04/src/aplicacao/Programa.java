package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = sc.nextInt();

		Fatorial ft = new Fatorial(numero);

		System.out.println(ft);

		sc.close();
	}

}
