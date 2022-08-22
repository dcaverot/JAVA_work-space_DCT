package m5_exercici1_bucle_array;

import java.util.ArrayList;
import java.util.Scanner;

public class M5_Exercici1_bucle_array {

	public static void main(String[] args) {
		/*
		 * El programa demana quantes paraules vol introduir l'usuari. Aquest,
		 * introdueix el número i llavors apareix el següent missatge:
		 * "Introdueix la paraula". Aquest missatge es mostra tantes vegades com número
		 * de paraules ha dit l'usuari que volia introduir. Les paraules es guarden en
		 * un arrayList i un cop han sigut totes introduïdes, es mostren per pantalla.
		 */

		int número_paraules;
		//String paraula;
		ArrayList<String> array_paraules = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Quántes paraules vols introduïr?");
		número_paraules = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= número_paraules; i++) {

			System.out.println("Introdueix la paraula:");
			//paraula = sc.nextLine();
			//array_paraules.add(paraula);
			array_paraules.add(sc.nextLine());
		}
		
		System.out.println(array_paraules);
	}
}
