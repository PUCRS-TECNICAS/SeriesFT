package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Trig {
	private double t;
	
	private List<Double> termos = new LinkedList<Double>();
	
	public Iterator<Double> getTermos(){
		// TODO:
		//throw new UnsupportedOperationException();
		return termos.iterator();
	}

	public double cos(double x) { 
		// TODO:
		//throw new UnsupportedOperationException();
		termos.clear();
		int n=0;		
		while(t>Math.pow(10, -6)) {
			t=0;
			t=((Math.pow(-1,n)/(Util.fatorial(2*n)))*Math.pow(x, 2*n));
			termos.add(t);
			n++;
		}
		return Util.somatorio(0,termos.size(),termos);
	}

	public double sin(double x) {
		// TODO:
		//throw new UnsupportedOperationException();
		termos.clear();
		int n=0;
		while(t>Math.pow(10,-6)) {
			t=0;
			t=((Math.pow(-1, n)/Util.fatorial(2*n+1))*Math.pow(x, 2*n+1));
			termos.add(t);
			n++;
		}
		return Util.somatorio(0, termos.size(), termos);
	}

}
