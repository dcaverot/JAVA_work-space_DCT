package m8_exercici3;

import java.util.ArrayList;
import java.util.Scanner;

public class M8_Exercici3 {

	public static void main(String[] args) {
		/*
		 * Dona't el diagrama de classes de la imatge. Programa una aplicació que tingui
		 * programades totes les opcions del següent menú:
		 *
		 * 0.- Sortir de l'aplicació
		 * 1.- Crear client
		 * 2.- Eliminar client
		 * 3.- Crear compta d'un client
		 * 4.- Ingresar euros en una compta d'un client
		 * 5.- Retirar euros en una compta d'un client
		 *
		 * A tenir en compte:
		 * - El saldo inicial de totes les comptes ha de ser 0 EUR
		 * - Al crear un client, no haurà de tenir cap compte "associada"
		 * - El diagrama UML mostra les propietats i mètodes mínims que han de tenir les classes, però
		 * 	pots crear-ne més si és necessari.
		 */

		boolean salir = false;

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cliente1 = new Cliente("Daniel", "Cavero");
		Cliente cliente2 = new Cliente("Martín", "Jiménez");
		Cliente cliente3 = new Cliente("Marta", "Solano");		
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
						
		
		do {
			switch (menu()) {
			case 1:
				crearCliente(clientes);
				break;
			case 2:
				eliminarCliente(clientes);
				break;
			case 3:
				crearCuenta(clientes);
				break;
			case 4:
				ingresarEuros(clientes);
				break;
			case 5:
				retirarEuros(clientes);
				break;
			case 6:
				verCliente(clientes);
				break;
			case 7:
				verBaseDeDatos(clientes);
				break;
			case 0:
				System.out.println("Has salido de la aplicación de Cuentas y Clientes!");
				salir = true;
				break;
			}
		} while (!salir);
	}

	public static byte menu() {

		Scanner sc = new Scanner(System.in);
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 7;

		do {
			System.out.println("\nMENU PRINCIPAL: \n");
			System.out.println("1. Crear cliente.");
			System.out.println("2. Eliminar cliente.");
			System.out.println("3. Crear cuenta de cliente.");
			System.out.println("4. Ingresar Euros.");
			System.out.println("5. Retirar Euros.");
			System.out.println("6. Ver Cliente.");
			System.out.println("7. Ver base de datos completa.");
			System.out.println("0. Salir de la aplicación.\n");
			opcion = sc.nextByte();

			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escull una opció vàlida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);

		return opcion;
	}
		
	private static int buscarCliente (ArrayList<Cliente> clientes, String nombre, String apellido) {
		boolean encontrado = false;
		int last, posicionCliente = -1;
		last = clientes.size() - 1;

		while (!encontrado && posicionCliente < last) {
			posicionCliente +=1;
			if (clientes.get(posicionCliente).getNombre().equalsIgnoreCase(nombre)
				&& clientes.get(posicionCliente).getApellido().equalsIgnoreCase(apellido)){
				encontrado= true;
			}
		}
		if (!encontrado) {
			posicionCliente = -1;
		}
		return posicionCliente;
	}
	
	private static int buscarNumCuenta(ArrayList<Cuenta> cuenta, int numCuenta){
		boolean encontradaCuenta = false;
		int posicionCuenta =-1;
		int last = cuenta.size()-1;	
		while (posicionCuenta<last && !encontradaCuenta) {		
			posicionCuenta +=1;
			if (numCuenta == cuenta.get(posicionCuenta).getNumCuenta()) {
				encontradaCuenta = true;
			};
		}
		if (!encontradaCuenta) {
			posicionCuenta = -1;			
		}
		return posicionCuenta;
	}
		
