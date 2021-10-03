package br.edu.unifacef.model;

public class ItemPedido {

	private Long id;
	private Produto produto;
	private Double quantidade;
	private Double vlrUnitario;
	private Double vlrTotal;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	public Double getVlrUnitario() {
		return vlrUnitario;
	}
	public void setVlrUnitario(Double vlrUnitario) {
		this.vlrUnitario = vlrUnitario;
	}
	public Double getVlrTotal() {
		return vlrTotal;
	}
	public void setVlrTotal(Double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}
	
	@Override
	public String toString() {
		return "ItemPedido [id=" + id + ", produto=" + produto + ", quantidade=" + quantidade + ", vlrUnitario="
				+ vlrUnitario + ", vlrTotal=" + vlrTotal + "]";
	}

}
