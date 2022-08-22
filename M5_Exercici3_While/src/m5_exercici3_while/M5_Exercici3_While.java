package m5_exercici3_while;

import java.util.Scanner;

public class M5_Exercici3_While {

	public static void main(String[] args) {
		/*
		Aquesta l�nia de codi: Math.ceil((Math.random() * 10));  Retorna un n�mero entre el 0 i el 10 de forma aleat�ria.
		L�'exercici consisteix a qu3 l'��usuari ha d'endevinar el n�mero escollit aleat�riament pel programa.
		El programa, demana n�meros a l'usuari fins que aquest encerti el n�mero aleatori generat pel programa.
		Un cop l'usuari ha endevinat el n�mero, es mostrar�per pantalla el seg�ent missatge: "�Enhorabona, el n�mero era X"� 
		*/
		
		byte num_random = (byte) Math.ceil((Math.random() * 10));
		byte num_usuari;
		int intentos=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Endevina un n�mero del 0 al 10: ");
		num_usuari =sc.nextByte();
		
		while (num_random != num_usuari) {
			intentos +=1;
			System.out.println("No l'has endevinat, torna a provar: ");
			num_usuari = sc.nextByte();
		}
	
			System.out.println("Enhorabona! El n�mero era el "+num_random);
			System.out.println("Intentos: "+intentos);
	}

}
