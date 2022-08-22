package m6_exercici2_metodes;

import java.util.Scanner;

public class M6_Exercici2_Metodes {

	public static void main(String[] args) {
		/*
		 * Aquest programa calcula l'edat mitjana d'un n�mero de persones. Aquest n�mero
		 * s'haur� de preguntar a l'usuari. S'ha de crear una funci� que s'encarregui de
		 * demanar les edats a l'usuari i de calcular l'edat mitjana. La funci� rebr�
		 * per par�metre el n� de persones a qui ha de demanar l'edat. L'edat de les
		 * persones�s ser� v�lida si est� compresa entre 0 i 120 anys. La mitjana de les
		 * edats introdu�des s'ha de retornar per la funci� (return).
		 */

		int num_personas = 0;
		float mitjana = 0.0f;

		System.out.println("De quantes persones vols calcular l'edat mitjana?");
		Scanner sc = new Scanner(System.in);
		num_personas = sc.nextByte();
		mitjana = edatMitjana(num_personas);
		System.out.println("L'edad mitjana de les " + num_personas + " persones �s " + mitjana + ".");
	}

	public static float edatMitjana(int num_personas) {
		float resultado = 0.0f;
		int suma_edad = 0, i=1, edad=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("preguntar� l'edat de " + num_personas + " persones.");

		while(i<=num_personas) {
			System.out.println("Edat de la persona " + i + " :");
			edad= sc.nextInt();
			if (edad>0 && edad<=120) {
				suma_edad = suma_edad + edad;
				i+=1;
			} else {
				System.out.println("L'edat introdu�da no �s correcte!");
			}
		}
		
		resultado = (float)suma_edad / num_personas;
		return resultado;
	}
}
