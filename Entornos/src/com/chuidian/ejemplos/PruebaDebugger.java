package com.chuidian.ejemplos;

public class PruebaDebugger {

	public static void main(String[] args) {

			ClaseParaDepurar clase = new ClaseParaDepurar();

			double valor = clase.echaCuentas();
			valor = clase.echaCuentas();
			valor = clase.echaCuentas();

			System.out.println("Sale "+valor);

	}

}

