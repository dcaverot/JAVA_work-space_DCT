package m72_exercici2;

import java.util.Scanner;

public class M71_Exercici2 {

	public static void main(String[] args) {
		/*
		Fes un programa que mostri el segÃ¼ent per pantalla:

		****

		***

		**

		*
	
		El nombre de línies formades per "*"€ vindrà  donat per un número que l'€™usuari introduirà  per consola.
		Condició: En tot el codi del programa només hi pot haver un *
		També, a poder ser, no utilitzis cap mètode com repeat() o substring() de la classe String
		*/

		
		Scanner sc = new Scanner(System.in);
		int lines;
		
		do {
		System.out.println("Quantes línies vols?");
		lines = sc.nextInt();
		if (lines<0) {
			System.out.println("El número de línies no pot ser negatiu!");
			System.out.println();
		}
		}while(lines<0);
		
		for (int i = 1; i <= lines; i++) {
			System.out.println();
			for (int j =0; j <=lines-i;j++) {				
				System.out.print("*");
			}
			System.out.println();

		}	
		
	}

}
