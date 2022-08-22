package m8_exercici61;

import java.util.ArrayList;
import java.util.Scanner;

import m8_exercici61.Cotxe;
import m8_exercici61.Escuderia;
import m8_exercici61.herencia.Mecànic;
import m8_exercici61.herencia.Pilot;
import m8_exercici61.herencia.Treballador;

public class M8_Exercici61 {

	public static void main(String[] args) {

		boolean sortir = false;

		ArrayList<Escuderia> escuderies = new ArrayList<Escuderia>();

		Escuderia escuderia1 = new Escuderia("McLaren", 200000000, "Anglaterra");
		Escuderia escuderia2 = new Escuderia("Ferrari", 300000000, "Itàlia");

		Pilot pilot1 = new Pilot("Daniel", "Cavero", 49, 10, 1.73f, 65f);
		Pilot pilot2 = new Pilot("Joan", "Pérez", 30, 2, 1.9f, 90f);
		Mecànic mecànic1 = new Mecànic("Marta", "Mallada", 35, 5, true);
		Mecànic mecànic2 = new Mecànic("Maria", "Font", 28, 1, true);
		Cotxe cotxe1 = new Cotxe(200, 350, "blau", 450000);
		Cotxe cotxe2 = new Cotxe(250, 300, "verd", 500000);

		escuderia1.afegirNouTreballador(pilot1);
		escuderia1.afegirNouTreballador(pilot2);
		escuderia1.afegirNouTreballador(mecànic1);
		escuderia1.afegirNouTreballador(mecànic2);
		escuderia1.afegirNouCotxe(cotxe1);
		escuderia1.afegirNouCotxe(cotxe2);

		Pilot pilot3 = new Pilot("Josep", "Cereza", 27, 3, 1.8f, 70f);
		Pilot pilot4 = new Pilot("Miquel", "Knopfler", 36, 8, 1.84f, 93f);
		Mecànic mecànic3 = new Mecànic("Martí", "Velasco", 50, 15, true);
		Mecànic mecànic4 = new Mecànic("Johnny", "White", 42, 6, false);
		Cotxe cotxe3 = new Cotxe(300, 320, "vermell", 475000);
		Cotxe cotxe4 = new Cotxe(350, 310, "fuxia", 520000);

		escuderia2.afegirNouTreballador(pilot3);
		escuderia2.afegirNouTreballador(pilot4);
		escuderia2.afegirNouTreballador(mecànic3);
		escuderia2.afegirNouTreballador(mecànic4);
		escuderia2.afegirNouCotxe(cotxe3);
		escuderia2.afegirNouCotxe(cotxe4);

		escuderies.add(escuderia1);
		escuderies.add(escuderia2);

		System.out.println(escuderies.get(0));
		System.out.println(escuderies.get(1));

		do {
			switch (menu()) {
			case (1):
				altaTreballador(escuderies);
				break;
			case (2):
				baixaTreballador(escuderies);
				break;
			case (3):
				veureTreballador(escuderies);
				break;
			case (4):
				veureEscuderia(escuderies);
				break;
			case (5):
				veureBaseDades(escuderies);
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
		final byte MÀXIM = 5;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\nMENÚ GENERAL, escull una opció:\n");
			System.out.println("1. Donar d'Alta un Treballador.");
			System.out.println("2. Donar de Baixa un Treballador.");
			System.out.println("3. Veure un Treballador.");
			System.out.println("4. Veure una Escuderia (Treballadors i Cotxes).");
			System.out.println("5. Veure tota la Base de Dades");
			System.out.println("0. Sortir de l'Aplicació.");
			opció = sc.nextByte();
			if (opció < MINIM || opció > MÀXIM)
				System.out.println("L'opció escullida no és vàlida!");
		} while (opció < MINIM || opció > MÀXIM);

		return opció;
	}

	public static byte menu2() {
		byte opció;
		final byte MINIM = 1;
		final byte MÀXIM = 2;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\nEl nou treballador és pilot o mecànic?\n");
			System.out.println("1. Pilot.");
			System.out.println("2. Mecànic.");
			opció = sc.nextByte();
			if (opció < MINIM || opció > MÀXIM)
				System.out.println("L'opció escullida no és vàlida!");
		} while (opció < MINIM || opció > MÀXIM);

		return opció;
	}

