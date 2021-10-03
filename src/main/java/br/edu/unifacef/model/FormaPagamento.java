package br.edu.unifacef.model;

public class FormaPagamento {

	private Long id;
	private String descricao;
	private Integer qtdParcela;

	@Override
	public String toString() {
		return "FormaPagamento [id=" + id + ", descricao=" + descricao + ", qtdParcela=" + qtdParcela + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getQtdParcela() {
		return qtdParcela;
	}
	public void setQtdParcela(Integer qtdParcela) {
		this.qtdParcela = qtdParcela;
	}

}
