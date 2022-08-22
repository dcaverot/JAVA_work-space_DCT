package m4_exercici5_switch;

import java.util.Scanner;

public class M4_Exercici5_Switch {

	public static void main(String[] args) {
		/*Fer un programa que demani dos números i un operador(+,-,*,/).
		Al final, el programa ha d'imprimir per pantalla el resultat de fer l’operació que contingui la variable operador.
		*/
		
		// Con CharAt ***************************
		
		int num1, num2;
		float resultado=0.0f;
		String lectura;
		char oper;
		String opertext="default";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriu el primer número:");
		num1 = sc.nextInt();
		System.out.println("Escriu el segon número:");
		num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Escriu un operador (+, -, *, /)");
		lectura = sc.nextLine();
		oper = lectura.charAt(0);
		
		switch(oper) {
			case '+':
				resultado = num1 + num2;
				opertext = "sumar";
				break;
			case '-':
				resultado = num1 - num2;
				opertext = "restar";
				break;
			case '*':
				resultado = num1 * num2;
				opertext = "multiplicar";
				break;
			case '/':
				resultado = (float)num1 / num2;
				opertext = "dividir";
				break;	
		}
		System.out.println("El resultat de "+ opertext + " els dos números és: " + resultado);
	}

}
