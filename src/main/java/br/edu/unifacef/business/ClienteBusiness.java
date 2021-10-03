package br.edu.unifacef.business;

import br.edu.unifacef.dao.ClienteDAO;
import br.edu.unifacef.model.Cliente;

public class ClienteBusiness {

	private ClienteDAO clienteDAO;
	
	public ClienteBusiness(ClienteDAO dao) {
		this.clienteDAO = dao;
	}
	
	public Cliente salvarCliente(Cliente cliente) {
		if (cliente == null || cliente.getNome().isEmpty()){
			throw new RuntimeException("Nome requerido!");
		}
		
		return this.clienteDAO.salvar(cliente);
	}
}
