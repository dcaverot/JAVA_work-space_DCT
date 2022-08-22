package m71_exercici7;

import java.util.Scanner;

public class M71_Exercici7 {

	public static void main(String[] args) {
		//Fer un programa on l'usuari introdueix per pantalla un caràcter i un número.
		//El programa imprimeix per pantalla un quadrat amb la mida i el caràcter introduïts per l'€™usuari.
		 
		int num;
		String lectura;
		char caracter;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Si us plau, introdueix un número:");
		num = sc.nextInt();
		sc.nextLine();
		System.out.println("Si us plau, introdueix un caràcter:");
		lectura = sc.nextLine();
		caracter = lectura.charAt(0);
		
		for (int i=1; i<=num; i++) {
			System.out.println();
			for(int j=1; j<=num; j++) {
				System.out.print(caracter);				
			}
		}
	}
}
