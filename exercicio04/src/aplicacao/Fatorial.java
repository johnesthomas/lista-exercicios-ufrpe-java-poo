package aplicacao;

public class Fatorial {
	
	private int numero;
	
	public Fatorial() {		
	}	

	public Fatorial(int numero) {
		
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void resultadoFatorial() {

		int fatorial = 0;
		for (int i = 1; i < numero - 1; i++) {

			if (i == 1) {
				fatorial += numero * (numero - i);

			} else {
				fatorial = fatorial * (numero - i);
			}
		}		
	}
	
	public String tostring() {
		return String.format("%d", numero);
		
	}
}
