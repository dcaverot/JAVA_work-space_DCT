package m3_extra_1;

import java.util.Scanner;

public class M3_Extra_1 {

	public static void main(String[] args) {
		// Escriu un programa Java que llegeix un nombre enter per teclat i obt� i
		// mostra per pantalla el doble i el triple d'aquest n�mero.

		int numero;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriu un n�mero sencer:");
		numero = sc.nextInt();
		

		System.out.println("El doble de " + numero + " �s: " + numero*2);
		System.out.println("El triple de " + numero + " �s: " + numero*3);
		
	}

}
	