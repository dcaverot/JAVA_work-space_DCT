package m8_exercici3;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private String apellido;
	private ArrayList<Cuenta> Cuentas;

	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.Cuentas = new ArrayList<Cuenta>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<Cuenta> getCuentas() {
		return Cuentas;
	}

	public void agregarNuevaCuenta(Cuenta cuenta){
		Cuentas.add(cuenta);
	}
	
	@Override
	public String toString() {
		return "Cliente nombre=" + nombre + ", apellido=" + apellido + ", Cuentas=" + Cuentas + ".";
	}

}
