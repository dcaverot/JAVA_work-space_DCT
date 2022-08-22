package m73_exercici3;

import java.util.Scanner;

public class M73_Exercici3 {

	public static void main(String[] args) {
		// L'usuari ha d'€™introduir una frase i el programa ha de dir si la frase és un
		// palíndrom

		String stringusuari, stringusuarisenseespais, stringalreves;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introdueix un String:");
		stringusuari = sc.nextLine();

		stringusuarisenseespais = treureEspais(stringusuari);
		stringalreves = stringAlreves(stringusuarisenseespais);

		if (stringusuarisenseespais.equals(stringalreves)) {
			System.out.println("És un palíndrom!");
		} else {
			System.out.println("No és un palíndrom!");

		}
	}

	public static String treureEspais(String stringusuari) {
		String stringusuarisenseespais = "";
		char caracter;
		int last = stringusuari.length() - 1;

		for (int i = last; i >= 0; i--) {
			caracter = stringusuari.charAt(i);
			if (caracter != ' ') {
				stringusuarisenseespais = stringusuarisenseespais + caracter;
			}
		}
		return stringusuarisenseespais;
	}

	public static String stringAlreves(String stringusuarisenseespais) {
		int last = stringusuarisenseespais.length() - 1;
		String result = "";

		for (int i = last; i >= 0; i--) {
			result = result + stringusuarisenseespais.charAt(i);
		}
		return result;
	}

}
