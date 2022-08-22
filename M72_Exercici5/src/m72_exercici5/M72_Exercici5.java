package m72_exercici5;

import java.util.Scanner;

public class M72_Exercici5 {

	public static void main(String[] args) {
		// L'usuari introdueix un nombre per teclat i el programa crida a un mètode que indiqui
		// si el número és primer o no.

		int num;
		boolean esPrimer = false;
		Scanner sc = new Scanner(System.in);
		

		do {
			System.out.println("introdueix un número més gran que 1, si us plau:");
			num=sc.nextInt();
			if (num<1) {
				System.out.println("El número ha de ser més gran que 1.");
			}
		} while (num<1);
		
		esPrimer = primer(num);
		
		if (esPrimer) {
			System.out.println("El número " + num + " és primer.");
		} else {
			System.out.println("El número " + num + " no és primer.");
		}		
	}

	public static boolean primer (int num) {
		boolean esPrimer=true;
		int modulo, i=2;
		
		while (esPrimer && i<num){
			modulo = num % i;
			if (modulo==0) {
				esPrimer = false;
			}
		i++;
		}
	return esPrimer;
	}
}
