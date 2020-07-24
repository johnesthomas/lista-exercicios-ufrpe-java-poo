package entities;

public class Venda {

	String codigo;
	String descricao;
	Double precoItem;
	Integer quantidadeItens;

	public Venda() {
	}

	public Venda(String codigo, String descricao, Double precoItem, Integer quantidadeItens) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoItem = precoItem;
		this.quantidadeItens = quantidadeItens;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(Double precoItem) {
		this.precoItem = precoItem;
	}

	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}

	public void adicionarItem(int quantidadeItens) {
		this.quantidadeItens += quantidadeItens;
	}

	public double calcularPreco() {
		return precoItem * quantidadeItens;
	}

	public String toString() {
		return "Código: " + codigo + "\nDescrição: " + descricao + "\nPreço do Item: "
				+ String.format("%.2f", precoItem) + "\nQuantidade: " + quantidadeItens + "\nPreço Total: "
				+ String.format("%.2f", calcularPreco());
	}
}