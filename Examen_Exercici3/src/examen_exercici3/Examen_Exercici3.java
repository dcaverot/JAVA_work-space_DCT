package examen_exercici3;

import java.util.ArrayList;

public class Examen_Exercici3 {

	public static void main(String[] args) {

		/*
		 * Ens donen dos arraylist. En un hi ha productes disponibles i en l'altre
		 * productes que volem comprar. Productes disponibles: "xamp�", "sab�",
		 * "patates", "bledes", "lletuga", "llimones", "kiwis", "alvocats", "fideus",
		 * "arr�s", "caf�", "xocolata".
		 * 
		 * Productes que volem comprar: "xamp�", "xocolata", "alvocats", "bledes",
		 * "llimones", "llimonada"
		 * 
		 * Crea un tercer arraylist amb els productes que estan en els dos arraylist.
		 * seran els productes comprats.
		 */

		ArrayList<String> productesDisponibles = new ArrayList<String>();
		ArrayList<String> productesVolemComprar = new ArrayList<String>();

		productesDisponibles.add("xamp�");
		productesDisponibles.add("sab�");
		productesDisponibles.add("patates");
		productesDisponibles.add("bledes");
		productesDisponibles.add("lletuga");
		productesDisponibles.add("llimones");
		productesDisponibles.add("kiwis");
		productesDisponibles.add("alvocats");
		productesDisponibles.add("fideus");
		productesDisponibles.add("arr�s");
		productesDisponibles.add("caf�");
		productesDisponibles.add("xocolata");

		productesVolemComprar.add("xamp�");
		productesVolemComprar.add("xocolata");
		productesVolemComprar.add("alvocats");
		productesVolemComprar.add("bledes");
		productesVolemComprar.add("llimones");
		productesVolemComprar.add("llimonada");

		System.out.println("Productes Disponibles: \n" + productesDisponibles);
		System.out.println("\nProductes que Volem Comprar: \n" + productesVolemComprar);

		System.out.println("\nProductes Comprats:");
		System.out.println(buscarProductes(productesDisponibles, productesVolemComprar));

	}

	public static ArrayList<String> buscarProductes(ArrayList<String> disponibles, ArrayList<String> comprar) {

		int lastDisponibles = disponibles.size() - 1;
		int lastComprar = comprar.size();

		ArrayList<String> productesComprats = new ArrayList<String>();

		for (int i = 0; i < lastComprar; i++) {
			int posici� = -1;
			boolean trobat = false;
			while (posici� < lastDisponibles && !trobat) {
				posici� += 1;
				if (disponibles.get(posici�).equalsIgnoreCase(comprar.get(i))) {
					trobat = true;
					productesComprats.add(comprar.get(i));
				}
			}
		}

		return productesComprats;
	}

}
