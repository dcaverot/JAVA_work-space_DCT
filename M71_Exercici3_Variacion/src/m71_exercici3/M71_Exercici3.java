package m71_exercici3;

import java.util.Scanner;

public class M71_Exercici3 {

	public static void main(String[] args) {
		// L�'usuari ha d'introduir un n�mero i el programa ha de mostrar per pantalla
		// si el n�mero �s parell o imparell.

		// El usuario introduce n�meros hasta que introduce uno par *****************

		int num;
		boolean parell = false;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introdueix si us plau un n�mero sencer parell: ");
			num = sc.nextInt();
			sc.nextLine();
			parell = esParell(num);
			if (!parell) {
				System.out.println("El n�mero " + num + " �s imparell.");
			}
		} while (!parell);

		System.out.println("Molt b�, el n�mero " + num + " �s parell.");

	}

	public static boolean esParell(int num) {
		boolean parell = true;
		if (num % 2 != 0) {
			parell = false;
		}
		return parell;
	}

}