	public static void crearCliente(ArrayList<Cliente> clientes) {
		String nombre, apellido;
		int posicionCliente, last;
		Scanner sc = new Scanner(System.in);

		System.out.println("Creación de un nuevo cliente.");

		System.out.println("Escribe el nombre del nuevo cliente:");
		nombre = sc.nextLine();
		System.out.println("Escribe el apellido del nuevo cliente:");
		apellido = sc.nextLine();
		posicionCliente = buscarCliente(clientes, nombre, apellido);
		if (posicionCliente >= 0) {
			System.out.println("El cliente ya existe!");
		} else {
			Cliente cliente1 = new Cliente (nombre, apellido);
			clientes.add (cliente1);
			last=clientes.size()-1;
			System.out.println("Se ha creado un nuevo cliente:\n" + clientes.get(last));
		}
	}

	public static void eliminarCliente(ArrayList<Cliente> clientes) {
		String nombre, apellido;
		int posicionCliente=-1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Eliminación de un nuevo cliente.");

		while (posicionCliente <0) {
			System.out.println("Escribe el nombre del cliente que quieres eliminar:");
			nombre = sc.nextLine();
			System.out.println("Escribe el apellido del cliente que quieres eliminar:");
			apellido = sc.nextLine();
			posicionCliente = buscarCliente(clientes, nombre, apellido);
			if (posicionCliente == -1) {
				System.out.println("El cliente que quieres eliminar no existe!");
				posicionCliente +=1;
			} else {
				System.out.println("Se ha eliminado el cliente " + clientes.get(posicionCliente).getNombre()
					+ " " +clientes.get(posicionCliente).getApellido()+ " de la base de datos.");
				clientes.remove(posicionCliente);
			}
		}
	}	
	
	public static void verCliente(ArrayList<Cliente> clientes) {
		String nombre, apellido;
		int posicionCliente, last;
		Scanner sc = new Scanner(System.in);

		System.out.println("Visualización de un cliente.\n");

		System.out.println("Escribe el nombre del cliente:");
		nombre = sc.nextLine();
		System.out.println("Escribe el apellido del cliente:");
		apellido = sc.nextLine();
		posicionCliente = buscarCliente(clientes, nombre, apellido);
		if (posicionCliente == -1) {
			System.out.println("El cliente no existe!");
		} else {
			System.out.println("\nNombre: " + clientes.get(posicionCliente).getNombre());
			System.out.println("Apellido: " + clientes.get(posicionCliente).getApellido());
			last = clientes.get(posicionCliente).getCuentas().size()-1;
			for (int i =0; i<=last; i++) {
				System.out.println("Cuenta: " + clientes.get(posicionCliente).getCuentas().get(i).getNumCuenta() + 
						", saldo: "+ clientes.get(posicionCliente).getCuentas().get(i).getSaldo() + " EUR.");
			}
		}	
	}

	public static void crearCuenta(ArrayList<Cliente> clientes) {
		String nombre, apellido;
		int posicionCliente, numCuenta=0, posicionCuenta=-1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Creación de una cuenta nueva de cliente.");

		System.out.println("Escribe el nombre del cliente al que quieres crear una nueva cuenta:");
		nombre = sc.nextLine();
		System.out.println("Escribe el apellido del cliente:");
		apellido = sc.nextLine();
		
		posicionCliente = buscarCliente(clientes, nombre, apellido);
		
		if (posicionCliente < 0) {
			System.out.println("El cliente no existe!. Crea primero el cliente.");
		} else {
			while (numCuenta<=0) {
				System.out.println("Escribe el nuevo número de cuenta:");
				numCuenta = sc.nextInt();
				if (numCuenta<=0) {
					System.out.println("El número de cuenta ha de ser mayor que cero.");
				}
			}	
		
			posicionCuenta = buscarNumCuenta(clientes.get(posicionCliente).getCuentas(), numCuenta);
			
			if (posicionCuenta==-1) {
				Cuenta cuenta1 = new Cuenta(numCuenta, 0);
				clientes.get(posicionCliente).agregarNuevaCuenta(cuenta1);
				System.out.println("Se ha creado la nueva cuenta!");
			} else {
				System.out.println("Este número de cuenta ya existe!");
			}
		}	
	}
	