	public static int buscarEscuderia(ArrayList<Escuderia> escuderies, String nomEscuderia) {
		int posicióEscuderia = -1, last = escuderies.size() - 1;
		boolean trobat = false;
		while (posicióEscuderia < last && !trobat) {
			posicióEscuderia += 1;
			if (escuderies.get(posicióEscuderia).getNom().equalsIgnoreCase(nomEscuderia)) {
				trobat = true;
			}
		}
		if (!trobat)
			posicióEscuderia = -1;
		return posicióEscuderia;
	}

	public static int buscarTreballador(ArrayList<Treballador> treballadors, String nomTreballador,
			String cognomTreballador) {
		int posicióTreballador = -1, last = treballadors.size() - 1;
		boolean trobat = false;
		while (posicióTreballador < last && !trobat) {
			posicióTreballador += 1;
			if (treballadors.get(posicióTreballador).getNom().equalsIgnoreCase(nomTreballador)
					&& treballadors.get(posicióTreballador).getCognom().equalsIgnoreCase(cognomTreballador)) {
				trobat = true;
			}
		}
		if (!trobat)
			posicióTreballador = -1;

		return posicióTreballador;
	}

	public static void altaTreballador(ArrayList<Escuderia> escuderies) {
		String nomEscuderia, nomTreballador, cognomTreballador;
		boolean estudisSuperiorsMecànica = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("\nAlta d'un Nou Treballador.\n");
		System.out.println("A quina escuderia vols afegir el nou treballador?");
		nomEscuderia = sc.nextLine();

		int posicióEscuderia = buscarEscuderia(escuderies, nomEscuderia);
		if (posicióEscuderia == -1) {
			System.out.println("L'escuderia " + nomEscuderia + " no existeix!\n");
		} else {
			System.out.println("Escriu el nom del nou treballador: ");
			nomTreballador = sc.nextLine();
			System.out.println("Escriu el cognom del nou treballador: ");
			cognomTreballador = sc.nextLine();
			int posicióTreballador = buscarTreballador(escuderies.get(posicióEscuderia).getTreballadors(),
					nomTreballador, cognomTreballador);
			if (posicióTreballador != -1) {
				System.out.println("El Treballador "
						+ escuderies.get(posicióEscuderia).getTreballadors().get(posicióTreballador).getNom() + " "
						+ escuderies.get(posicióEscuderia).getTreballadors().get(posicióTreballador).getCognom()
						+ " ja existeix a l'Escuderia " + escuderies.get(posicióEscuderia).getNom() + "!");
				System.out.println(escuderies.get(posicióEscuderia).getTreballadors().get(posicióTreballador));
			} else {
				System.out.println("Escriu l'edat del nou treballador (anys): ");
				int edat = sc.nextInt();
				System.out.println("Escriu l'antiguitat del nou treballador (anys): ");
				int antiguitat = sc.nextInt();

				switch (menu2()) {
				case (1):
					System.out.println("Quina és l'alçada del nou pilot? (m): ");
					float alçada = sc.nextFloat();
					System.out.println("Quina és el pes del nou pilot? (Kg): ");
					float pes = sc.nextFloat();

					Pilot pilot5 = new Pilot(nomTreballador, cognomTreballador, edat, antiguitat, alçada, pes);
					escuderies.get(posicióEscuderia).afegirNouTreballador(pilot5);

					break;
				case (2):
					System.out.println("El nou mecànic té estudis Superiors de Mecànica? (s/n)");
					sc.nextLine();
					String resposta = sc.nextLine();
					if (resposta.toLowerCase().charAt(0) == 's')
						estudisSuperiorsMecànica = true;

					Mecànic pilot6 = new Mecànic(nomTreballador, cognomTreballador, edat, antiguitat,
							estudisSuperiorsMecànica);
					escuderies.get(posicióEscuderia).afegirNouTreballador(pilot6);
					break;
				}
				System.out.println("\nS'ha afegit un nou treballador a l'Escuderia "
						+ escuderies.get(posicióEscuderia).getNom() + ":");
				int last = escuderies.get(posicióEscuderia).getTreballadors().size() - 1;
				System.out.println(escuderies.get(posicióEscuderia).getTreballadors().get(last));
			}
		}

	}

