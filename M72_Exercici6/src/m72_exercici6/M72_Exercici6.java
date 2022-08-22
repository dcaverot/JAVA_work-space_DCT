package m72_exercici6;

import java.util.Scanner;

public class M72_Exercici6 {

	public static void main(String[] args) {
		/*
		 * L'€™usuari ha d'introduir números fins que introdueixi un nombre primer. En
		 * el moment que l'usuari introdueixi un nombre primer, el programa ha de treure
		 * per pantalla el següent missatge: Exacte, el número "x"€ és primer! Nota:
		 * Utilitzar el mètode creat a l'exercici: (M7.2.) Exercici 5
		 */

		int num;
		Scanner sc = new Scanner(System.in);
		boolean esPrimer=false;
		
		
		do {
			System.out.println("Introdueix un número:");
			num=sc.nextInt();
			if (num<=1) {
				System.out.println("Ha de se més gran que 1!");
			} else {
				esPrimer = primer(num);
			}	
		}while (!esPrimer);
		
		System.out.println("Exacte, el número " + num + " és primer!");
	}

	public static boolean primer(int num) {
		boolean esPrimer = true;
		int modulo, i = 2;

		while (esPrimer && i < num) {
			modulo = num % i;
			if (modulo == 0) {
				esPrimer = false;
			}
			i++;
		}
		return esPrimer;
	}
}
