package br.edu.unifacef.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.edu.unifacef.dao.ClienteDAO;
import br.edu.unifacef.model.Cliente;

@RunWith(MockitoJUnitRunner.class)
public class ClienteBusinessTest {

	@Mock
	private ClienteDAO clienteDAO;
	
	@Test
	public void deveriaSalvarClienteSucesso() {
		Cliente clienteMock = new Cliente();
		clienteMock.setId(111L);
		clienteMock.setNome("Maria da Silva");
		clienteMock.setCidade("Monte santo");
		clienteMock.setEstado("MG");
		
		Cliente novoCliente = new Cliente();
		novoCliente.setNome("Jose da Silva");
		novoCliente.setEstado("SP");
		novoCliente.setCidade("Franca");
		
		Mockito.when(clienteDAO.salvar(novoCliente)).thenReturn(clienteMock);
		
		ClienteBusiness clienteBusiness = new ClienteBusiness(clienteDAO);
		
		Cliente clienteSalvo = clienteBusiness.salvarCliente(novoCliente);
		
		assertEquals(clienteMock.getId(), clienteSalvo.getId());
	}

}
