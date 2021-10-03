package br.edu.unifacef.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.edu.unifacef.dao.FormaPagamentoDAO;
import br.edu.unifacef.model.FormaPagamento;

@RunWith(MockitoJUnitRunner.class)
public class FormaPagamentoBusinessTest {

	@Mock
	private FormaPagamentoDAO formaPagamentoDAO;
	
	@Test
	public void deveriaSalvarFormaPagamentoSucesso() {
		FormaPagamento formaPagamentoMock = new FormaPagamento();
		formaPagamentoMock.setId(999L);
		formaPagamentoMock.setDescricao("A Vista");
		formaPagamentoMock.setQtdParcela(1);
		
		FormaPagamento novoFormaPagamento = new FormaPagamento();
		novoFormaPagamento.setDescricao("A Vista");
		novoFormaPagamento.setQtdParcela(1);
		
		Mockito.when(formaPagamentoDAO.salvar(novoFormaPagamento)).thenReturn(formaPagamentoMock);
		
		FormaPagamentoBusiness formaPagamentoBusiness = new FormaPagamentoBusiness(formaPagamentoDAO);
		
		FormaPagamento formaPagamentoSalvo = formaPagamentoBusiness.salvarFormaPagamento(novoFormaPagamento);
		
		assertEquals(formaPagamentoMock.getId(), formaPagamentoSalvo.getId());
	}

}
