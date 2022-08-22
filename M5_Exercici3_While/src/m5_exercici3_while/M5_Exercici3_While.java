package m5_exercici3_while;

import java.util.Scanner;

public class M5_Exercici3_While {

	public static void main(String[] args) {
		/*
		Aquesta línia de codi: Math.ceil((Math.random() * 10));  Retorna un número entre el 0 i el 10 de forma aleatòria.
		L€'exercici consisteix a qu3 l'€™usuari ha d'endevinar el número escollit aleatòriament pel programa.
		El programa, demana números a l'usuari fins que aquest encerti el número aleatori generat pel programa.
		Un cop l'usuari ha endevinat el número, es mostrarà per pantalla el següent missatge: "œEnhorabona, el número era X" 
		*/
		
		byte num_random = (byte) Math.ceil((Math.random() * 10));
		byte num_usuari;
		int intentos=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Endevina un número del 0 al 10: ");
		num_usuari =sc.nextByte();
		
		while (num_random != num_usuari) {
			intentos +=1;
			System.out.println("No l'has endevinat, torna a provar: ");
			num_usuari = sc.nextByte();
		}
	
			System.out.println("Enhorabona! El número era el "+num_random);
			System.out.println("Intentos: "+intentos);
	}

}
