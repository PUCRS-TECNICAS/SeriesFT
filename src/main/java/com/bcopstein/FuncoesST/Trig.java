package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Trig {
	private double cosX;
	private double sinX;
	
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
		while(cosX>Math.pow(10, -6)) {
			double cosX=0;
			cosX=((Math.pow(-1,n)/(Util.fatorial(2*n)))*Math.pow(x, 2*n));
			termos.add(cosX);
			n++;
		}
		return Util.somatorio(0,termos.size(),termos);
	}

	public double sin(double x) {
		// TODO:
		//throw new UnsupportedOperationException();
		return sinX;
	}

}
