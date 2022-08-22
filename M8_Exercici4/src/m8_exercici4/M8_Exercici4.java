package m8_exercici4;

import java.util.ArrayList;
import java.util.Scanner;

import m8_exercici4.herencia.Cinema;
import m8_exercici4.herencia.Edifici;
import m8_exercici4.herencia.Hospital;
import m8_exercici4.herencia.Hotel;

public class M8_Exercici4 {

	public static void main(String[] args) {

		boolean sortir = false;
		ArrayList<Edifici> edificis = new ArrayList<Edifici>();

		Hotel hotel1 = new Hotel("Plaza", 8, 5000, 100);
		Hospital hospital1 = new Hospital("Clínic", 6, 10000, 560);
		Cinema cinema1 = new Cinema("Tívoli", 2, 3000, 400);

		edificis.add(hotel1);
		edificis.add(hospital1);
		edificis.add(cinema1);

		do {
			switch (menu()) {
			case 1:
				altaEdifici(edificis);
				break;
			case 2:
				baixaEdifici(edificis);
				break;
			case 3:
				mostrarEdifici(edificis);
				break;
			case 4:
				veureBaseDades(edificis);
				break;
			case 0:
				System.out.println("Has sortir de l'aplicació de gestió d'Edificis!");
				sortir = true;
				break;
			}
		} while (!sortir);

	}

	public static byte menu() {

		Scanner sc = new Scanner(System.in);
		byte opcio;
		final byte MINIM = 0;
		final byte MAXIM = 4;

		do {
			System.out.println("\nMENU PRINCIPAL: \n");
			System.out.println("1. Crear nou Edifici.");
			System.out.println("2. Eliminar Edifici.");
			System.out.println("3. Mostrar Edifici.");
			System.out.println("4. Veure tota la base de dades.");
			System.out.println("0. Sortir de l'aplicació.\n");
			opcio = sc.nextByte();

			if (opcio < MINIM || opcio > MAXIM) {
				System.out.println("Escull una opció vàlida");
			}
		} while (opcio < MINIM || opcio > MAXIM);

		return opcio;
	}

	public static byte menu2(String crearOeliminarOmostrar) {

		Scanner sc = new Scanner(System.in);
		byte opcio;
		final byte MINIM = 0;
		final byte MAXIM = 3;

		System.out.println("Menú de Creació/Eliminació/Visualització d'un Edifici.");

		do {
			System.out.println("\nQuin tipus d'Edifici vols " + crearOeliminarOmostrar + "?: \n");
			System.out.println("1. Hotel.");
			System.out.println("2. Hospital.");
			System.out.println("3. Cinema.");
			System.out.println("0. Sortir sense " + crearOeliminarOmostrar + " Edifici.\n");
			opcio = sc.nextByte();

			if (opcio < MINIM || opcio > MAXIM) {
				System.out.println("Escull una opció vàlida!");
			}
		} while (opcio < MINIM || opcio > MAXIM);

		return opcio;
	}

	public static int buscarEdifici(ArrayList<Edifici> edificis, String nom, String tipo) {
		int posicio = -1;
		boolean trobat = false;
		int last = edificis.size() - 1;

		while (!trobat && posicio < last) {
			posicio += 1;
			switch (tipo) {
			case "hotel":
				if (edificis.get(posicio).getNom().equalsIgnoreCase(nom) && edificis.get(posicio) instanceof Hotel)
					trobat = true;
				break;
			case "hospital":
				if (edificis.get(posicio).getNom().equalsIgnoreCase(nom) && edificis.get(posicio) instanceof Hospital)
					trobat = true;
				break;
			case "cinema":
				if (edificis.get(posicio).getNom().equalsIgnoreCase(nom) && edificis.get(posicio) instanceof Cinema)
					trobat = true;
				break;
			}
		}
		if (!trobat)
			posicio = -1;

		return posicio;
	}

