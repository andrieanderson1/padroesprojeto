package com.br.andrie.strategy;

import com.br.andrie.dominio.Orcamento;
import com.br.andrie.tiposdeimposto.ICCC;

public class Teste {

	public static void main(String[] args) {
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		Orcamento orcamento = new Orcamento(4000);
		calculador.calcula(orcamento, new ICCC());

	}

}
