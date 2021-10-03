package br.edu.unifacef.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.edu.unifacef.dao.ItemPedidoDAO;
import br.edu.unifacef.model.ItemPedido;
import br.edu.unifacef.model.Produto;

@RunWith(MockitoJUnitRunner.class)
public class ItemPedidoBusinessTest {

	@Mock
	private ItemPedidoDAO itemPedidoDAO;
	
	@Test
	public void deveriaSalvarItemPedidoSucesso() {
		Produto novoProduto = new Produto();
		novoProduto.setNomeProduto("TV SAMSUNG 55 pol.");
		novoProduto.setPesoProduto(2350D);
		
		ItemPedido itemPedidoMock = new ItemPedido();
		itemPedidoMock.setId(999L);
		itemPedidoMock.setQuantidade(1D);
		itemPedidoMock.setProduto(novoProduto);
		
		ItemPedido novoItemPedido = new ItemPedido();
		novoItemPedido.setQuantidade(1D);
		novoItemPedido.setProduto(novoProduto);
		
		Mockito.when(itemPedidoDAO.salvar(novoItemPedido)).thenReturn(itemPedidoMock);
		
		ItemPedidoBusiness itemPedidoBusiness = new ItemPedidoBusiness(itemPedidoDAO);
		
		ItemPedido itemPedidoSalvo = itemPedidoBusiness.salvarItemPedido(novoItemPedido);
		
		assertEquals(itemPedidoMock.getId(), itemPedidoSalvo.getId());
	}

}
