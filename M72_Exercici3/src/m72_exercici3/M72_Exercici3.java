package m72_exercici3;

import java.util.Scanner;

public class M72_Exercici3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int lines;
		
		do {
		System.out.println("Ample màxim de l'arbre d'asterics?");
		lines = sc.nextInt();
		if (lines<0) {
			System.out.println("L'ample màxim no pot ser negatiu!");
			System.out.println();
		}
		}while(lines<0);
		
		for (int i = 1; i <= lines; i++) {
			System.out.println();
			for (int j = 1; j <= i; j++) {				
				System.out.print("*");
			}
			System.out.println();

		}
		
		for (int i = 1; i <= lines; i++) {
			System.out.println();
			for (int j =1; j <=lines-i;j++) {				
				System.out.print("*");
			}
			System.out.println();

		}	

	}

}
