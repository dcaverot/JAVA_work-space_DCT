package m5_exercici4_bucle;

import java.util.Scanner;

public class M5_Exercici4_bucle {

	public static void main(String[] args) {
		/*
		Has de modificar el programa anterior per afegir una nova funcionalitat: establir un n�mero m�xim de 5 intents.
		Si l'��usuari encerta el n�mero escollit pel programa abans d'aquests 5 intents, el programa mostra el seg�ent missatge per pantalla: "Enhorabona, el n�mero �s X i has necessitat Y intents per encertar-ho".
		Si no encerta el n�mero abans de 5 intents, el programa mostra per pantalla: "Has utilitzat massa intents! El n�mero �s X ".
		*/
		
		byte num_random = (byte) Math.ceil((Math.random() * 10));
		byte num_usuari;
		int intentos=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** el n�mero random �s el "+ num_random);
		
		System.out.println("Endevina un n�mero del 0 al 10, tens 5 intents:");
		num_usuari =sc.nextByte();
		
		while (num_random != num_usuari && intentos<5) {
			intentos +=1;
			System.out.println("No l'has endevinat, torna a provar: ");
			num_usuari = sc.nextByte();
		}
		if (intentos==5 && num_random != num_usuari) {
			System.out.println("Has utilitzat massa intens! El n�mero era el "+num_random);
		}else if (intentos==5 && num_random == num_usuari) {	
			System.out.println("Enhorabona! L'has encertat en l'�ltim intent, el n�mero era el "+num_random);
		}else {
			System.out.println("Enhorabona! El n�mero era el "+num_random+", i has necessitat "+intentos+" intents per encertar-ho.");
			}
		}
			
}

