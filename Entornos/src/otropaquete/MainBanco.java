package otropaquete;

import banco.*;

/**
 * 
 * @author 1ºDAM
 *
 */

public class MainBanco {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta1 = new Cuenta();
		CuentaCorriente cuenta2 = new CuentaCorriente();
		CuentaAhorro cuenta3 = new CuentaAhorro();

		cuenta1.setnCuenta(2335);
		cuenta1.titular = "Angelito";
		cuenta1.setSaldo(1000);

		cuenta2.setnCuenta(2334);
		cuenta2.titular = "Io";
		cuenta2.setSaldo(8000);
		mostrarSaldoTotal(cuenta1.getSaldo(), cuenta2.getSaldo());

		Cuenta cuentas[] = new Cuenta[5];
		cuentas[0] = cuenta1;
		cuentas[1] = cuenta2;
		cuentas[2] = cuenta3;

		for (int i = 0; i < cuentas.length; i++) {
			Cuenta cuenta4 = cuentas[i];
			System.out.print(cuenta4.getSaldo());
		}
	}

	public static String mostrarSaldoTotal(double saldo1, double saldo2) {
		return String.valueOf(saldo1 + saldo2);
	}

}
