package banco;

public class Cuenta {
	public String titular;
	private int nCuenta;
	private double saldo;
	
	public int getNcuenta()
	{
		return getnCuenta();
	}
	public void setNcuenta(int nuevoNumeroCuenta)
	{
		setnCuenta(nuevoNumeroCuenta);
	}
	public int getnCuenta() {
		return nCuenta;
	}
	public void setnCuenta(int nCuenta) {
		this.nCuenta = nCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}

