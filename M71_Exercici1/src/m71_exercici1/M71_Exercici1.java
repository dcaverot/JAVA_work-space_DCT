package m71_exercici1;

import java.util.Scanner;

public class M71_Exercici1 {

	public static void main(String[] args) {
		/*
		Crea un programa on lâ€™usuari introdueix tres notes i el programa calcula la mitja.
		Si la mitja és inferior a 5 ha de mostrar el següent missatge per pantalla: "No has superat el curs. Has de recuperar€",
		si la mitja està  entre 5 i 7 ha de mostrar: "œEnhorabona! Has aprovat però hauries de seguir practicant"€,
		si la mitja és superior a 7 ha de mostrar: "€Enhorabona! Has superat el curs! Passa ja al següent nivell!"
		*/
		
		float total_notes, average;
		int num_notes;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantes notes vols introduïr?");
		num_notes = sc.nextInt();
		System.out.println("Introdueix les teves " + num_notes + " notes, si us plau.");
		total_notes = introductionNotes(num_notes);
		average = averageCalculation(total_notes, num_notes);
		System.out.println("La nota mitjana és: "+average);
		System.out.println("");
		
		if (average<5) {
			System.out.println("No has superat el curs. Has de recuperar.");
		} else if (average>=5 && average <=7) {
			System.out.println("Enhorabona! Has aprovat però hauries de seguir practicant.");
		} else {
			System.out.println("Enhorabona! Has superat el curs! Passa ja al següent nivell!");
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
		