	public static void ingresarEuros(ArrayList<Cliente> clientes) {
		String nombre, apellido;
		int posicionCliente, posicionCuenta, numCuenta=0, euros=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresar Euros en una cuenta de un cliente.");

		System.out.println("Escribe el nombre del cliente:");
		nombre = sc.nextLine();
		System.out.println("Escribe el apellido del cliente:");
		apellido = sc.nextLine();
		
		posicionCliente = buscarCliente(clientes, nombre, apellido);
		
		if (posicionCliente >= 0) {
			
			System.out.println("Escribe el número de la cuenta de cliente donde quieres ingresar euros:");
			numCuenta = sc.nextInt();
			
			posicionCuenta = buscarNumCuenta(clientes.get(posicionCliente).getCuentas(), numCuenta);			
			
			if (posicionCuenta==-1) {
				System.out.println("La cuenta no existe!. Crea la cuenta primero.");

			} else {
				while (euros<=0) {
					System.out.println("Cuántos Euros quieres ingresar?:");
					euros = sc.nextInt();
					if (euros<=0) {
						System.out.println("La cantidad de Euros a ingresar ha de ser mayor que cero.");
					}
				}	
				System.out.println("Saldo anterior en cuenta "
				+ clientes.get(posicionCliente).getCuentas().get(posicionCuenta).getNumCuenta() +": "
						+clientes.get(posicionCliente).getCuentas().get(posicionCuenta).getSaldo()+ " EUR.");
				
				clientes.get(posicionCliente).getCuentas().get(posicionCuenta).ingresar(euros);
			
				System.out.println("Nuevo saldo en cuenta "
						+ clientes.get(posicionCliente).getCuentas().get(posicionCuenta).getNumCuenta() +": "
								+clientes.get(posicionCliente).getCuentas().get(posicionCuenta).getSaldo()+ " EUR.");
			}
		} else {

			System.out.println("El cliente no existe!. Crea el cliente primero.");
		}
	}


	public static void retirarEuros(ArrayList<Cliente> clientes) {
		String nombre, apellido;
		int posicionCliente, posicionCuenta, numCuenta=0, euros=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Retirar Euros en una cuenta de un cliente.");

		System.out.println("Escribe el nombre del cliente:");
		nombre = sc.nextLine();
		System.out.println("Escribe el apellido del cliente:");
		apellido = sc.nextLine();
		
		posicionCliente = buscarCliente(clientes, nombre, apellido);
		
		if (posicionCliente >= 0) {
			
			System.out.println("Escribe el número de la cuenta de cliente donde quieres retirar euros:");
			numCuenta = sc.nextInt();
			
			posicionCuenta = buscarNumCuenta(clientes.get(posicionCliente).getCuentas(), numCuenta);			
			
			if (posicionCuenta==-1) {
				System.out.println("La cuenta de cliente indicada no existe!.");

			} else {
				while (euros<=0) {
					System.out.println("Cuántos Euros quieres retirar?:");
					euros = sc.nextInt();
					if (euros<=0) {
						System.out.println("La cantidad de Euros a retirar ha de ser mayor que cero.");
					}
				}	
				System.out.println("Saldo anterior en cuenta "
				+ clientes.get(posicionCliente).getCuentas().get(posicionCuenta).getNumCuenta() +": "
						+clientes.get(posicionCliente).getCuentas().get(posicionCuenta).getSaldo()+ " EUR.");
				
				clientes.get(posicionCliente).getCuentas().get(posicionCuenta).retirar(euros);
			
				System.out.println("Nuevo saldo en cuenta "
						+ clientes.get(posicionCliente).getCuentas().get(posicionCuenta).getNumCuenta() +": "
								+clientes.get(posicionCliente).getCuentas().get(posicionCuenta).getSaldo()+ " EUR.");
			}
		} else {

			System.out.println("El cliente no existe!. Crea el cliente primero.");
		}

	}

	public static void verBaseDeDatos(ArrayList<Cliente> clientes) {
		System.out.println("Visualización de la Base de Datos de Clientes completa.\n");
		for (Cliente cliente : clientes) {
			System.out.println(cliente.toString());
		}
	}
}

