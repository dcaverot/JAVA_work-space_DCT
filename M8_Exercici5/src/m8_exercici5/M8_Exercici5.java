package m8_exercici5;

import java.util.Scanner;

public class M8_Exercici5 {

	public static void main(String[] args) {

		// Cercle cercle1 = new Cercle(new Punt (30, 40),15);
		// System.out.println(cercle1);

		Cercle cercle1, cercle2;

		System.out.println("Introducció dades del primer cercle:");
		cercle1 = introduccioDades();
		System.out.println("\nIntroducció dades del segon cercle:");
		cercle2 = introduccioDades();
		System.out.println("\nCercle 1: " + cercle1);
		System.out.println("Cercle 2: " + cercle2);

		System.out.println("\nDistància entre el centre dels dos cercles " + cercle1.distanciaCentres(cercle2));

		if (cercle1.equals(cercle2))
			System.out.println("Els dos cercles són iguals.");
		else
			System.out.println("Els dos cercles no són iguals.");

		if (cercle1.sonConcentrics(cercle2))
			System.out.println("Els dos cercles són concentrics.");
		else
			System.out.println("Els dos cercles no són concentrics.");

		if (cercle1.tenenIgualRadi(cercle2))
			System.out.println("Els dos cercles tenen el mateix radi.");
		else
			System.out.println("Els dos cercles no tenen el mateix radi.");

		if (cercle1.sonTangentsExterns(cercle2))
			System.out.println("Els dos cercles són tangents externs.");
		else
			System.out.println("Els dos cercles no són tangents externs.");

		if (cercle1.sonTangentsInterns(cercle2))
			System.out.println("Els dos cercles són tangents interns.");
		else
			System.out.println("Els dos cercles no són tangents interns.");

		if (cercle1.sonSecants(cercle2))
			System.out.println("Els dos cercles són secants.");
		else
			System.out.println("Els dos cercles no són secants.");

		if (cercle1.noEsToquen(cercle2))
			System.out.println("Els dos cercles no es toquen.");
		else
			System.out.println("Els dos cercles es toquen.");

	}

	public static Cercle introduccioDades() {
		Scanner sc = new Scanner(System.in);
		int x, y, radi;

		System.out.println("Centre del cercle, posició X:");
		x = sc.nextInt();
		System.out.println("Centre del cercle, posició Y:");
		y = sc.nextInt();
		System.out.println("Radi del cercle:");
		radi = sc.nextInt();
		Cercle cercle = new Cercle(new Punt(x, y), radi);

		return cercle;
	}

}
