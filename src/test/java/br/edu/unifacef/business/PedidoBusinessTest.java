package br.edu.unifacef.business;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.edu.unifacef.dao.PedidoDAO;
import br.edu.unifacef.model.Pedido;

@RunWith(MockitoJUnitRunner.class)
public class PedidoBusinessTest {

	@Mock
	private PedidoDAO pedidoDAO;
	
	@Test
	public void deveriaSalvarPedidoSucesso() {
		Pedido pedidoMock = new Pedido();
		pedidoMock.setId(111L);
		pedidoMock.setDataPedido(Date.valueOf(LocalDate.now()));
		
		Pedido novoPedido = new Pedido();
		novoPedido.setDataPedido(Date.valueOf(LocalDate.now()));
		
		Mockito.when(pedidoDAO.salvar(novoPedido)).thenReturn(pedidoMock);
		
		PedidoBusiness pedidoBusiness = new PedidoBusiness(pedidoDAO);
		
		Pedido pedidoSalvo = pedidoBusiness.salvarPedido(novoPedido);
		
		assertEquals(pedidoMock.getId(), pedidoSalvo.getId());
	}

}
