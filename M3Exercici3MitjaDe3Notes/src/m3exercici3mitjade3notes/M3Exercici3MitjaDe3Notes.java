package m3exercici3mitjade3notes;

import java.util.Scanner;

public class M3Exercici3MitjaDe3Notes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriu la primera nota:");
		int note1 = sc.nextInt();

		System.out.println("Escriu la segona nota:");
		int note2 = sc.nextInt();

		System.out.println("Escriu la tercera nota:");
		int note3 = sc.nextInt();

		System.out.println("La nota Mitja es: " + ((float) note1 + note2 + note3) / 3);
	}

}
