package com.br.andrie.chainofresponsability;

import com.br.andrie.dominio.Item;
import com.br.andrie.dominio.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {
		calculaDesconto calculaDesconto = new calculaDesconto();
		
		Orcamento orcamento = new Orcamento(700.0);
		
		orcamento.adicionaItem(new Item("caneta", 250.0));
		orcamento.adicionaItem(new Item("lapis", 250.0));

		double desconto = calculaDesconto.calcularDesconto(orcamento);
		
		System.out.println(desconto);
	}

}
