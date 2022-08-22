package m71_exercici2;

import java.util.ArrayList;
import java.util.Scanner;

public class M71_Exercici2 {

	public static void main(String[] args) {
				
		float total_notes, average, notemax, notemin;
		int num_notes;
		Scanner sc = new Scanner(System.in);
		ArrayList<Float> results = new ArrayList<Float>();
		
		System.out.println("Quantes notes vols introdu�r?");
		num_notes = sc.nextInt();
		System.out.println("Introdueix les " + num_notes + " notes, si us plau.");
		
		results = introductionNotes(num_notes);
		total_notes = results.get(0);
		notemax = results.get(1);
		notemin = results.get(2);
		
		average = averageCalculation(total_notes, num_notes);
		
		System.out.println("La nota mitjana de la classe �s: "+average);
		System.out.println("La nota m�nima de la classe �s: "+notemin);
		System.out.println("La nota m�xima de la classe �s: "+notemax);
		System.out.println("");
		
		if (average<5) {
			System.out.println("La nota mitjana de la classe est� suspesa. Els alumnes haurien de preguntar els seus dubtes i treballar m�s.");
		} else if (average <7) {
			System.out.println("La nota mitjana de la classe �s bona, per� els alumnes haurien de millorar el treball personal.");
		} else {
			System.out.println("Enhorabona! La nota mitjana de la classe es correspon amb l'esfor� realitzat.");
		}
	}
	
	public static ArrayList<Float> introductionNotes(int num_notes) {
		int i=1;
		float note=0.0f, total_notes=0.0f, notemax=0.0f, notemin=10.0f;
		ArrayList<Float> results = new ArrayList<Float>();
		
		while (i<=num_notes) {
			System.out.println("Introdueix la nota "+i+" :");
			Scanner sc = new Scanner(System.in);
			note = sc.nextFloat();
			if (note>=0 && note<=10) {
				total_notes += note;
				
				i++;
			} else {
				System.out.println("La nota introdu�da no �s correcte!");
			}
			if (note > notemax) {
				notemax = note;
			}
			if (note < notemin) {
				notemin = note;
			}
		}
		
		results.add(total_notes);
		results.add(notemax);
		results.add(notemin);
		
	return results;
	}
		
	public static float averageCalculation(float total_notes, int num_notes) {
		float result=0.0f;
		result = (float) total_notes / num_notes;
	return result;
	}

}
