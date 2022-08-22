package examen_exercici2;

import java.util.ArrayList;

public class Examen_Exercici2 {

	public static void main(String[] args) {
		// Donat el següent arraylist de nombres: [15,16, 19, 66, 88, 79, 97]
		// Crea un altre arraylist amb els nombres primers que hi ha en el primer
		// arraylist.

		ArrayList<Integer> arrayNumeros = new ArrayList<Integer>();
		ArrayList<Integer> arrayNumerosPrimers = new ArrayList<Integer>();

		arrayNumeros.add(15);
		arrayNumeros.add(16);
		arrayNumeros.add(19);
		arrayNumeros.add(66);
		arrayNumeros.add(88);
		arrayNumeros.add(79);
		arrayNumeros.add(97);

		int last = arrayNumeros.size();

		for (int i = 0; i < last; i++) {
			if (primer(arrayNumeros.get(i)))
				arrayNumerosPrimers.add(arrayNumeros.get(i));
		}

		System.out.println("Array original:");
		System.out.println(arrayNumeros);
		System.out.println("Array de Números Primers:");
		System.out.println(arrayNumerosPrimers);

	}

	public static boolean primer(int num) {
		boolean esPrimer = true;
		int modul, i = 2;

		while (esPrimer && i < num) {
			modul = num % i;
			if (modul == 0) {
				esPrimer = false;
			}
			i++;
		}
		return esPrimer;
	}

}