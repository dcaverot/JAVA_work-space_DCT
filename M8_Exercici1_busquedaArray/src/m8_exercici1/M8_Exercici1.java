package m8_exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class M8_Exercici1 {

	public static void main(String[] args) {

		ArrayList<Ordinador> arrayOrdinadors = new ArrayList<Ordinador>();
		Scanner sc = new Scanner(System.in);
		String marca, model;
		boolean trobadaMarca = false;

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

		for (int i = 0; i < 5; i++) {
			System.out.println(arrayOrdinadors.get(i));
		}

		System.out.println("Introdueix Marca: ");
		marca = sc.nextLine().toLowerCase();
		System.out.println("Introdueix Model: ");
		model = sc.nextLine().toLowerCase();

		int j = 0;
		int posicio = 0;
		while (!trobadaMarca && j < size) {
			if (arrayOrdinadors.get(j).getMarca().toLowerCase().equals(marca)) {
				trobadaMarca = true;
				posicio = j;
			}
			j++;
		}

		if (trobadaMarca && arrayOrdinadors.get(posicio).getModel().toLowerCase().equals(model)) {
			System.out.println("Sí tenim Marca i Model:");
			System.out.println(arrayOrdinadors.get(posicio));
		} else if (trobadaMarca && !arrayOrdinadors.get(posicio).getModel().toLowerCase().equals(model)) {
			System.out.println("Sí tenim la Marca però de Model diferent:");
			System.out.println(arrayOrdinadors.get(posicio));
		} else {
			System.out.println("No tenim la marca que busques.");
		}
		
		// Una altre opció >>> equalsIgnoreCase(xxxx)
	}
}
