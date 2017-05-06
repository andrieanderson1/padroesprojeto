package com.br.andrie.tiposdeimposto;

import com.br.andrie.dominio.Orcamento;
import com.br.andrie.interfaces.Imposto;

public class ISS implements Imposto{

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
	
}
