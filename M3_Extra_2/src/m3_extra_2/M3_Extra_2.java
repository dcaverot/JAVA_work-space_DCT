package m3_extra_2;

import java.util.Scanner;

public class M3_Extra_2 {

	public static void main(String[] args) {
		/* Escriu un programa Java que sol�liciti per pantalla un nombre enter, i si �s menor que 10,
		* ho assigni a una variable de tipus int, anomenada varInt.
		* Si no ho �s, llavors li assignar� a la variable varInt el n�mero 1.
		* (Utilitza per a aix� l'operador condicional ? : )
		* Despr�s, imprimeix la taula de multiplicar d'aquesta variable.
		*/
		
		int varInt;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escriu un n�mero sencer: ");
		varInt = sc.nextInt();
		
		if (varInt <0 || varInt >10) {
			System.out.println("El n�mero introduit no �s v�lid, se li assigna el valor 1");
			varInt = 1;
		}
		System.out.println("\nLa Taula de multiplicar del " + varInt + " �s:");
		for (int i=1; i<=10;i++) {
			System.out.println(varInt + " x " + i + " = " + varInt*i);
		}

	}
}

	