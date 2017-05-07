package com.br.andrie.chainofresponsability;

import com.br.andrie.dominio.Orcamento;
import com.br.andrie.interfaces.Desconto;

public class calculaDesconto {
	
	public double calcularDesconto(Orcamento orcamento){
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();
	
		d1.setProximo(d2);
		d2.setProximo(d3);
		return d1.desconta(orcamento);
	}
	
}
