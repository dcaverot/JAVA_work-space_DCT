package m8_exercici5;

import java.util.Scanner;

public class M8_Exercici5 {

	public static void main(String[] args) {

		// Cercle cercle1 = new Cercle(new Punt (30, 40),15);
		// System.out.println(cercle1);

		Cercle cercle1, cercle2;

		System.out.println("Introducci� dades del primer cercle:");
		cercle1 = introduccioDades();
		System.out.println("\nIntroducci� dades del segon cercle:");
		cercle2 = introduccioDades();
		System.out.println("\nCercle 1: " + cercle1);
		System.out.println("Cercle 2: " + cercle2);

		System.out.println("\nDist�ncia entre el centre dels dos cercles " + cercle1.distanciaCentres(cercle2));

		if (cercle1.equals(cercle2))
			System.out.println("Els dos cercles s�n iguals.");
		else
			System.out.println("Els dos cercles no s�n iguals.");

		if (cercle1.sonConcentrics(cercle2))
			System.out.println("Els dos cercles s�n concentrics.");
		else
			System.out.println("Els dos cercles no s�n concentrics.");

		if (cercle1.tenenIgualRadi(cercle2))
			System.out.println("Els dos cercles tenen el mateix radi.");
		else
			System.out.println("Els dos cercles no tenen el mateix radi.");

		if (cercle1.sonTangentsExterns(cercle2))
			System.out.println("Els dos cercles s�n tangents externs.");
		else
			System.out.println("Els dos cercles no s�n tangents externs.");

		if (cercle1.sonTangentsInterns(cercle2))
			System.out.println("Els dos cercles s�n tangents interns.");
		else
			System.out.println("Els dos cercles no s�n tangents interns.");

		if (cercle1.sonSecants(cercle2))
			System.out.println("Els dos cercles s�n secants.");
		else
			System.out.println("Els dos cercles no s�n secants.");

		if (cercle1.noEsToquen(cercle2))
			System.out.println("Els dos cercles no es toquen.");
		else
			System.out.println("Els dos cercles es toquen.");

	}

	public static Cercle introduccioDades() {
		Scanner sc = new Scanner(System.in);
		int x, y, radi;

		System.out.println("Centre del cercle, posici� X:");
		x = sc.nextInt();
		System.out.println("Centre del cercle, posici� Y:");
		y = sc.nextInt();
		System.out.println("Radi del cercle:");
		radi = sc.nextInt();
		Cercle cercle = new Cercle(new Punt(x, y), radi);

		return cercle;
	}

}
