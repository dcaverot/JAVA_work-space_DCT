package m4_exercici3_condicionals;

import java.util.Scanner;

public class M4_Exercici3_Condicionals {

	public static void main(String[] args) {
		/*
		 * Una escola d’idiomes concedeix beques a futurs estudiants si compleixen una
		 * sèrie de requisits. A l'alumne se li assigna una beca si és major d’edat i si
		 * té un títol universitari. O també se li assigna una beca si l’alumne està a
		 * l’atur. El programa demana les tres dades per pantalla i en finalitzar mostra
		 * si l’alumne té la beca o no.
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Estàs actualment a l'Atur? (si/no)");
		String atur = sc.nextLine();

		System.out.println("3. Tens un títol Universitari? (si/no)");
		String titol = sc.nextLine();
		
		System.out.println("2. Quina és la teva edat?");
		byte edat = sc.nextByte();
		
		
		System.out.println ("Atur: " + atur + "; Títol: "+ titol + "; edat: " + edat );
		
		if (atur.equals("si")||(edat>=18 && titol.equals("si"))) {
			System.out.println("SI tens Beca");
		}else {
			System.out.println("NO tens Beca");
		}	
		}
	}
