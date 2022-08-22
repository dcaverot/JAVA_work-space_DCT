package m71_exercici6;

import java.util.Scanner;

public class M71_Exercici6 {

	public static void main(String[] args) {
		/*
		 * Taula de multiplicar. L'usuari introduir� un n�mero (de l'1 al 10) per
		 * pantalla, i utilitzant un bucle, el programa li mostrar� la taula de
		 * multiplicar d'aquell n�mero. Exemple: 2 x 1 = 2 2 x 2 = 4 2 x 3 = 6 ... 2 x
		 * 10 = 20
		 */

		int num;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introdueix un n�mero de l'1 al 10:");
			num = sc.nextInt();
			sc.nextLine();
			if (num < 1 || num > 10) {
				System.out.println("El n�mero no pot ser m�s petit que 1 o m�s gran que 10!");
				System.out.println("");
			}
		} while (num < 0 || num > 10);

		System.out.println("La taula de multiplicar del " + num + " �s:");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + num + " = " + (i * num));
		}
	}

}
