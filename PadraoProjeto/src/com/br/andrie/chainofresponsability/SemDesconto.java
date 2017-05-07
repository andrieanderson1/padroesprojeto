package com.br.andrie.chainofresponsability;

import com.br.andrie.dominio.Orcamento;
import com.br.andrie.interfaces.Desconto;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {}

}
