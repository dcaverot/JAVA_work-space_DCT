package m73_exercici7;

import java.util.Scanner;

public class M73_Exercici7 {

	public static void main(String[] args) {
		/*
		 * Un grup d'amics ha quedat per fer una fideuÃ Â , els ingredients principals
		 * seran: fideus, gambes, i calamars. Saben que per cada quatre persones han
		 * d'utilitzar mig quilo de fideus, 400 grams de calamars i 200 grams de gambes.
		 * S'ha de fer un programa que demani per pantalla el preu per quilo de cada
		 * ingredient i el nombre d'Â™amics que seran per dinar. El programa ha de
		 * calcular les quantitats necessÃ ries de cada ingredient, el preu per persona
		 * i el preu final de la fideuÃ Â 
		 */

		final float FIDEUSX4 = 0.5f, CALAMARSX4 = 0.4f, GAMBESX4 = 0.2f;
		float preuPerQuiloFideus, preuPerQuiloCalamars, preuPerQuiloGambes;
		float qtyFideus, qtyCalamars, qtyGambes;
		float preuPerPersona, preuTotal;
		int amics;
		Scanner sc = new Scanner(System.in);

		System.out.println("Quants amics quedareu per dinar?");
		amics = sc.nextInt();

		System.out.println("Quin és el preu en EUR del Kg de fideus?");
		preuPerQuiloFideus = sc.nextFloat();

		System.out.println("Quin és el preu en EUR del Kg de calamars?");
		preuPerQuiloCalamars = sc.nextFloat();

		System.out.println("Quin és el preu en EUR del Kg de gambes?");
		preuPerQuiloGambes = sc.nextFloat();

		qtyFideus = FIDEUSX4 / 4 * amics;
		qtyCalamars = CALAMARSX4 / 4 * amics;
		qtyGambes = GAMBESX4 / 4 * amics;

		preuTotal = qtyFideus * preuPerQuiloFideus + qtyCalamars * preuPerQuiloCalamars + qtyGambes * preuPerQuiloGambes;
		preuPerPersona = preuTotal / amics;

		System.out.println("\nPer fer el dinar pels " + amics + " amics, necessitareu:");
		System.out.print(qtyFideus + " Kg de Fideus, ");
		System.out.print(qtyCalamars + " Kg de Calamars, ");
		System.out.println("i " + qtyGambes + " Kg de Gambes.\n");

		System.out.println("El preu Total de la fideuà serà de " + preuTotal + " EUR.");
		System.out.println("A cada amic us tocarà pagar " + preuPerPersona + " EUR.");

	}

}
