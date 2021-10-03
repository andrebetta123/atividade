package br.edu.unifacef.business;

import br.edu.unifacef.dao.ItemPedidoDAO;
import br.edu.unifacef.model.ItemPedido;

public class ItemPedidoBusiness {

	private ItemPedidoDAO itemPedidoDAO;
	
	public ItemPedidoBusiness(ItemPedidoDAO dao) {
		this.itemPedidoDAO = dao;
	}
	
	public ItemPedido salvarItemPedido(ItemPedido itemPedido) {
		if (itemPedido == null || itemPedido.getProduto().getNomeProduto().isEmpty()){
			throw new RuntimeException("Produto requerido!");
		}
		
		return this.itemPedidoDAO.salvar(itemPedido);
	}
}
