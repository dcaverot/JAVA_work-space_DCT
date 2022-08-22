package examen_exercici4;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen_Exercici4 {

	public static void main(String[] args) {
		/*
		 * A la lliga Santander de futbol hi ha 20 equips. Dels equips volem saber el
		 * seu nom, la ciutat a la qual pertany, el nom de l'estadi i els jugadors. Dels
		 * jugadors volem saber el seu nom i cognom, la seva nacionalitat i la seva
		 * edat.
		 * 
		 * Omple les dades pertinents com a joc de proves en el mateix codi.
		 * 
		 * Es demana: 1- Saber quants jugadors menors de 20 anys t� un equip de futbol
		 * introdu�t per l'usuari per teclat. 2- Mostrar les dades d'��un jugador.
		 * L'��usuari introduir� el nom i el cognom i llavors han d'apar�ixer les dades
		 * del jugador en pantalla.
		 */

		ArrayList<Equip> equips = new ArrayList<Equip>();
		boolean sortir = false;
		String nomJugador, cognom, nomEquip;
		Scanner sc = new Scanner(System.in);

		Equip equip1 = new Equip("Barcelona", "Barcelona", "Spotify Nou Camp");
		Equip equip2 = new Equip("Real Madrid", "Madrid", "Santiago Bernabeu");

		equips.add(equip1);
		equips.add(equip2);

		Jugador jugador1 = new Jugador("Daniel", "Cavero", "Espanyola", 25);
		Jugador jugador2 = new Jugador("Benoit", "Delacroix", "Francesa", 19);
		Jugador jugador3 = new Jugador("John", "White", "Anglesa", 27);
		Jugador jugador4 = new Jugador("Od�n", "Andersen", "Danesa", 18);
		Jugador jugador5 = new Jugador("Hiroshi", "Nakami", "Japonesa", 22);

		equip1.afegirNouJugador(jugador1);
		equip1.afegirNouJugador(jugador2);
		equip1.afegirNouJugador(jugador3);
		equip1.afegirNouJugador(jugador4);
		equip1.afegirNouJugador(jugador5);

		Jugador jugador6 = new Jugador("Mart�n", "Gim�nez", "Espanyola", 19);
		Jugador jugador7 = new Jugador("Sofiane", "Petit", "Francesa", 25);
		Jugador jugador8 = new Jugador("Harry", "Potter", "Anglesa", 28);
		Jugador jugador9 = new Jugador("Vigo", "Mortensen", "Danesa", 18);
		Jugador jugador10 = new Jugador("Haruka", "Hataki", "Japonesa", 17);

		equip2.afegirNouJugador(jugador6);
		equip2.afegirNouJugador(jugador7);
		equip2.afegirNouJugador(jugador8);
		equip2.afegirNouJugador(jugador9);
		equip2.afegirNouJugador(jugador10);

		System.out.println(equip1);
		System.out.println("\n" + equip2);

		do {
			switch (menu()) {
			case (1):
				System.out.println("Introdueix el nom de l'Equip:");
				nomEquip = sc.nextLine();
				jugadorsMenors20(equips, nomEquip);
				break;
			case (2):
				System.out.println("Introdueix el nom del Jugador que vols buscar:");
				nomJugador = sc.nextLine();
				System.out.println("Introdueix el cognom del jugador:");
				cognom = sc.nextLine();
				mostrarJugador(equips, nomJugador, cognom);
				break;
			case (0):
				sortir = true;
				System.out.println("\nHas sortit de l'Aplicaci�.");
				break;
			}
		} while (!sortir);

	}

	public static byte menu() {
		byte opci�;
		final byte MINIM = 0;
		final byte M�XIM = 2;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\nMEN� GENERAL, escull una opci�:\n");
			System.out.println("1. Mostrar jugadors menors de 20 anys en un equip.");
			System.out.println("2. Veure un Jugador.");
			System.out.println("0. Sortir de l'Aplicaci�.");
			opci� = sc.nextByte();
			if (opci� < MINIM || opci� > M�XIM)
				System.out.println("L'opci� escullida no �s v�lida!");
		} while (opci� < MINIM || opci� > M�XIM);

		return opci�;
	}

	public static void jugadorsMenors20(ArrayList<Equip> equips, String nomEquip) {
		int posici� = -1, recompte = 0;

		posici� = buscarEquip(equips, nomEquip);

		if (posici� == -1) {
			System.out.println("No s'ha trobat aquest equip!");
		} else {
			int last = equips.get(posici�).getJugadors().size();
			for (int i = 0; i < last; i++) {
				if (equips.get(posici�).getJugadors().get(i).getEdat() < 20)
					recompte += 1;
			}
			System.out.println("L'Equip " + equips.get(posici�).getNomEquip() + " t� " + recompte
					+ " jugadors menors de 20 anys.");
		}

	}

	public static void mostrarJugador(ArrayList<Equip> equips, String nomJugador, String cognom) {

		int posici�Equip = 0, posici�Jugador = 0;
		boolean trobat = false;

		int lastEquips = equips.size();
		while (!trobat && posici�Equip < lastEquips) {
			int lastJugador = equips.get(posici�Equip).getJugadors().size();
			while (!trobat && posici�Jugador < lastJugador) {
				if (equips.get(posici�Equip).getJugadors().get(posici�Jugador).getNomJugador()
						.equalsIgnoreCase(nomJugador)
						&& equips.get(posici�Equip).getJugadors().get(posici�Jugador).getCognom()
								.equalsIgnoreCase(cognom)) {
					trobat = true;
					System.out.println(equips.get(posici�Equip).getJugadors().get(posici�Jugador));
					System.out.println("Equip en el que juga: " + equips.get(posici�Equip).getNomEquip() + ".");

				}
				posici�Jugador += 1;
			}
			posici�Jugador=0;
			posici�Equip+=1;
		}

		if (!trobat)
			System.out.println("Aquest jugador no est� inscrit a la Lliga Santander!");

	}

	public static int buscarEquip(ArrayList<Equip> equips, String nomEquip) {
		int posici� = -1, last = equips.size() - 1;
		boolean trobat = false;
		while (posici� < last && !trobat) {
			posici� += 1;
			if (equips.get(posici�).getNomEquip().equalsIgnoreCase(nomEquip))
				trobat = true;
		}
		if (!trobat)
			posici� = -1;

		return posici�;
	}

}
