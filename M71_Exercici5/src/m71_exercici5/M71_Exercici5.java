package m71_exercici5;

import java.util.Scanner;

public class M71_Exercici5 {

	public static void main(String[] args) {
		// Mostra per pantalla els nombres parells compresos entre el 100 i el 0 en
		// ordre descendent.
		

		int num1, num2, menor, major;
		Scanner sc = new Scanner(System.in);
		

		do {
			System.out.println("Introdueix el primer número:");
			num1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Introdueix el segon número:");
			num2 = sc.nextInt();
			sc.nextLine();
			if (num1 < 0 || num1 > 100 || num2 < 0 || num2 > 100) {
				System.out.println(
						"Els dos números han d'estar entre 0 i 100!. Torna a introduïr els números si us plau.");
				System.out.println("");
			}
		} while (num1 < 0 || num1 > 100 || num2 < 0 || num2 > 100);

		if (num1 <= num2) {
			menor = num1;
			major = num2;
		} else {
			menor = num2;
			major = num1;
		}
		
		if (major %2 !=0) {
			major = major-1;
		}

		for (int i = major; i >= menor; i = i - 2) {
			System.out.println(i);

		}

	}

}
