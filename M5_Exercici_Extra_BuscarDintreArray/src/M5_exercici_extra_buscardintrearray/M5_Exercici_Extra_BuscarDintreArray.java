package M5_exercici_extra_buscardintrearray;

import java.util.ArrayList;
import java.util.Scanner;

public class M5_Exercici_Extra_BuscarDintreArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> coches = new ArrayList<String>();
		int tama�o, posici�n=0;
		String check_coche, interes_coche;
		boolean ESTA = false;

		coches.add("Dacia");
		coches.add("Mercedes");
		coches.add("Renault");
		coches.add("Lexus");
		coches.add("Fiat");
		coches.add("Volvo");
		coches.add("Seat");

		tama�o = coches.size();

		System.out.println("Qu� marca de coche te interesa?");
		interes_coche = sc.nextLine();

		for (int i = 0; i < tama�o; i++) {
			check_coche = coches.get(i);
			if (check_coche.equalsIgnoreCase(interes_coche)) {
				ESTA = true;
				posici�n = i;
			}
		}
		
		if (ESTA == true) {
			System.out.println("Enhorabuena! La marca " + coches.get(posici�n) + " s� est� en el Concesionario.");
		} else {
			System.out.println("Vaya! La marca " + interes_coche + " no est� en el Concesionario.");
		}

	}
}
