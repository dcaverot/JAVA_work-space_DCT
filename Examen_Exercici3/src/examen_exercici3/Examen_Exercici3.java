package examen_exercici3;

import java.util.ArrayList;

public class Examen_Exercici3 {

	public static void main(String[] args) {

		/*
		 * Ens donen dos arraylist. En un hi ha productes disponibles i en l'altre
		 * productes que volem comprar. Productes disponibles: "xampú", "sabó",
		 * "patates", "bledes", "lletuga", "llimones", "kiwis", "alvocats", "fideus",
		 * "arròs", "cafè", "xocolata".
		 * 
		 * Productes que volem comprar: "xampú", "xocolata", "alvocats", "bledes",
		 * "llimones", "llimonada"
		 * 
		 * Crea un tercer arraylist amb els productes que estan en els dos arraylist.
		 * seran els productes comprats.
		 */

		ArrayList<String> productesDisponibles = new ArrayList<String>();
		ArrayList<String> productesVolemComprar = new ArrayList<String>();

		productesDisponibles.add("xampú");
		productesDisponibles.add("sabó");
		productesDisponibles.add("patates");
		productesDisponibles.add("bledes");
		productesDisponibles.add("lletuga");
		productesDisponibles.add("llimones");
		productesDisponibles.add("kiwis");
		productesDisponibles.add("alvocats");
		productesDisponibles.add("fideus");
		productesDisponibles.add("arròs");
		productesDisponibles.add("cafè");
		productesDisponibles.add("xocolata");

		productesVolemComprar.add("xampú");
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
			int posició = -1;
			boolean trobat = false;
			while (posició < lastDisponibles && !trobat) {
				posició += 1;
				if (disponibles.get(posició).equalsIgnoreCase(comprar.get(i))) {
					trobat = true;
					productesComprats.add(comprar.get(i));
				}
			}
		}

		return productesComprats;
	}

}
