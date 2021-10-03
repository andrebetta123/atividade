package br.edu.unifacef.business;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculosTest {

	private Calculos calculos;
	
	@Before
	public void init() {
		this.calculos = new Calculos();
	}
	
	@Test
	public void deveSomarNumerosPositivos() {
		Integer valor1 = 5;
		Integer valor2 = 10;
		Integer valorEsperado = 15;
		
		assertEquals(valorEsperado,calculos.somar(valor1, valor2));
		
	}

	@Test
	public void deveSomarNumerosNegativos() {
		Integer valor1 = -5;
		Integer valor2 = -10;
		Integer valorEsperado = -15;
		
		assertEquals(valorEsperado,calculos.somar(valor1, valor2));
		
	}

	@Test
	public void deveSomarNumerosNegativosPositivos() {
		Integer valor1 = -5;
		Integer valor2 = 10;
		Integer valorEsperado = 5;
		
		assertEquals(valorEsperado,calculos.somar(valor1, valor2));
		
	}
	
	@Test
	public void deveSomarNumerosPositivosNegativos() {
		Integer valor1 = 5;
		Integer valor2 = -10;
		Integer valorEsperado = -5;
		
		assertEquals(valorEsperado,calculos.somar(valor1, valor2));
		
	}

	@Test
	public void deveMultiplicarNumerosPositivos() {
		Double valor1 = 5D;
		Double valor2 = 10D;
		Double valorEsperado = 50D;
		
		assertEquals(valorEsperado,calculos.multiplicar(valor1, valor2));
		
	}

	@Test
	public void deveMultiplicarNumerosNegativos() {
		Double valor1 = -5D;
		Double valor2 = -10D;
		Double valorEsperado = 50D;
		
		assertEquals(valorEsperado,calculos.multiplicar(valor1, valor2));
		
	}

}
