package m71_exercici3;

import java.util.Scanner;

public class M71_Exercici3 {

	public static void main(String[] args) {
		// L€'usuari ha d'introduir un número i el programa ha de mostrar per pantalla
		// si el número és parell o imparell.

		// El usuario introduce números hasta que introduce uno par *****************

		int num;
		boolean parell = false;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introdueix si us plau un número sencer parell: ");
			num = sc.nextInt();
			sc.nextLine();
			parell = esParell(num);
			if (!parell) {
				System.out.println("El número " + num + " és imparell.");
			}
		} while (!parell);

		System.out.println("Molt bé, el número " + num + " és parell.");

	}

	public static boolean esParell(int num) {
		boolean parell = true;
		if (num % 2 != 0) {
			parell = false;
		}
		return parell;
	}

}
