package m72_exercici4;

import java.util.Scanner;

public class M72_Exercici4 {

	public static void main(String[] args) {
		/*
		 * Realitzar un programa on l'usuari introdueix un número i el programa crida a
		 * un mètode que retorna el factorial del número introduit. El factorial d'un
		 * nombre n (enter, no negatiu) és el producte de tots els nombres enters
		 * positius inferiors o iguals a n.
		 */

		int num, resultado;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introdueix un número sencer positiu, si us plau:");
			;
			num = sc.nextInt();
			
			if (num < 0) {
				System.out.println("El número ha de ser positiu!");
			}
		} while (num < 0);
		
		if (num==0 || num==1) {
			resultado =1;
		} else {
			resultado = factorial(num);
		}
			System.out.println("El factorial de " + num + " és: " + resultado);
	}

	public static int factorial(int num) {
		int result = num;
		for (int i = 1; i < num; i++) {
			result = result * (num - i);
		}
		return result;
	}

}
