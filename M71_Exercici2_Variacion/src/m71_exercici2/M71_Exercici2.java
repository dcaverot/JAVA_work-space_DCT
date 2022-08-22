package m71_exercici2;

import java.util.Scanner;

public class M71_Exercici2 {

	public static void main(String[] args) {
		/*
		Un professor vol calcular les mitges de les notes de tota la classe.
		Crea una aplicaci� on l'usuari introduir� un n�mero per pantalla
		(el n�mero correspon al n�mero de notes que vol introduir)
		i el programa li demanar� que introdueixi les notes de tots els alumnes.
		Un cop les notes han sigut introduides, el programa retorna el seg�ent:
		Si la nota mitjana �s menor que 5: "La nota mitjana de la classe est� suspesa.
		Els alumnes haurien de preguntar els seus dubtes i treballar m�s".
		Si la nota �s inferior a 7: "La nota mitjana de la classe �s bona, per� els alumnes
		haurien de millorar el treball personal".
		Per la resta de casos, el missatge ha de ser: "Enhorabona! La nota mitjana de la classe es
		correspon amb l'esfor� realitzat".

		*Les notes han d'estar compreses entre 0 i 10.
		 */
		
		float total_notes, average;
		int num_notes;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantes notes vols introdu�r?");
		num_notes = sc.nextInt();
		System.out.println("Introdueix les " + num_notes + " notes, si us plau.");
		
		total_notes = introductionNotes(num_notes);
		average = averageCalculation(total_notes, num_notes);
		
		System.out.println("La nota mitjana de la classe �s: "+average);
		System.out.println("");
		
		if (average<5) {
			System.out.println("La nota mitjana de la classe est� suspesa. Els alumnes haurien de preguntar els seus dubtes i treballar m�s.");
		} else if (average <7) {
			System.out.println("La nota mitjana de la classe �s bona, per� els alumnes haurien de millorar el treball personal.");
		} else {
			System.out.println("Enhorabona! La nota mitjana de la classe es correspon amb l'esfor� realitzat.");
		}
	}
	
	public static float introductionNotes(int num_notes) {
		int i=1;
		float note=0.0f, result=0.0f;
		
		while (i<=num_notes) {
			System.out.println("Introdueix la nota "+i+" :");
			Scanner sc = new Scanner(System.in);
			note = sc.nextFloat();
			if (note>=0 && note<=10) {
				result += note;
				i++;
			} else {
				System.out.println("La nota introdu�da no �s correcte!");
			}
		}
	return result;
	}
		
	public static float averageCalculation(float total_notes, int num_notes) {
		float result=0.0f;
		result = (float) total_notes / num_notes;
	return result;
	}

}
