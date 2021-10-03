package br.edu.unifacef.business;

import br.edu.unifacef.dao.ProdutoDAO;
import br.edu.unifacef.model.Produto;

public class ProdutoBusiness {

	private ProdutoDAO produtoDAO;
	
	public ProdutoBusiness(ProdutoDAO dao) {
		this.produtoDAO = dao;
	}
	
	public Produto salvarProduto(Produto produto) {
		if (produto == null || produto.getNomeProduto().isEmpty()){
			throw new RuntimeException("Nome do produto requerido!");
		}
		
		return this.produtoDAO.salvar(produto);
	}
}
