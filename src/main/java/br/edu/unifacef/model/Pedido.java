package br.edu.unifacef.model;

import java.util.Date;

public class Pedido {

	private Long id;
	private Cliente cliente;
	private FormaPagamento formaPagamento;
	private ItemPedido itemPedido;
	private Date dataPedido;
	private Double vlrTotal;
	
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", cliente=" + cliente + ", formaPagamento=" + formaPagamento + ", itemPedido="
				+ itemPedido + ", dataPedido=" + dataPedido + ", vlrTotal=" + vlrTotal + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public ItemPedido getItemPedido() {
		return itemPedido;
	}
	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Double getVlrTotal() {
		return vlrTotal;
	}
	public void setVlrTotal(Double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}
	
}
