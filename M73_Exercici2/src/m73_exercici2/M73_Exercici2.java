package m73_exercici2;

import java.util.Scanner;

public class M73_Exercici2 {

	public static void main(String[] args) {
		// En aquest programa l'usuari ha d'introduir un string i el programa ha de
		// mostrar l'€™string al revés
		// * No es pot fer servir el mètode reverse()

		String stringusuari;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introdueix un String:");
		stringusuari = sc.nextLine();
		System.out.println(stringAlreves(stringusuari));

	}

	public static String stringAlreves(String stringusuari) {
		int last = stringusuari.length() - 1;
		String result = "";

		for (int i = last; i >= 0; i--) {
			result = result + stringusuari.charAt(i);
		}
		return result;
	}

}
