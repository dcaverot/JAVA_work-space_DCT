package m71_exercici2;

import java.util.Scanner;

public class M71_Exercici2 {

	public static void main(String[] args) {
		/*
		Un professor vol calcular les mitges de les notes de tota la classe.
		Crea una aplicació on l'usuari introduirà un número per pantalla
		(el número correspon al número de notes que vol introduir)
		i el programa li demanarà que introdueixi les notes de tots els alumnes.
		Un cop les notes han sigut introduides, el programa retorna el següent:
		Si la nota mitjana és menor que 5: "La nota mitjana de la classe està suspesa.
		Els alumnes haurien de preguntar els seus dubtes i treballar més".
		Si la nota és inferior a 7: "La nota mitjana de la classe és bona, però els alumnes
		haurien de millorar el treball personal".
		Per la resta de casos, el missatge ha de ser: "Enhorabona! La nota mitjana de la classe es
		correspon amb l'esforç realitzat".

		*Les notes han d'estar compreses entre 0 i 10.
		 */
		
		float total_notes, average;
		int num_notes;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantes notes vols introduïr?");
		num_notes = sc.nextInt();
		System.out.println("Introdueix les " + num_notes + " notes, si us plau.");
		
		total_notes = introductionNotes(num_notes);
		average = averageCalculation(total_notes, num_notes);
		
		System.out.println("La nota mitjana de la classe és: "+average);
		System.out.println("");
		
		if (average<5) {
			System.out.println("La nota mitjana de la classe està suspesa. Els alumnes haurien de preguntar els seus dubtes i treballar més.");
		} else if (average <7) {
			System.out.println("La nota mitjana de la classe és bona, però els alumnes haurien de millorar el treball personal.");
		} else {
			System.out.println("Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat.");
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
				System.out.println("La nota introduïda no és correcte!");
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
