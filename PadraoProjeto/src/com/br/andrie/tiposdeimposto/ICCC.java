package com.br.andrie.tiposdeimposto;

import com.br.andrie.dominio.Orcamento;
import com.br.andrie.interfaces.Imposto;

public class ICCC implements Imposto{

	@Override
	public double calculaImposto(Orcamento orcamento) {
		if(orcamento.getValor() < 1000){
			return orcamento.getValor() * 0.05;
		}else if(orcamento.getValor() > 1000 && orcamento.getValor() < 3000){
			return orcamento.getValor() * 0.07;
		}else
			return orcamento.getValor() * 0.08 + 30;
	}

}
