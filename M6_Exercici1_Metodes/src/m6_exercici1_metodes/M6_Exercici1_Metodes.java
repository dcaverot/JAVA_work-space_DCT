package m6_exercici1_metodes;

import java.util.Scanner;

public class M6_Exercici1_Metodes {

	public static void main(String[] args) {
		/*
		Modificar la calculadora arcaica (M4 Exercici5). El programa demana a l'usuari que introdueixi dos n�meros i l'operaci� que desitja realitzar. 
		Cada operaci� (suma, resta, multiplicaci�, divisi� i m�dul) estar� programada en una funci� diferent.
		*/
		
		int num1, num2;
		float resultado=0.0f;
		String lectura;
		char oper;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriu el primer n�mero:");
		num1 = sc.nextInt();
		System.out.println("Escriu el segon n�mero:");
		num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Escriu un operador (+, -, *, /,%)");
		lectura = sc.nextLine();
		oper = lectura.charAt(0);
		
		switch(oper) {
			case '+':
				resultado = suma(num1, num2);
				break;
			case '-':
				resultado = resta(num1, num2);
				break;
			case '*':
				resultado = multiplicacion(num1, num2);
				break;
			case '/':
				resultado = division(num1, num2);
				break;
			case '%':
				resultado = m�dulo(num1, num2);
				break;	
		}
		System.out.println("El resultat �s: " + resultado);
	}
	
	public static float suma(int num1,int num2) {
		return num1 + num2;
	}
	
	public static float resta(int num1,int num2) {
		return num1 - num2;
	}
	
	public static float multiplicacion(int num1,int num2) {
		return num1 * num2;
	}
	
	public static float division(int num1,int num2) {
		return (float)num1 / num2;
	}
	
	public static float m�dulo(int num1,int num2) {
		return num1 % num2;
	}
}

