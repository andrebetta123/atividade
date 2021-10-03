package br.edu.unifacef.dao;

import br.edu.unifacef.business.Calculos;
import br.edu.unifacef.model.ItemPedido;

public class ItemPedidoDAO {

	public ItemPedido salvar(final ItemPedido itemPedido) {
		
		itemPedido.setId(999L);
		Calculos calc = new Calculos();
		
		itemPedido.setVlrTotal(calc.multiplicar(itemPedido.getQuantidade(), itemPedido.getVlrUnitario()));
		
		return itemPedido;
	}
}
