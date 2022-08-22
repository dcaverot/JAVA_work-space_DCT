package m71_exercici1;

import java.util.Scanner;

public class M71_Exercici1 {

	public static void main(String[] args) {
		/*
		Crea un programa on l’usuari introdueix tres notes i el programa calcula la mitja.
		Si la mitja �s inferior a 5 ha de mostrar el seg�ent missatge per pantalla: "No has superat el curs. Has de recuperar��",
		si la mitja est� entre 5 i 7 ha de mostrar: "�Enhorabona! Has aprovat per� hauries de seguir practicant"��,
		si la mitja �s superior a 7 ha de mostrar: "��Enhorabona! Has superat el curs! Passa ja al seg�ent nivell!"
		*/
		
		float total_notes, average;
		int num_notes;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantes notes vols introdu�r?");
		num_notes = sc.nextInt();
		System.out.println("Introdueix les teves " + num_notes + " notes, si us plau.");
		total_notes = introductionNotes(num_notes);
		average = averageCalculation(total_notes, num_notes);
		System.out.println("La nota mitjana �s: "+average);
		System.out.println("");
		
		if (average<5) {
			System.out.println("No has superat el curs. Has de recuperar.");
		} else if (average>=5 && average <=7) {
			System.out.println("Enhorabona! Has aprovat per� hauries de seguir practicant.");
		} else {
			System.out.println("Enhorabona! Has superat el curs! Passa ja al seg�ent nivell!");
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
		