	public static void altaEdifici(ArrayList<Edifici> edificis) {
		boolean sortir = false;
		String nom;
		int posicio;
		String tipo, crearOeliminarOmostrar = "crear";
		Scanner sc = new Scanner(System.in);

		do {
			switch (menu2(crearOeliminarOmostrar)) {
			case 1:
				System.out.println("Escriu el nom del nou hotel:");
				nom = sc.nextLine();
				tipo = "hotel";
				posicio = buscarEdifici(edificis, nom, tipo);
				if (posicio == -1)
					altaHotel(edificis, nom);
				else
					System.out.println("Aquest Hotel ja existeix!");
				sortir = true;
				break;
			case 2:
				System.out.println("Escriu el nom del nou hospital:");
				nom = sc.nextLine();
				tipo = "hospital";
				posicio = buscarEdifici(edificis, nom, tipo);
				if (posicio == -1)
					altaHospital(edificis, nom);
				else
					System.out.println("Aquest Hospital ja existeix!");
				sortir = true;
				break;
			case 3:
				System.out.println("Escriu el nom del nou cinema:");
				nom = sc.nextLine();
				tipo = "cinema";
				posicio = buscarEdifici(edificis, nom, tipo);
				if (posicio == -1)
					altaCinema(edificis, nom);
				else
					System.out.println("Aquest Cinema ja existeix!");
				sortir = true;
				break;
			case 0: // sortir
				System.out.println("Has sortit sense crear un nou Edifici!");
				sortir = true;
				break;
			}
		} while (!sortir);

	}

	public static void altaHotel(ArrayList<Edifici> edificis, String nom) {
		int numPlantes, superficie, numHabitacions, last;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriu el número de plantes del nou hotel " + nom + ":");
		numPlantes = sc.nextInt();
		System.out.println("Escriu la superfície (m2) del nou hotel " + nom + ":");
		superficie = sc.nextInt();
		System.out.println("Escriu el número d'habitacions del nou hotel " + nom + ":");
		numHabitacions = sc.nextInt();
		Hotel hotel1 = new Hotel(nom, numPlantes, superficie, numHabitacions);
		edificis.add(hotel1);
		last = edificis.size() - 1;
		System.out.println("S'ha afegit un nou hotel:\n" + edificis.get(last));
	}

	public static void altaHospital(ArrayList<Edifici> edificis, String nom) {
		int numPlantes, superficie, numMalalts, last;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriu el número de plantes del nou hospital " + nom + ":");
		numPlantes = sc.nextInt();
		System.out.println("Escriu la superfície (m2) del nou hospital " + nom + ":");
		superficie = sc.nextInt();
		System.out.println("Escriu el número de malalts que permetrà el nou hospital " + nom + ":");
		numMalalts = sc.nextInt();
		Hospital hospital1 = new Hospital(nom, numPlantes, superficie, numMalalts);
		edificis.add(hospital1);
		last = edificis.size() - 1;
		System.out.println("S'ha afegit un nou hospital:\n" + edificis.get(last));
	}

	public static void altaCinema(ArrayList<Edifici> edificis, String nom) {
		int numPlantes, superficie, aforament, last;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriu el número de plantes del nou cinema " + nom + ":");
		numPlantes = sc.nextInt();
		System.out.println("Escriu la superfície (m2) del nou cinema " + nom + ":");
		superficie = sc.nextInt();
		System.out.println("Escriu l'aforament del nou cinema " + nom + "( persones):");
		aforament = sc.nextInt();
		Cinema cinema1 = new Cinema(nom, numPlantes, superficie, aforament);
		edificis.add(cinema1);
		last = edificis.size() - 1;
		System.out.println("S'ha afegit un nou cinema:\n" + edificis.get(last));
	}

