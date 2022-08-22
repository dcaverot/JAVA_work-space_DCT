package m73_exercici4;

import java.util.Scanner;

public class M73_Exercici4 {

	public static void main(String[] args) {
		/*
		 * L'usuari ha d'introduir un DNI i el programa ha de dir si la lletra és correcte o no amb el nombre de DNI.
		 * Si la lletra no és correcta, ha de dir quina lletra és la correcta.
		 * Per calcular la lletra DNI has de prendre el número de DNI a verificar i dividir-lo entre 23.
		 * La resta es reemplaça per una lletra que ja està assignada a aquest nombre mitjançant la taula adjunta:
		 * RESTO: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22.
		 * LETRA: T, R, W, A, G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E.
		 */


		String dniUsuari, numDni, lletraDni;
		char calculLletra;
		int size;
		Scanner sc = new Scanner(System.in);
			
		do {
			System.out.println("Introdueix el teu DNI amb lletra, sense espais ni guions:");
			dniUsuari = sc.nextLine();
			size=dniUsuari.length();
			if (size!=9){
				System.out.println("Falten o sobren digits!\n");
			}
		} while (size!=9);
		
		numDni = dniUsuari.substring(0,8);
		lletraDni = dniUsuari.substring(8).toUpperCase();
		
		calculLletra = retornaLletra(numDni);
		
		if (calculLletra == lletraDni.charAt(0)) {
			System.out.println("La lletra del DNI és correcte!");
		} else {
			System.out.println("La lletra introduida del DNI no és correcte!");
			System.out.println("La lletra correcta és la "+calculLletra);
		}
		
	}
	
	public static char retornaLletra(String numDni) {
		char lletra=' ';
		int dniInteger, resto;
		final String lletresDNI="TRWAGMYFPDXBNJZSQVHLCKE";
		
		dniInteger= Integer.parseInt(numDni);
		resto = dniInteger % 23;
		lletra = lletresDNI.charAt(resto);
	return lletra;	
	}

}
