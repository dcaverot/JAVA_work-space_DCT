package primerDiaPideNombreApellidoEdad;

import java.util.Scanner;

public class PrimerDiaPideNombreApellidoEdad {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Escriu el teu Nom:");
		String  nombre = sc.nextLine();
		
		System.out.println ("Escriu el teu Cognom:");
		String apellido = sc.nextLine();
		
		System.out.println ("Escriu la teva Edad:");
		int edad = sc.nextInt();
		
		if (edad>=18) {
			System.out.println ("Et dius " + nombre + " " + apellido + ", ets MAJOR d’edat");
		}
		else {
			System.out.println ("Et dius " + nombre + " " + apellido + ", ets MENOR d’edat" );
		}
	}

}
