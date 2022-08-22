package m4_exercici2_condicionals;

import java.util.Scanner;

public class M4_Exercici2_Condicionals {

	public static void main(String[] args) {
		
		/*Si té 5 anys o menys: preescolar
		Si té entre 6 i 11 anys: primària
		Si té entre 12 i 15: ESO
		Si té entre 16 i 17: Batxillerat
		Si és major d'edat: FP o Universitat */
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Bon dia, pots escriure la teva edat, si us plau?");
		byte edat=sc.nextByte();
		
		if(edat>=18) {
			System.out.println("FP o Universitat");
		}
		else {
			if (edat==16 || edat==17) {
				System.out.println("Batxillerat");
				}
			else {
				if (edat>=12 && edat<=15) {
					System.out.println("ESO");
					}
				else {
					if (edat>=6 && edat <=11) {
						System.out.println("Primària");
						}
					else {
						System.out.println("Preescolar");}
					}
			}
		}
	}
		
}

