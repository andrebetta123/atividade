package br.edu.unifacef.dao;

import br.edu.unifacef.model.FormaPagamento;

public class FormaPagamentoDAO {

	public FormaPagamento salvar(final FormaPagamento formaPagamento) {
		
		formaPagamento.setId(999L);
		
		return formaPagamento;
	}
}
