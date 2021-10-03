package br.edu.unifacef.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.edu.unifacef.dao.ProdutoDAO;
import br.edu.unifacef.model.Produto;

@RunWith(MockitoJUnitRunner.class)
public class ProdutoBusinessTest {

	@Mock
	private ProdutoDAO produtoDAO;
	
	@Test
	public void deveriaSalvarProdutoSucesso() {
		Produto produtoMock = new Produto();
		produtoMock.setId(111L);
		produtoMock.setNomeProduto("TV SAMSUNG");
		produtoMock.setPesoProduto(1500D);
		
		Produto novoProduto = new Produto();
		novoProduto.setNomeProduto("TV SAMSUNG");
		novoProduto.setPesoProduto(1500D);
		
		Mockito.when(produtoDAO.salvar(novoProduto)).thenReturn(produtoMock);
		
		ProdutoBusiness produtoBusiness = new ProdutoBusiness(produtoDAO);
		
		Produto produtoSalvo = produtoBusiness.salvarProduto(novoProduto);
		
		assertEquals(produtoMock.getId(), produtoSalvo.getId());
	}

}
