package application;

public class LivroNotas {

	private double somaNotas;
	private int quantidadeNotas;

	public LivroNotas() {
	}

	public double getSomaNotas() {
		return somaNotas;
	}

	public void setSomaNotas(double somaNotas) {
		this.somaNotas = somaNotas;
	}

	public int getQuantidadeNotas() {
		return quantidadeNotas;
	}

	public void setQuantidadeNotas(int quantidadeNotas) {
		this.quantidadeNotas = quantidadeNotas;
	}

	public void adicionaNota(double nota) {
		this.somaNotas += nota;
	}

	public double calcularMedia() {
		return somaNotas / quantidadeNotas;
	}

	public String toString() {
		return "Quantidade de Notas: " + quantidadeNotas + "\nMédia das Notas: "
				+ String.format("%.2f", calcularMedia());
	}
}