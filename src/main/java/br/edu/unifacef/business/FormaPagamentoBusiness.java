package br.edu.unifacef.business;

import br.edu.unifacef.dao.FormaPagamentoDAO;
import br.edu.unifacef.model.FormaPagamento;

public class FormaPagamentoBusiness {

	private FormaPagamentoDAO formaPagamentoDAO;

	public FormaPagamentoBusiness(FormaPagamentoDAO dao) {
		this.formaPagamentoDAO = dao;
	}

	public FormaPagamento salvarFormaPagamento(FormaPagamento formaPagamento) {
		if (formaPagamento == null || formaPagamento.getDescricao().isEmpty()) {
			throw new RuntimeException("Descrição requerida!");
		}
		try {
			Integer.parseInt(formaPagamento.getQtdParcela().toString());
		} catch (NumberFormatException e) {
			throw new RuntimeException("Quantidade de parcelas Incorreta!");
		}
		return this.formaPagamentoDAO.salvar(formaPagamento);
	}
}
