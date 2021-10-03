package br.edu.unifacef.business;

import br.edu.unifacef.dao.PedidoDAO;
import br.edu.unifacef.model.Pedido;

public class PedidoBusiness {

	private PedidoDAO pedidoDAO;
	
	public PedidoBusiness(PedidoDAO dao) {
		this.pedidoDAO = dao;
	}
	
	public Pedido salvarPedido(Pedido pedido) {
		if (pedido == null || pedido.getDataPedido().toString().isEmpty()){
			throw new RuntimeException("Data do pedido requerida!");
		}
		
		return this.pedidoDAO.salvar(pedido);
	}
}
