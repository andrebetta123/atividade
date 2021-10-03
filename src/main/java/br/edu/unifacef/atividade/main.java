package br.edu.unifacef.atividade;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.edu.unifacef.business.Calculos;
import br.edu.unifacef.business.ClienteBusiness;
import br.edu.unifacef.business.FormaPagamentoBusiness;
import br.edu.unifacef.business.ItemPedidoBusiness;
import br.edu.unifacef.business.PedidoBusiness;
import br.edu.unifacef.business.ProdutoBusiness;
import br.edu.unifacef.dao.ClienteDAO;
import br.edu.unifacef.dao.FormaPagamentoDAO;
import br.edu.unifacef.dao.ItemPedidoDAO;
import br.edu.unifacef.dao.PedidoDAO;
import br.edu.unifacef.dao.ProdutoDAO;
import br.edu.unifacef.model.Cliente;
import br.edu.unifacef.model.FormaPagamento;
import br.edu.unifacef.model.ItemPedido;
import br.edu.unifacef.model.Pedido;
import br.edu.unifacef.model.Produto;

public class main {

	public static void main(String[] args) {
		System.out.println("hello world calculos");

		Calculos calc = new Calculos();

		Integer soma = calc.somar(3, 5);

		System.out.println("resultado = " + soma);

		System.out.println("---- Salvar cliente");

		Cliente novoCliente = new Cliente();
		novoCliente.setNome("Jose da Silva");
		novoCliente.setEstado("SP");
		novoCliente.setCidade("Franca");

		ClienteBusiness clienteBusiness = new ClienteBusiness(new ClienteDAO());

		Cliente clienteSalvo = clienteBusiness.salvarCliente(novoCliente);

		System.out.println("Cliente salvo: " + clienteSalvo);

		Produto novoProduto = new Produto();
		novoProduto.setNomeProduto("TV SAMSUNG 55 pol.");
		novoProduto.setPesoProduto(2350D);
		
		ProdutoBusiness produtoBusiness = new ProdutoBusiness(new ProdutoDAO());

		Produto produtoSalvo = produtoBusiness.salvarProduto(novoProduto);

		System.out.println("Produto salvo: " + produtoSalvo);

		FormaPagamento novaFormaPagamento = new FormaPagamento();
		novaFormaPagamento.setDescricao("A Vista");
		novaFormaPagamento.setQtdParcela(1);
		
		FormaPagamentoBusiness formaPagamentoBusiness = new FormaPagamentoBusiness(new FormaPagamentoDAO());

		FormaPagamento formaPagamentoSalvo = formaPagamentoBusiness.salvarFormaPagamento(novaFormaPagamento);

		System.out.println("Forma pagamento salva: " + formaPagamentoSalvo);		

		ItemPedido novoItemPedido = new ItemPedido();
		novoItemPedido.setProduto(novoProduto);
		novoItemPedido.setQuantidade(5D);
		novoItemPedido.setVlrUnitario(3550D);
		
		ItemPedidoBusiness itemPedidoBusiness = new ItemPedidoBusiness(new ItemPedidoDAO());

		ItemPedido itemPedidoSalvo = itemPedidoBusiness.salvarItemPedido(novoItemPedido);

		System.out.println("Item pedido salvo: " + itemPedidoSalvo);		
				
		Pedido novoPedido = new Pedido();
		novoPedido.setCliente(novoCliente);
		novoPedido.setFormaPagamento(novaFormaPagamento);
		novoPedido.setItemPedido(novoItemPedido);
		novoPedido.setDataPedido(Date.valueOf(LocalDate.now()));
		
		PedidoBusiness pedidoBusiness = new PedidoBusiness(new PedidoDAO());

		Pedido pedidoSalvo = pedidoBusiness.salvarPedido(novoPedido);

		System.out.println("Pedido salvo: " + pedidoSalvo);		
}

}
