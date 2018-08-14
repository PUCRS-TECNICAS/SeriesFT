package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lambert {
	LinkedList<Double> terms;
	public Iterator<Double> getTermos(){
		return terms.iterator();
	}
	
	public double W0(double x) {
		double lim = 10E-6;// 0.0000006
		//throw new IllegalArgumentException();
		if(x< (1/Math.E)) {throw new IllegalArgumentException();}
		LinkedList<Double> lstResultados = new LinkedList<Double>();
		for(int n=1;n<lim;n++) {
			double fracao = Math.pow(-n,n-1);
			double divisor = Util.fatorial(n);
			double resultado = (fracao/divisor)*(Math.pow(x,n));
			lstResultados.add(resultado);
		}
		terms = lstResultados;
		return Util.somatorio(0, lstResultados.size()-1, lstResultados);
	}
}
