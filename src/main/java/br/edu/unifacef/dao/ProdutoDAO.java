package br.edu.unifacef.dao;

import br.edu.unifacef.model.Produto;

public class ProdutoDAO {

	public Produto salvar(final Produto produto) {
		
		produto.setId(999L);
		
		return produto;
	}
}
