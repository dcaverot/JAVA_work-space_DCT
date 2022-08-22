package m8_exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class M8_Exercici1 {

	public static void main(String[] args) {

		ArrayList<Ordinador> arrayOrdinadors = new ArrayList<Ordinador>();
		Scanner sc = new Scanner(System.in);
		String marca, model;
		boolean trobat = false;

		Ordinador pc1 = new Ordinador("Lenovo", "ThinkPad", "i5", 64, 500);
		Ordinador pc2 = new Ordinador("Dell", "Inspirion", "i7", 32, 1000);
		Ordinador pc3 = new Ordinador("Apple", "MacBook", "i7", 16, 750);
		Ordinador pc4 = new Ordinador("Acer", "Nitro", "i5", 32, 500);
		Ordinador pc5 = new Ordinador("Toshiba", "Satellite", "i5", 64, 1000);

		arrayOrdinadors.add(pc1);
		arrayOrdinadors.add(pc2);
		arrayOrdinadors.add(pc3);
		arrayOrdinadors.add(pc4);
		arrayOrdinadors.add(pc5);

		int size = arrayOrdinadors.size();
		
		System.out.println("Base de dades inicial:");
		for (int i = 0; i < 5; i++) {
			System.out.println(arrayOrdinadors.get(i));
		}

		System.out.println("\nIntrodueix Marca: ");
		marca = sc.nextLine().toLowerCase();
		System.out.println("Introdueix Model: ");
		model = sc.nextLine().toLowerCase();

		int j = 0;
		int posicio = 0;
		while (!trobat && j < size) {
			if (arrayOrdinadors.get(j).getMarca().equalsIgnoreCase(marca) &&
					arrayOrdinadors.get(j).getModel().equalsIgnoreCase(model)) {
				trobat = true;
				posicio = j;
			}
			j++;
		}

		if (trobat) {
			System.out.println("Sí tenim Marca i Model:");
			System.out.println(arrayOrdinadors.get(posicio)+ " >> eliminat de la base de dades!\n");
			arrayOrdinadors.remove(posicio);
		} else {
			System.out.println("No tenim la marca que busques.\n");
		}
		
		size = arrayOrdinadors.size();

		System.out.println("Nova base de dades:");
		for (int i = 0; i < size; i++) {
			System.out.println(arrayOrdinadors.get(i));
		}

		
	}
}
