package br.edu.unifacef.dao;

import br.edu.unifacef.model.Pedido;

public class PedidoDAO {

	public Pedido salvar(final Pedido pedido) {
		
		pedido.setId(999L);
		
		return pedido;
	}
}
