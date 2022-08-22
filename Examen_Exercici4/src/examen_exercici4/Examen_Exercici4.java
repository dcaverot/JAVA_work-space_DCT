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
		 * Es demana: 1- Saber quants jugadors menors de 20 anys té un equip de futbol
		 * introduït per l'usuari per teclat. 2- Mostrar les dades d'€™un jugador.
		 * L'€™usuari introduirà  el nom i el cognom i llavors han d'aparèixer les dades
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
		Jugador jugador4 = new Jugador("Odín", "Andersen", "Danesa", 18);
		Jugador jugador5 = new Jugador("Hiroshi", "Nakami", "Japonesa", 22);

		equip1.afegirNouJugador(jugador1);
		equip1.afegirNouJugador(jugador2);
		equip1.afegirNouJugador(jugador3);
		equip1.afegirNouJugador(jugador4);
		equip1.afegirNouJugador(jugador5);

		Jugador jugador6 = new Jugador("Martín", "Giménez", "Espanyola", 19);
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
				System.out.println("\nHas sortit de l'Aplicació.");
				break;
			}
		} while (!sortir);

	}

	public static byte menu() {
		byte opció;
		final byte MINIM = 0;
		final byte MÀXIM = 2;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\nMENÚ GENERAL, escull una opció:\n");
			System.out.println("1. Mostrar jugadors menors de 20 anys en un equip.");
			System.out.println("2. Veure un Jugador.");
			System.out.println("0. Sortir de l'Aplicació.");
			opció = sc.nextByte();
			if (opció < MINIM || opció > MÀXIM)
				System.out.println("L'opció escullida no és vàlida!");
		} while (opció < MINIM || opció > MÀXIM);

		return opció;
	}

	public static void jugadorsMenors20(ArrayList<Equip> equips, String nomEquip) {
		int posició = -1, recompte = 0;

		posició = buscarEquip(equips, nomEquip);

		if (posició == -1) {
			System.out.println("No s'ha trobat aquest equip!");
		} else {
			int last = equips.get(posició).getJugadors().size();
			for (int i = 0; i < last; i++) {
				if (equips.get(posició).getJugadors().get(i).getEdat() < 20)
					recompte += 1;
			}
			System.out.println("L'Equip " + equips.get(posició).getNomEquip() + " té " + recompte
					+ " jugadors menors de 20 anys.");
		}

	}

	public static void mostrarJugador(ArrayList<Equip> equips, String nomJugador, String cognom) {

		int posicióEquip = 0, posicióJugador = 0;
		boolean trobat = false;

		int lastEquips = equips.size();
		while (!trobat && posicióEquip < lastEquips) {
			int lastJugador = equips.get(posicióEquip).getJugadors().size();
			while (!trobat && posicióJugador < lastJugador) {
				if (equips.get(posicióEquip).getJugadors().get(posicióJugador).getNomJugador()
						.equalsIgnoreCase(nomJugador)
						&& equips.get(posicióEquip).getJugadors().get(posicióJugador).getCognom()
								.equalsIgnoreCase(cognom)) {
					trobat = true;
					System.out.println(equips.get(posicióEquip).getJugadors().get(posicióJugador));
					System.out.println("Equip en el que juga: " + equips.get(posicióEquip).getNomEquip() + ".");

				}
				posicióJugador += 1;
			}
			posicióJugador=0;
			posicióEquip+=1;
		}

		if (!trobat)
			System.out.println("Aquest jugador no està inscrit a la Lliga Santander!");

	}

	public static int buscarEquip(ArrayList<Equip> equips, String nomEquip) {
		int posició = -1, last = equips.size() - 1;
		boolean trobat = false;
		while (posició < last && !trobat) {
			posició += 1;
			if (equips.get(posició).getNomEquip().equalsIgnoreCase(nomEquip))
				trobat = true;
		}
		if (!trobat)
			posició = -1;

		return posició;
	}

}
