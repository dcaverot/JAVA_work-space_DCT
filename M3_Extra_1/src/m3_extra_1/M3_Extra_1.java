package m3_extra_1;

import java.util.Scanner;

public class M3_Extra_1 {

	public static void main(String[] args) {
		// Escriu un programa Java que llegeix un nombre enter per teclat i obté i
		// mostra per pantalla el doble i el triple d'aquest número.

		int numero;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escriu un número sencer:");
		numero = sc.nextInt();
		

		System.out.println("El doble de " + numero + " és: " + numero*2);
		System.out.println("El triple de " + numero + " és: " + numero*3);
		
	}

}
	