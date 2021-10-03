package br.edu.unifacef.model;

public class Produto {

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nomeProduto=" + nomeProduto + ", pesoProduto=" + pesoProduto + "]";
	}
	private Long id;
	private String nomeProduto;
	private Double pesoProduto;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double getPesoProduto() {
		return pesoProduto;
	}
	public void setPesoProduto(Double pesoProduto) {
		this.pesoProduto = pesoProduto;
	}
}
