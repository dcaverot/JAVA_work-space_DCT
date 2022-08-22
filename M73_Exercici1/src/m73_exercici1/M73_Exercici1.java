package m73_exercici1;

import java.util.Scanner;

public class M73_Exercici1 {

	public static void main(String[] args) {
		/*Realitzar un programa que tingui un menú on se li mostraran 4 opcions a lâ€™usuari per pantalla:
		* 1.- Quadrat
		* 2.- Triangle
		* 3.- Rectangle
		* 4.- Cercle
		* 0.- Sortir del programa
		* Segons l'€™opció escollida haurà  d'€™introduir unes dades o altres perquè el programa mostri per pantalla
		* l'€™àrea (el valor) del polígon escollit.
		*/
		
		boolean sortir = false;
		       
        do{
        	switch(menu()){
		    case 1: areaQuadrat();
		    	break;
		    case 2: areaTriangle();
		    	break;
		    case 3: areaRectangle();
		    	break;
		    case 4: areaCercle();
		    	break;
		    case 0:
		    	System.out.println("Gràcies per utilitzar l'aplicació.");
		        sortir = true;
		        break;
        	}
        }while(!sortir);   
	
	}
	
	public static byte menu(){
		
		Scanner sc = new Scanner(System.in);
		byte opcio;
		final byte MINIMO = 0;
		final byte MAXIMO = 4;

		do{
			System.out.println("\nMENÚ PRINCIPAL: \n");
		    System.out.println("1. Quadrat.");
		    System.out.println("2. Triangle.");
		    System.out.println("3. Rectangle.");
		    System.out.println("4. Cercle.");
		    System.out.println("0. Sortir de l'aplicació.\n");
		    opcio = sc.nextByte();
		    
		    if(opcio < MINIMO || opcio > MAXIMO){
		    	System.out.println("Escull una opció vàlida");
		    }
		}while(opcio < MINIMO || opcio > MAXIMO);
		
		return opcio;
	}
		   
	public static void areaQuadrat(){
		Scanner sc = new Scanner(System.in);
		int costat;
		
		System.out.println("\nÀrea Quadrat.");
		System.out.println("Introdueix el valor del costat:");
		costat = sc.nextInt();
		System.out.println("L'àrea d'un quadrat de costat " + costat + " és: " + costat*costat);
	}
		   
	public static void areaTriangle(){
    	Scanner sc = new Scanner(System.in);
		int base, altura;
		
		System.out.println("\nÀrea Triangle.");
		System.out.println("Introdueix el valor de la base:");
		base = sc.nextInt();
		System.out.println("Introdueix el valor de la altura:");
		altura = sc.nextInt();
		System.out.println("L'àrea d'un triangle de base " + base + " i altura " + altura + " és: " + (base*altura/2));
	}
	
    public static void areaRectangle(){
    	Scanner sc = new Scanner(System.in);
		int base, altura;
		
		System.out.println("\nÀrea Rectangle.");
		System.out.println("Introdueix el valor de la base:");
		base = sc.nextInt();
		System.out.println("Introdueix el valor de la altura:");
		altura = sc.nextInt();
		System.out.println("L'àrea d'un rectangle de base " + base + " i altura " + altura + " és: " + base*altura);
	}

    public static void areaCercle(){
    	Scanner sc = new Scanner(System.in);
		int radi;
		final float pi = 3.141592f;
		
		System.out.println("\nÀrea Cercle.");
		System.out.println("Introdueix el valor del radi:");
		radi = sc.nextInt();
		System.out.println("L'àrea d'un cercle de radi " + radi + " és: " + radi*radi*pi);
    }	
		
}
