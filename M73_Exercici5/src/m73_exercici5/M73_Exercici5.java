package m73_exercici5;

import java.util.Scanner;

public class M73_Exercici5 {

	public static void main(String[] args) {
		//Comprovar si una frase introduïda per l'€™usuari està formada només per miníscules,
		//només per majúscules o per miníscules i majúscules
		
		String frase, fraseMin, fraseMay;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix una frase, si us plau:");
		frase = sc.nextLine();
		fraseMin = frase.toLowerCase();
		fraseMay = frase.toUpperCase();
		
		if (frase.equals(fraseMin)) {
			System.out.println("La frase està formada només per minúscules.");
		} else if (frase.equals(fraseMay)){
			System.out.println("La frase està formada només per MAJÚSCULES.");
		} else {
			System.out.println("La frase està formada per minúscules i MAJÚSCULES.");
		}	

	}

}
