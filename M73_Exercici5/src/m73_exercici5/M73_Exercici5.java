package m73_exercici5;

import java.util.Scanner;

public class M73_Exercici5 {

	public static void main(String[] args) {
		//Comprovar si una frase introdu�da per l'��usuari est� formada nom�s per min�scules,
		//nom�s per maj�scules o per min�scules i maj�scules
		
		String frase, fraseMin, fraseMay;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdueix una frase, si us plau:");
		frase = sc.nextLine();
		fraseMin = frase.toLowerCase();
		fraseMay = frase.toUpperCase();
		
		if (frase.equals(fraseMin)) {
			System.out.println("La frase est� formada nom�s per min�scules.");
		} else if (frase.equals(fraseMay)){
			System.out.println("La frase est� formada nom�s per MAJ�SCULES.");
		} else {
			System.out.println("La frase est� formada per min�scules i MAJ�SCULES.");
		}	

	}

}
