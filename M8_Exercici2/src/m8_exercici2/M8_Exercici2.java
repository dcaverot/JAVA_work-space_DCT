package m8_exercici2;

import java.util.ArrayList;

import java.util.Scanner;

public class M8_Exercici2 {

	public static void main(String[] args) {

		boolean sortir = false;

		ArrayList<Hotel> arrayHotels = new ArrayList<Hotel>();
		
		Hotel hotel1 = new Hotel("Palace", 56, 5, 3400);
		Hotel hotel2 = new Hotel("Ritz", 60, 4, 4400);
		Hotel hotel3 = new Hotel("Marriot", 100, 8, 6200);
		
		arrayHotels.add(hotel1);
		arrayHotels.add(hotel2);
		arrayHotels.add(hotel3);
						
		
		do {
			switch (menu()) {
			case 1:
				crearHotel(arrayHotels);
				break;
			case 2:
				donarDeBaixaHotel(arrayHotels);
				break;
			case 3:
				veureHotel(arrayHotels);
				break;
			case 4:
				modificarHotel(arrayHotels);
				break;
			case 5:
				veureBaseDeDades(arrayHotels);
				break;
			case 0:
				System.out.println("Has sortit de l'Aplicaci� de Gesti� d'Hotels!");
				sortir = true;
				break;
			}
		} while (!sortir);
	}

	public static byte menu() {

		Scanner sc = new Scanner(System.in);
		byte opcio;
		final byte MINIMO = 0;
		final byte MAXIMO = 5;

		do {
			System.out.println("\nMENU PRINCIPAL: \n");
			System.out.println("1. Crear un nou hotel.");
			System.out.println("2. Donar de baixa un hotel.");
			System.out.println("3. Veure un hotel.");
			System.out.println("4. Modificar un hotel.");
			System.out.println("5. Veure Base de Dades.");
			System.out.println("0. Sortir de l'aplicaci�.\n");
			opcio = sc.nextByte();

			if (opcio < MINIMO || opcio > MAXIMO) {
				System.out.println("Escull una opci� v�lida");
			}
		} while (opcio < MINIMO || opcio > MAXIMO);

		return opcio;
	}

	public static byte menu2() {

		Scanner sc = new Scanner(System.in);
		byte opcio;
		final byte MINIMO = 0;
		final byte MAXIMO = 3;

		do {
			System.out.println("\nQuina dada vols modificar? \n");
			System.out.println("1. N�mero d'habitacions.");
			System.out.println("2. N�mero de plantes.");
			System.out.println("3. Superf�cie total de l'hotel.");
			System.out.println("0. No modificar res.\n");
			opcio = sc.nextByte();

			if (opcio < MINIMO || opcio > MAXIMO) {
				System.out.println("Escull una opci� v�lida");
			}
		} while (opcio < MINIMO || opcio > MAXIMO);

		return opcio;
	}
	
	public static int buscarHotel(ArrayList<Hotel> arrayHotels, String nomHotel) {
		boolean trobat = false;
		int last, posicio = -1;

		last = arrayHotels.size() - 1;

		while (!trobat && posicio < last) {
			posicio += 1;
			if (arrayHotels.get(posicio).getNomHotel().equalsIgnoreCase(nomHotel)) {
				trobat = true;
			}
		}
		if (!trobat) {
			posicio = -1;
		}
		return posicio;
	}

	public static void crearHotel(ArrayList<Hotel> arrayHotels) {
		String nomHotel;
		int numHabitacions, numPlantes, superficieHotel, posicio = -1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Creaci� d'un nou hotel.");

		do {
			System.out.println("Escriu el nom de l'hotel:");
			nomHotel = sc.nextLine();
			posicio = buscarHotel(arrayHotels, nomHotel);
			if (posicio >= 0) {
				System.out.println("L'hotel que vols crear ja existeix!");
			}
		} while (posicio != -1);

		System.out.println("Escriu el n�mero d'habitacions:");
		numHabitacions = sc.nextInt();
		System.out.println("Escriu el n�mero de plantes:");
		numPlantes = sc.nextInt();
		System.out.println("Escriu la superf�cie total de l'hotel:");
		superficieHotel = sc.nextInt();
		
		Hotel hotel1 = new Hotel(nomHotel, numHabitacions, numPlantes, superficieHotel);
		arrayHotels.add(hotel1);
		System.out.println("\nS'ha creat un nou hotel.\n" + hotel1);
		int last = arrayHotels.size()-1;
		arrayHotels.get(last).calcularManteniment();
	}

