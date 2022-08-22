package m72_exercici8;

import java.util.ArrayList;
import java.util.Scanner;

public class M72_Exercici8 {

	public static void main(String[] args) {
		/*
		 * L'usuari introdueix un nombre per teclat i el programa crida a un mètode que
		 * ha de mostrar la successió de Fibonacci. Exemple: Si l'€™usuari introdueix el
		 * 10 el resultat ha de ser: 0,1,1,2,3,5,8,13,21,34
		 */

		int num;
		ArrayList<Integer> results = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
	
		do {
		System.out.println("Introdueix un número sencer positiu més gran o igual a 1:");
		num = sc.nextInt();
		if (num<1) {
			System.out.println("El número ha de ser más gran o igual a 1!");
			System.out.println("");
		}
		
		} while (num<1);
		
		results=fibonacci (num);
		System.out.println(results);
		
	}

	public static ArrayList<Integer> fibonacci(int num) {
		int aux1=0, aux2=1, i=0;
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		while (i<num) {
			results.add(aux1);
			aux1 = aux1 + aux2;
			i=i+1;
			if (i<num) {
				results.add(aux2);	
				aux2 = aux1 + aux2;
				i=i+1;
			}
		}
	return results;		
	}
	
}

	
