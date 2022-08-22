package m72_exercici7;

import java.util.Scanner;

public class M72_Exercici7 {

	public static void main(String[] args) {
		// L'usuari introdueix un any a per teclat
		// i el programa crida a un mètode que indiqui l'any és de traspàs o no.

		int any;
		boolean esdetraspas;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introdueix un any:");
		any = sc.nextInt();

		esdetraspas = bisiesto(any);

		if (esdetraspas) {
			System.out.println("L'any " + any + " és de Traspàs.");
		} else {
			System.out.println("L'any " + any + " no és de Traspàs.");
		}
	}

	public static boolean bisiesto(int any) {
		boolean esdetraspas = false;

		if (any % 400 == 0) {
			esdetraspas = true;
		} else if (any % 4 == 0 && any % 100 != 0) {
				esdetraspas = true;
			}
		return esdetraspas;
	}
}
