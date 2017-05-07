package com.br.andrie.interfaces;

import com.br.andrie.dominio.Orcamento;

public interface Desconto {
	double desconta(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
