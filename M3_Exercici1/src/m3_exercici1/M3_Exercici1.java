package m3_exercici1;

import java.util.Scanner;

public class M3_Exercici1 {

	public static void main(String[] args) {
				
			int suma, resta, multiplicacion;
				
			Scanner sc = new Scanner(System.in);
			System.out.println("Escriu el primer integer:");
			int num1=sc.nextInt();
			
			System.out.println("Escriu el segon integer:");
			int num2=sc.nextInt();
			
			suma = num1 + num2;						
			System.out.println("El resultat de la suma es: " + suma);
			
			resta = num1 - num2;
			System.out.println("El resultat de la resta es: " + resta);
			
			multiplicacion = num1 * num2;
			System.out.println("El resultat de la multiplicacio es: " + multiplicacion);
			
			double division = (double)num1 / (double)num2;
			System.out.println("El resultat de la divisio es: " + division);
		}	
	}


