package m3_exercici2;

import java.util.Scanner;

public class M3_Exercici2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Escriu el teu Nom:");
		String  nombre = sc.nextLine();
		
		System.out.println ("Escriu el teu Cognom:");
		String apellido = sc.nextLine();
		
		System.out.println ("Escriu la teva Edad:");
		int edad = sc.nextInt();
		
		System.out.println ("Et dius " + nombre + " " + apellido + " i tens " + edad + " anys" );
				
	}
}
