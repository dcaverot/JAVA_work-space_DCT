package m71_exercici3;

import java.util.Scanner;

public class M71_Exercici3 {

	public static void main(String[] args) {
		// L�'usuari ha d'introduir un n�mero i el programa ha de mostrar per pantalla
		// si el n�mero �s parell o imparell.

		int num;
		boolean parell;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix si us plau un n�mero sencer: ");
		num = sc.nextInt();
		sc.nextLine();

		parell = esParell(num);

		if (parell) {
			System.out.println("El n�mero " + num + " �s parell.");
		} else {
			System.out.println("El n�mero " + num + " �s imparell.");
		}
	}

	public static boolean esParell(int num) {
		boolean parell = true;
		if (num % 2 != 0) {
			parell = false;
		}
		return parell;
	}

}
