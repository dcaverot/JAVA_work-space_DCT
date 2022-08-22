package m8_exercici3;

public class Cuenta {

	private int numCuenta;
	private int saldo;

	public Cuenta(int numCuenta, int saldo) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public int ingresar(int cantidad) {
		saldo = saldo + cantidad;
		return saldo;
	}

	public int retirar(int cantidad) {
		saldo = saldo - cantidad;
		if (saldo < 0) {
			System.out.println("No tens saldo suficient per a retirar " + cantidad + " EUR.");
			saldo = saldo + cantidad;
		}
		return saldo;
	}

	@Override
	public String toString() {
		return "Cuenta numCuenta=" + numCuenta + ", saldo=" + saldo + " EUR";
	}

}
