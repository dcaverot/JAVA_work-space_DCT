package m5_exercici2_bucle;

import java.util.Scanner;

public class M5_Exercici2_bucle {

	public static void main(String[] args) {
		/*
		 * El programa demana dos números enters i llavors calcula la suma dels valors
		 * compresos entre els dos números, inclosos. Exemple: 4 i 10 --> resultat = 4 +
		 * 5 + 6 + 7 + 8 + 9 + 10 = 49
		 */

		int num1, num2, resultado;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introdueix si us plau el primer número:");
		num1 = sc.nextInt();
		System.out.println("Introdueix si us plau el segon número:");
		num2 = sc.nextInt();

		if (num1 < num2) {
			resultado = num1;
			for (int i = num1; i < num2; i++) {
				resultado = resultado + i + 1;
			}
		} else {
			resultado = num2;
			for (int i = num2; i < num1; i++) {
				resultado = resultado + i + 1;
			}
		}
		System.out.println("El resultat és " + resultado);
	}
}