	public static void baixaEdifici(ArrayList<Edifici> edificis) {
		boolean sortir = false;
		String nom;
		int posicio;
		String tipo, crearOeliminarOmostrar = "eliminar";
		Scanner sc = new Scanner(System.in);

		do {
			switch (menu2(crearOeliminarOmostrar)) {
			case 1:
				System.out.println("Escriu el nom de l'hotel que vols eliminar:");
				nom = sc.nextLine();
				tipo = "hotel";
				posicio = buscarEdifici(edificis, nom, tipo);
				if (posicio == -1) {
					System.out.println("Aquest hotel no existeix, no es pot eliminar!");
				} else {
					System.out.println("L'Hotel " + edificis.get(posicio).getNom() + " s'ha eliminat.");
					edificis.remove(posicio);
				}
				sortir = true;
				break;
			case 2:
				System.out.println("Escriu el nom de l'hospital que vols eliminar:");
				nom = sc.nextLine();
				tipo = "hospital";
				posicio = buscarEdifici(edificis, nom, tipo);
				if (posicio == -1) {
					System.out.println("Aquest hospital no existeix, no es pot eliminar!");
				} else {
					System.out.println("L'Hospital " + edificis.get(posicio).getNom() + " s'ha eliminat.");
					edificis.remove(posicio);
				}
				sortir = true;
				break;
			case 3:
				System.out.println("Escriu el nom del cinema que vols eliminar:");
				nom = sc.nextLine();
				tipo = "cinema";
				posicio = buscarEdifici(edificis, nom, tipo);
				if (posicio == -1) {
					System.out.println("Aquest cinema no existeix, no es pot eliminar!");
				} else {
					System.out.println("El Cinema " + edificis.get(posicio).getNom() + " s'ha eliminat.");
					edificis.remove(posicio);
				}
				sortir = true;
				break;
			case 0:
				System.out.println("Has sortit sense eliminar un Edifici!");
				sortir = true;
				break;
			}
		} while (!sortir);

	}

	public static void mostrarEdifici(ArrayList<Edifici> edificis) {

		boolean sortir = false;
		String nom;
		int posicio;
		String tipo, crearOeliminarOmostrar = "mostrar";
		Scanner sc = new Scanner(System.in);

		do {
			switch (menu2(crearOeliminarOmostrar)) {
			case 1:
				System.out.println("Escriu el nom de l'hotel que vols mostrar:");
				nom = sc.nextLine();
				tipo = "hotel";
				posicio = buscarEdifici(edificis, nom, tipo);
				if (posicio == -1) {
					System.out.println("Aquest Hotel no existeix!");
				} else {
					System.out.println(edificis.get(posicio));
					edificis.get(posicio).calcularCostVigilancia();
					edificis.get(posicio).netejar();
					((Hotel) edificis.get(posicio)).calcularServeiHabitacions();
				}
				sortir = true;
				break;
			case 2:
				System.out.println("Escriu el nom de l'hospital que vols mostrar:");
				nom = sc.nextLine();
				tipo = "hospital";
				posicio = buscarEdifici(edificis, nom, tipo);
				if (posicio == -1) {
					System.out.println("Aquest Hospital no existeix!");
				} else {
					System.out.println(edificis.get(posicio));
					edificis.get(posicio).calcularCostVigilancia();
					edificis.get(posicio).netejar();
					((Hospital) edificis.get(posicio)).repartirDinar();
				}
				sortir = true;
				break;
			case 3:
				System.out.println("Escriu el nom del cinema que vols mostrar:");
				nom = sc.nextLine();
				tipo = "cinema";
				posicio = buscarEdifici(edificis, nom, tipo);
				if (posicio == -1) {
					System.out.println("Aquest Cinema no existeix!");
				} else {
					System.out.println(edificis.get(posicio));
					edificis.get(posicio).calcularCostVigilancia();
					edificis.get(posicio).netejar();
					System.out.println("\nProjectarem una Sessió.");
					System.out.println("Quants Assistents hi haurà?");
					int numAssistents = sc.nextInt();
					System.out.println("Quin serà el preu de l'entrada?");
					float preuEntrada = sc.nextFloat();
					((Cinema) edificis.get(posicio)).projectarSessio(numAssistents, preuEntrada);
				}
				sortir = true;
				break;
			case 0:
				System.out.println("Has sortit sense mostrar un Edifici!");
				sortir = true;
				break;

			}
		} while (!sortir);
	}

	public static void veureBaseDades(ArrayList<Edifici> edificis) {
		int last = edificis.size() - 1;

		for (int i = 0; i <= last; i++) {

			System.out.println(edificis.get(i));
			edificis.get(i).calcularCostVigilancia();
			edificis.get(i).netejar();

			if (edificis.get(i) instanceof Hotel) {
				((Hotel) edificis.get(i)).calcularServeiHabitacions();
				System.out.println("");

			} else if (edificis.get(i) instanceof Hospital) {
				((Hospital) edificis.get(i)).repartirDinar();
				System.out.println("");

			} else {
				System.out.println("");
			}

		}
	}

}
