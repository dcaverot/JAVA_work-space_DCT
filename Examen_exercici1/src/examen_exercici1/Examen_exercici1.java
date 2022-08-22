package examen_exercici1;

import java.util.ArrayList;

public class Examen_exercici1 {

	public static void main(String[] args) {

		ArrayList<Integer> euros = new ArrayList<Integer>();
		ArrayList<Float> dollars = new ArrayList<Float>();
		float canvi = 1.2f;

		euros.add(15);
		euros.add(16);
		euros.add(8);
		euros.add(2);
		euros.add(4);
		euros.add(6);
		euros.add(2);

		int last = euros.size();

		for (int i = 0; i < last; i++) {
			dollars.add(euros.get(i) * canvi);
		}

		System.out.println("Euros:");
		System.out.println(euros);
		System.out.println("Dollars:");
		System.out.println(dollars);
	}

}
