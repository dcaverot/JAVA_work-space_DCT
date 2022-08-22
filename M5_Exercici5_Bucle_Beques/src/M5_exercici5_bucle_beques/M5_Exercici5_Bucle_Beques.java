package M5_exercici5_bucle_beques;

import java.util.ArrayList;
import java.util.Scanner;

public class M5_Exercici5_Bucle_Beques {

	public static void main(String[] args) {
		/*
		 * Has de modificar el programa de les beques (M4 Exercici 3) Ara el programa ha
		 * de poder donar 5 beques. El programa anirà  demanant les dades dels alumnes
		 * fins que es donin aquestes 5 beques. Un cop el programa hagi assignat les 5
		 * beques s'ha de mostrar per pantalla els noms dels 5 alumnes que tenen beca.
		 */

		String resposta, nombre;
		char atur, titol;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array_persones_amb_beca = new ArrayList<String>();
		final byte max_beques = 5;
		byte num_beques = 0;

		while (num_beques < max_beques) {

			System.out.println("Escriu el teu Nom i els teus Cognoms: ");
			nombre = sc.nextLine();

			System.out.println("1. Estàs actualment a l'Atur? (si/no)");
			resposta = sc.nextLine();
			resposta = resposta.toLowerCase();
			atur = resposta.charAt(0);

			System.out.println("3. Tens un títol Universitari? (si/no)");
			resposta = sc.nextLine();
			resposta = resposta.toLowerCase();
			titol = resposta.charAt(0);

			System.out.println("2. Quina és la teva edat?");
			byte edat = sc.nextByte();
			sc.nextLine();

			System.out.println("Atur: " + atur + "; Títol: " + titol + "; edat: " + edat);

			if (atur == 's' || (edat >= 18 && titol == 's')) {
				System.out.println("SÍ tens Beca");
				System.out.println("");
				num_beques += 1;
				array_persones_amb_beca.add(nombre);
			} else {
				System.out.println("NO tens Beca");
				System.out.println("");
			}

		}
		
		System.out.println("Les persones que han obtingut beca són:");

		for (int i = 0; i < max_beques; i++) {
			System.out.println("  " + (i + 1) + ". " + array_persones_amb_beca.get(i));
		}
	}
}