	public static void baixaTreballador(ArrayList<Escuderia> escuderies) {
		String nomEscuderia, nomTreballador, cognomTreballador;
		Scanner sc = new Scanner(System.in);

		System.out.println("\nBaixa d'un Treballador.\n");
		System.out.println("De quina escuderia vols donar de baixa un treballador?");
		nomEscuderia = sc.nextLine();

		int posicióEscuderia = buscarEscuderia(escuderies, nomEscuderia);
		if (posicióEscuderia == -1) {
			System.out.println("L'escuderia " + nomEscuderia + " no existeix!\n");
		} else {
			System.out.println("Escriu el nom del treballador que vols donar de baixa: ");
			nomTreballador = sc.nextLine();
			System.out.println("Escriu el cognom del treballador que vols donar de baixa: ");
			cognomTreballador = sc.nextLine();
			int posicióTreballador = buscarTreballador(escuderies.get(posicióEscuderia).getTreballadors(),
					nomTreballador, cognomTreballador);
			if (posicióTreballador != -1) {
				System.out.println("S'ha donat de baixa el treballador:");
				System.out.println(escuderies.get(posicióEscuderia).getTreballadors().get(posicióTreballador));
				escuderies.get(posicióEscuderia).getTreballadors().remove(posicióTreballador);
			} else {
				System.out.println("El treballador " + nomTreballador + " " + cognomTreballador + " no existeix!\n");

			}
		}
	}

	public static void veureTreballador(ArrayList<Escuderia> escuderies) {
		String nomEscuderia, nomTreballador, cognomTreballador;
		Scanner sc = new Scanner(System.in);

		System.out.println("\nVisualització d'un Treballador.\n");
		System.out.println("De quina escuderia vols veure un treballador?");
		nomEscuderia = sc.nextLine();

		int posicióEscuderia = buscarEscuderia(escuderies, nomEscuderia);
		if (posicióEscuderia == -1) {
			System.out.println("L'escuderia " + nomEscuderia + " no existeix!\n");
		} else {
			System.out.println("Escriu el nom del treballador que vols veure: ");
			nomTreballador = sc.nextLine();
			System.out.println("Escriu el cognom del treballador que vols veure: ");
			cognomTreballador = sc.nextLine();
			int posicióTreballador = buscarTreballador(escuderies.get(posicióEscuderia).getTreballadors(),
					nomTreballador, cognomTreballador);
			if (posicióTreballador != -1) {
				System.out.println("\nEscuderia " + escuderies.get(posicióEscuderia).getNom());
				System.out.println(escuderies.get(posicióEscuderia).getTreballadors().get(posicióTreballador));
				if (escuderies.get(posicióEscuderia).getTreballadors().get(posicióTreballador) instanceof Pilot) {
					int sou = ((Pilot) escuderies.get(posicióEscuderia).getTreballadors().get(posicióTreballador)).calcularSou();
					System.out.println("Sou anual: " + sou + "EUR.");
				} else {
					int sou = ((Mecànic) escuderies.get(posicióEscuderia).getTreballadors().get(posicióTreballador)).calcularSou();
					System.out.println("Sou anual: " + sou + "EUR.");
				}
			} else {
				System.out.println("El treballador " + nomTreballador + " " + cognomTreballador +
						" no existeix a l'Escuderia " +  escuderies.get(posicióEscuderia).getNom() + "\n");

			}
		}

	}

	public static void veureEscuderia(ArrayList<Escuderia> escuderies) {
		String nomEscuderia;
		Scanner sc = new Scanner(System.in);

		System.out.println("\nVisualització d'una Escuderia.\n");
		System.out.println("Quina escuderia vols veure?");
		nomEscuderia = sc.nextLine();

		int posicióEscuderia = buscarEscuderia(escuderies, nomEscuderia);
		if (posicióEscuderia == -1) {
			System.out.println("L'escuderia " + nomEscuderia + " no existeix!\n");
		} else {
			System.out.println("\nEscuderia " + escuderies.get(posicióEscuderia).getNom()+"\n");
			int last = escuderies.get(posicióEscuderia).getTreballadors().size();
			for(int i =0; i<last; i++) {
				System.out.println(escuderies.get(posicióEscuderia).getTreballadors().get(i));
			}
			last = escuderies.get(posicióEscuderia).getCotxes().size();
			for(int i =0; i<last; i++) {
				System.out.println(escuderies.get(posicióEscuderia).getCotxes().get(i));
			}
		}		
	}

	public static void veureBaseDades(ArrayList<Escuderia> escuderies) {
	
		int last = escuderies.size();
		for (int i=0; i<last; i++) {
			System.out.println("\nEscuderia " + escuderies.get(i).getNom()+"\n");
			int last2 = escuderies.get(i).getTreballadors().size();
			for(int j =0; j<last2; j++) {
				System.out.println(escuderies.get(i).getTreballadors().get(j));
			}
			last2 = escuderies.get(i).getCotxes().size();
			for(int j =0; j<last2; j++) {
				System.out.println(escuderies.get(i).getCotxes().get(j));
			}	
		}
	}

}

