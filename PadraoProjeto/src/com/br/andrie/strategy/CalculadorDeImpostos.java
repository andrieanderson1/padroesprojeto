package com.br.andrie.strategy;

import com.br.andrie.dominio.Orcamento;
import com.br.andrie.interfaces.Imposto;

public class CalculadorDeImpostos {
	
	public void calcula(Orcamento orcamento, Imposto estrategiaDeImposto) {
        double resultado = estrategiaDeImposto.calculaImposto(orcamento);
        System.out.println(resultado);
      }
}
