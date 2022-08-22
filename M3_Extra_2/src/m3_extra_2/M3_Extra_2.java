package m3_extra_2;

import java.util.Scanner;

public class M3_Extra_2 {

	public static void main(String[] args) {
		/* Escriu un programa Java que sol·liciti per pantalla un nombre enter, i si és menor que 10,
		* ho assigni a una variable de tipus int, anomenada varInt.
		* Si no ho és, llavors li assignarà a la variable varInt el número 1.
		* (Utilitza per a això l'operador condicional ? : )
		* Després, imprimeix la taula de multiplicar d'aquesta variable.
		*/
		
		int varInt;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escriu un número sencer: ");
		varInt = sc.nextInt();
		
		if (varInt <0 || varInt >10) {
			System.out.println("El número introduit no és vàlid, se li assigna el valor 1");
			varInt = 1;
		}
		System.out.println("\nLa Taula de multiplicar del " + varInt + " és:");
		for (int i=1; i<=10;i++) {
			System.out.println(varInt + " x " + i + " = " + varInt*i);
		}

	}
}

	