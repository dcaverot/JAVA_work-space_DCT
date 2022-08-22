package m73_exercici1;

import java.util.Scanner;

public class M73_Exercici1 {

	public static void main(String[] args) {
		/*Realitzar un programa que tingui un men� on se li mostraran 4 opcions a l’usuari per pantalla:
		* 1.- Quadrat
		* 2.- Triangle
		* 3.- Rectangle
		* 4.- Cercle
		* 0.- Sortir del programa
		* Segons l'��opci� escollida haur� d'��introduir unes dades o altres perqu� el programa mostri per pantalla
		* l'���rea (el valor) del pol�gon escollit.
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
		    	System.out.println("Gr�cies per utilitzar l'aplicaci�.");
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
			System.out.println("\nMEN� PRINCIPAL: \n");
		    System.out.println("1. Quadrat.");
		    System.out.println("2. Triangle.");
		    System.out.println("3. Rectangle.");
		    System.out.println("4. Cercle.");
		    System.out.println("0. Sortir de l'aplicaci�.\n");
		    opcio = sc.nextByte();
		    
		    if(opcio < MINIMO || opcio > MAXIMO){
		    	System.out.println("Escull una opci� v�lida");
		    }
		}while(opcio < MINIMO || opcio > MAXIMO);
		
		return opcio;
	}
		   
	public static void areaQuadrat(){
		Scanner sc = new Scanner(System.in);
		int costat;
		
		System.out.println("\n�rea Quadrat.");
		System.out.println("Introdueix el valor del costat:");
		costat = sc.nextInt();
		System.out.println("L'�rea d'un quadrat de costat " + costat + " �s: " + costat*costat);
	}
		   
	public static void areaTriangle(){
    	Scanner sc = new Scanner(System.in);
		int base, altura;
		
		System.out.println("\n�rea Triangle.");
		System.out.println("Introdueix el valor de la base:");
		base = sc.nextInt();
		System.out.println("Introdueix el valor de la altura:");
		altura = sc.nextInt();
		System.out.println("L'�rea d'un triangle de base " + base + " i altura " + altura + " �s: " + (base*altura/2));
	}
	
    public static void areaRectangle(){
    	Scanner sc = new Scanner(System.in);
		int base, altura;
		
		System.out.println("\n�rea Rectangle.");
		System.out.println("Introdueix el valor de la base:");
		base = sc.nextInt();
		System.out.println("Introdueix el valor de la altura:");
		altura = sc.nextInt();
		System.out.println("L'�rea d'un rectangle de base " + base + " i altura " + altura + " �s: " + base*altura);
	}

    public static void areaCercle(){
    	Scanner sc = new Scanner(System.in);
		int radi;
		final float pi = 3.141592f;
		
		System.out.println("\n�rea Cercle.");
		System.out.println("Introdueix el valor del radi:");
		radi = sc.nextInt();
		System.out.println("L'�rea d'un cercle de radi " + radi + " �s: " + radi*radi*pi);
    }	
		
}
