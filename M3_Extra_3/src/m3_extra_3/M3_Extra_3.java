package m3_extra_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class M3_Extra_3 {

	public static void main(String[] args) {
		/*
		 * Escriu un programa Java que calculi els litres de pintura necessaris per a pintar una paret
		 * rectangular. Un litre de pintura cobreix aproximadament, 12m2 en una sola mà.
		 * Crea una constant anomenat coberturaLitro per a guardar la dada de cobertura de la pintura (12m2)
		 * Hauràs de demanar a l'usuari:
		 * - L'alt i ample de la paret ( multiplicant sabràs l'àrea de la mateixa )
		 * - El nombre de mans a aplicar
		 * Mostra en pantalla els litres de pintura a utilitzar.
		 */

		final int coberturaLitro = 12;
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("\nNecessites " + df.format(introduccioDades() / coberturaLitro)
		+ " litres de pintura.");
				
	}
	
	public static float introduccioDades() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calcularem la pintura necessària.");
		System.out.println("\nAltura de la paret? (metres)");
		float altura = sc.nextFloat();
		System.out.println("Ample de la paret? (metres)");
		float ample = sc.nextFloat();
		System.out.println("Capes de pintura?");
		int capes = sc.nextInt();
		float metros2 = altura * ample * capes;
		return metros2;
	}

}
