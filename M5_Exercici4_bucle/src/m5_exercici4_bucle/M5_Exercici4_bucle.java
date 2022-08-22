package m5_exercici4_bucle;

import java.util.Scanner;

public class M5_Exercici4_bucle {

	public static void main(String[] args) {
		/*
		Has de modificar el programa anterior per afegir una nova funcionalitat: establir un número màxim de 5 intents.
		Si l'€™usuari encerta el número escollit pel programa abans d'aquests 5 intents, el programa mostra el següent missatge per pantalla: "Enhorabona, el número és X i has necessitat Y intents per encertar-ho".
		Si no encerta el número abans de 5 intents, el programa mostra per pantalla: "Has utilitzat massa intents! El número és X ".
		*/
		
		byte num_random = (byte) Math.ceil((Math.random() * 10));
		byte num_usuari;
		int intentos=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** el número random és el "+ num_random);
		
		System.out.println("Endevina un número del 0 al 10, tens 5 intents:");
		num_usuari =sc.nextByte();
		
		while (num_random != num_usuari && intentos<5) {
			intentos +=1;
			System.out.println("No l'has endevinat, torna a provar: ");
			num_usuari = sc.nextByte();
		}
		if (intentos==5 && num_random != num_usuari) {
			System.out.println("Has utilitzat massa intens! El número era el "+num_random);
		}else if (intentos==5 && num_random == num_usuari) {	
			System.out.println("Enhorabona! L'has encertat en l'últim intent, el número era el "+num_random);
		}else {
			System.out.println("Enhorabona! El número era el "+num_random+", i has necessitat "+intentos+" intents per encertar-ho.");
			}
		}
			
}