	public static void donarDeBaixaHotel(ArrayList<Hotel> arrayHotels) {
		String nomHotel;
		Scanner sc = new Scanner(System.in);
		int posicio = -1;

		System.out.println("Es donar�de baixa un hotel de la base de dades.\n");

		while (posicio < 0) {
			System.out.println("Escriu el nom de l'hotel que vols donar de baixa:");
			nomHotel = sc.nextLine();
			posicio = buscarHotel(arrayHotels, nomHotel);
			if (posicio == -1) {
				System.out.println("L'hotel que vols donar de baixa no est� a la base de dades!");
			} else {
				System.out.println("\nL'hotel " + arrayHotels.get(posicio).getNomHotel()
						+ " S'ha donat de baixa de la base de dades!");
				System.out.println(arrayHotels.get(posicio));
				arrayHotels.remove(posicio);
			}
		}
	}

	public static void veureHotel(ArrayList<Hotel> arrayHotels) {
		Scanner sc = new Scanner(System.in);
		int posicio;

		System.out.println("Visualitzaci� d'Hotels de la base de dades.\n");

		System.out.println("Quin hotel vols veure? Escriu el nom:");
		String nomHotel = sc.nextLine();
		posicio = buscarHotel(arrayHotels, nomHotel);
		if (posicio >= 0) {
			System.out.println(arrayHotels.get(posicio));
			arrayHotels.get(posicio).calcularManteniment();
		} else {
			System.out.println("Hotel " + nomHotel + " no est� a la base de dades.");
		}
	}

	public static void veureBaseDeDades(ArrayList<Hotel> arrayHotels) {
		System.out.println("Visualitzaci� de la Base de Dades d'Hotels complerta.\n");
		for (Hotel hotel : arrayHotels) {
			System.out.println(hotel.toString());
			hotel.calcularManteniment();
		}
	}

	public static void modificarHotel(ArrayList<Hotel> arrayHotels) {
		
		Scanner sc = new Scanner(System.in);
		int posicio;
		boolean sortir=false;

		System.out.println("Modificaci� de les dades d'un hotel.\n");

		System.out.println("Quin hotel vols modificar? Escriu el nom:");
		String nomHotel = sc.nextLine();
		posicio = buscarHotel(arrayHotels, nomHotel);
		if (posicio >= 0) {
			System.out.println("\nAquest �s l'hotel que vols modificar:");
			System.out.println(arrayHotels.get(posicio));
			arrayHotels.get(posicio).calcularManteniment();
			do {
				switch (menu2()) {
				case 1:
					System.out.println("Introdueix el nou n�mero d'habitacions:");
					arrayHotels.get(posicio).setNumHabitacions(sc.nextInt());
					sortir=true;
					break;
				case 2:
					System.out.println("Introdueix el nou n�mero de plantes:");
					arrayHotels.get(posicio).setNumPlantes(sc.nextInt());
					sortir=true;
					break;
				case 3:
					System.out.println("Introdueix la nova superf�cie total de l'hotel:");
					arrayHotels.get(posicio).setSuperficieHotel(sc.nextInt());
					sortir=true;
					break;
				case 0:
					System.out.println("No s'ha efectuat cap modificaci�!");
					sortir = true;
					break;
				}
			} while (!sortir);
			System.out.println("L�hotel "+ arrayHotels.get(posicio).getNomHotel()+ " s'ha modificat aix�:");
			System.out.println(arrayHotels.get(posicio));
			arrayHotels.get(posicio).calcularManteniment();
		} else {
			System.out.println("Hotel " + nomHotel + " no est� a la base de dades.");
		}
		
	}
}
