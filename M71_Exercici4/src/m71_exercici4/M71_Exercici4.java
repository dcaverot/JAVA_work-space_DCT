package m71_exercici4;

import java.util.Scanner;

public class M71_Exercici4 {

	public static void main(String[] args) {
		// L€'usuari ha d'introduir dos números, el programa retornarà  "€œUn dels dos
		// números és negatiu"€,només si un dels dos números és negatiu.

		
		int num1, num2, num3;
		boolean sortir = false;
		Scanner sc = new Scanner(System.in);
		

		/*
		 * System.out.println("Introdueix el primer número si us plau:");
		 * num1=sc.nextInt();
		 * System.out.println("Introdueix el segon número si us plau:");
		 * num2=sc.nextInt(); if ((num1<0 && num2>0)||(num1>0 && num2<0) ) {
		 * System.out.println("Un dels dos números és negatiu.");; }
		 */

		
		System.out.println("Introdueix el primer número si us plau:");
		num1 = sc.nextInt();
		System.out.println("Introdueix el segon número si us plau:");
		num2 = sc.nextInt();
		num3 = num1 * num2;
		if (num3 < 0) {
			System.out.println("Un dels dos números és negatiu.");
			;
		}
	}
}