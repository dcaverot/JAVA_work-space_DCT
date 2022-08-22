package m8_exercici61;

import java.util.ArrayList;
import java.util.Scanner;

import m8_exercici61.Cotxe;
import m8_exercici61.Escuderia;
import m8_exercici61.herencia.Mec�nic;
import m8_exercici61.herencia.Pilot;
import m8_exercici61.herencia.Treballador;

public class M8_Exercici61 {

	public static void main(String[] args) {

		boolean sortir = false;

		ArrayList<Escuderia> escuderies = new ArrayList<Escuderia>();

		Escuderia escuderia1 = new Escuderia("McLaren", 200000000, "Anglaterra");
		Escuderia escuderia2 = new Escuderia("Ferrari", 300000000, "It�lia");

		Pilot pilot1 = new Pilot("Daniel", "Cavero", 49, 10, 1.73f, 65f);
		Pilot pilot2 = new Pilot("Joan", "P�rez", 30, 2, 1.9f, 90f);
		Mec�nic mec�nic1 = new Mec�nic("Marta", "Mallada", 35, 5, true);
		Mec�nic mec�nic2 = new Mec�nic("Maria", "Font", 28, 1, true);
		Cotxe cotxe1 = new Cotxe(200, 350, "blau", 450000);
		Cotxe cotxe2 = new Cotxe(250, 300, "verd", 500000);

		escuderia1.afegirNouTreballador(pilot1);
		escuderia1.afegirNouTreballador(pilot2);
		escuderia1.afegirNouTreballador(mec�nic1);
		escuderia1.afegirNouTreballador(mec�nic2);
		escuderia1.afegirNouCotxe(cotxe1);
		escuderia1.afegirNouCotxe(cotxe2);

		Pilot pilot3 = new Pilot("Josep", "Cereza", 27, 3, 1.8f, 70f);
		Pilot pilot4 = new Pilot("Miquel", "Knopfler", 36, 8, 1.84f, 93f);
		Mec�nic mec�nic3 = new Mec�nic("Mart�", "Velasco", 50, 15, true);
		Mec�nic mec�nic4 = new Mec�nic("Johnny", "White", 42, 6, false);
		Cotxe cotxe3 = new Cotxe(300, 320, "vermell", 475000);
		Cotxe cotxe4 = new Cotxe(350, 310, "fuxia", 520000);

		escuderia2.afegirNouTreballador(pilot3);
		escuderia2.afegirNouTreballador(pilot4);
		escuderia2.afegirNouTreballador(mec�nic3);
		escuderia2.afegirNouTreballador(mec�nic4);
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
				System.out.println("\nHas sortit de l'Aplicaci�.");
				break;
			}
		} while (!sortir);

	}

	public static byte menu() {
		byte opci�;
		final byte MINIM = 0;
		final byte M�XIM = 5;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\nMEN� GENERAL, escull una opci�:\n");
			System.out.println("1. Donar d'Alta un Treballador.");
			System.out.println("2. Donar de Baixa un Treballador.");
			System.out.println("3. Veure un Treballador.");
			System.out.println("4. Veure una Escuderia (Treballadors i Cotxes).");
			System.out.println("5. Veure tota la Base de Dades");
			System.out.println("0. Sortir de l'Aplicaci�.");
			opci� = sc.nextByte();
			if (opci� < MINIM || opci� > M�XIM)
				System.out.println("L'opci� escullida no �s v�lida!");
		} while (opci� < MINIM || opci� > M�XIM);

		return opci�;
	}

	public static byte menu2() {
		byte opci�;
		final byte MINIM = 1;
		final byte M�XIM = 2;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\nEl nou treballador �s pilot o mec�nic?\n");
			System.out.println("1. Pilot.");
			System.out.println("2. Mec�nic.");
			opci� = sc.nextByte();
			if (opci� < MINIM || opci� > M�XIM)
				System.out.println("L'opci� escullida no �s v�lida!");
		} while (opci� < MINIM || opci� > M�XIM);

		return opci�;
	}

	public static int buscarEscuderia(ArrayList<Escuderia> escuderies, String nomEscuderia) {
		int posici�Escuderia = -1, last = escuderies.size() - 1;
		boolean trobat = false;
		while (posici�Escuderia < last && !trobat) {
			posici�Escuderia += 1;
			if (escuderies.get(posici�Escuderia).getNom().equalsIgnoreCase(nomEscuderia)) {
				trobat = true;
			}
		}
		if (!trobat)
			posici�Escuderia = -1;
		return posici�Escuderia;
	}

	public static int buscarTreballador(ArrayList<Treballador> treballadors, String nomTreballador,
			String cognomTreballador) {
		int posici�Treballador = -1, last = treballadors.size() - 1;
		boolean trobat = false;
		while (posici�Treballador < last && !trobat) {
			posici�Treballador += 1;
			if (treballadors.get(posici�Treballador).getNom().equalsIgnoreCase(nomTreballador)
					&& treballadors.get(posici�Treballador).getCognom().equalsIgnoreCase(cognomTreballador)) {
				trobat = true;
			}
		}
		if (!trobat)
			posici�Treballador = -1;

		return posici�Treballador;
	}

	public static void altaTreballador(ArrayList<Escuderia> escuderies) {
		String nomEscuderia, nomTreballador, cognomTreballador;
		boolean estudisSuperiorsMec�nica = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("\nAlta d'un Nou Treballador.\n");
		System.out.println("A quina escuderia vols afegir el nou treballador?");
		nomEscuderia = sc.nextLine();

		int posici�Escuderia = buscarEscuderia(escuderies, nomEscuderia);
		if (posici�Escuderia == -1) {
			System.out.println("L'escuderia " + nomEscuderia + " no existeix!\n");
		} else {
			System.out.println("Escriu el nom del nou treballador: ");
			nomTreballador = sc.nextLine();
			System.out.println("Escriu el cognom del nou treballador: ");
			cognomTreballador = sc.nextLine();
			int posici�Treballador = buscarTreballador(escuderies.get(posici�Escuderia).getTreballadors(),
					nomTreballador, cognomTreballador);
			if (posici�Treballador != -1) {
				System.out.println("El Treballador "
						+ escuderies.get(posici�Escuderia).getTreballadors().get(posici�Treballador).getNom() + " "
						+ escuderies.get(posici�Escuderia).getTreballadors().get(posici�Treballador).getCognom()
						+ " ja existeix a l'Escuderia " + escuderies.get(posici�Escuderia).getNom() + "!");
				System.out.println(escuderies.get(posici�Escuderia).getTreballadors().get(posici�Treballador));
			} else {
				System.out.println("Escriu l'edat del nou treballador (anys): ");
				int edat = sc.nextInt();
				System.out.println("Escriu l'antiguitat del nou treballador (anys): ");
				int antiguitat = sc.nextInt();

				switch (menu2()) {
				case (1):
					System.out.println("Quina �s l'al�ada del nou pilot? (m): ");
					float al�ada = sc.nextFloat();
					System.out.println("Quina �s el pes del nou pilot? (Kg): ");
					float pes = sc.nextFloat();

					Pilot pilot5 = new Pilot(nomTreballador, cognomTreballador, edat, antiguitat, al�ada, pes);
					escuderies.get(posici�Escuderia).afegirNouTreballador(pilot5);

					break;
				case (2):
					System.out.println("El nou mec�nic t� estudis Superiors de Mec�nica? (s/n)");
					sc.nextLine();
					String resposta = sc.nextLine();
					if (resposta.toLowerCase().charAt(0) == 's')
						estudisSuperiorsMec�nica = true;

					Mec�nic pilot6 = new Mec�nic(nomTreballador, cognomTreballador, edat, antiguitat,
							estudisSuperiorsMec�nica);
					escuderies.get(posici�Escuderia).afegirNouTreballador(pilot6);
					break;
				}
				System.out.println("\nS'ha afegit un nou treballador a l'Escuderia "
						+ escuderies.get(posici�Escuderia).getNom() + ":");
				int last = escuderies.get(posici�Escuderia).getTreballadors().size() - 1;
				System.out.println(escuderies.get(posici�Escuderia).getTreballadors().get(last));
			}
		}

	}

	public static void baixaTreballador(ArrayList<Escuderia> escuderies) {
		String nomEscuderia, nomTreballador, cognomTreballador;
		Scanner sc = new Scanner(System.in);

		System.out.println("\nBaixa d'un Treballador.\n");
		System.out.println("De quina escuderia vols donar de baixa un treballador?");
		nomEscuderia = sc.nextLine();

		int posici�Escuderia = buscarEscuderia(escuderies, nomEscuderia);
		if (posici�Escuderia == -1) {
			System.out.println("L'escuderia " + nomEscuderia + " no existeix!\n");
		} else {
			System.out.println("Escriu el nom del treballador que vols donar de baixa: ");
			nomTreballador = sc.nextLine();
			System.out.println("Escriu el cognom del treballador que vols donar de baixa: ");
			cognomTreballador = sc.nextLine();
			int posici�Treballador = buscarTreballador(escuderies.get(posici�Escuderia).getTreballadors(),
					nomTreballador, cognomTreballador);
			if (posici�Treballador != -1) {
				System.out.println("S'ha donat de baixa el treballador:");
				System.out.println(escuderies.get(posici�Escuderia).getTreballadors().get(posici�Treballador));
				escuderies.get(posici�Escuderia).getTreballadors().remove(posici�Treballador);
			} else {
				System.out.println("El treballador " + nomTreballador + " " + cognomTreballador + " no existeix!\n");

			}
		}
	}

	public static void veureTreballador(ArrayList<Escuderia> escuderies) {
		String nomEscuderia, nomTreballador, cognomTreballador;
		Scanner sc = new Scanner(System.in);

		System.out.println("\nVisualitzaci� d'un Treballador.\n");
		System.out.println("De quina escuderia vols veure un treballador?");
		nomEscuderia = sc.nextLine();

		int posici�Escuderia = buscarEscuderia(escuderies, nomEscuderia);
		if (posici�Escuderia == -1) {
			System.out.println("L'escuderia " + nomEscuderia + " no existeix!\n");
		} else {
			System.out.println("Escriu el nom del treballador que vols veure: ");
			nomTreballador = sc.nextLine();
			System.out.println("Escriu el cognom del treballador que vols veure: ");
			cognomTreballador = sc.nextLine();
			int posici�Treballador = buscarTreballador(escuderies.get(posici�Escuderia).getTreballadors(),
					nomTreballador, cognomTreballador);
			if (posici�Treballador != -1) {
				System.out.println("\nEscuderia " + escuderies.get(posici�Escuderia).getNom());
				System.out.println(escuderies.get(posici�Escuderia).getTreballadors().get(posici�Treballador));
				if (escuderies.get(posici�Escuderia).getTreballadors().get(posici�Treballador) instanceof Pilot) {
					int sou = ((Pilot) escuderies.get(posici�Escuderia).getTreballadors().get(posici�Treballador)).calcularSou();
					System.out.println("Sou anual: " + sou + "EUR.");
				} else {
					int sou = ((Mec�nic) escuderies.get(posici�Escuderia).getTreballadors().get(posici�Treballador)).calcularSou();
					System.out.println("Sou anual: " + sou + "EUR.");
				}
			} else {
				System.out.println("El treballador " + nomTreballador + " " + cognomTreballador +
						" no existeix a l'Escuderia " +  escuderies.get(posici�Escuderia).getNom() + "\n");

			}
		}

	}

	public static void veureEscuderia(ArrayList<Escuderia> escuderies) {
		String nomEscuderia;
		Scanner sc = new Scanner(System.in);

		System.out.println("\nVisualitzaci� d'una Escuderia.\n");
		System.out.println("Quina escuderia vols veure?");
		nomEscuderia = sc.nextLine();

		int posici�Escuderia = buscarEscuderia(escuderies, nomEscuderia);
		if (posici�Escuderia == -1) {
			System.out.println("L'escuderia " + nomEscuderia + " no existeix!\n");
		} else {
			System.out.println("\nEscuderia " + escuderies.get(posici�Escuderia).getNom()+"\n");
			int last = escuderies.get(posici�Escuderia).getTreballadors().size();
			for(int i =0; i<last; i++) {
				System.out.println(escuderies.get(posici�Escuderia).getTreballadors().get(i));
			}
			last = escuderies.get(posici�Escuderia).getCotxes().size();
			for(int i =0; i<last; i++) {
				System.out.println(escuderies.get(posici�Escuderia).getCotxes().get(i));
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

