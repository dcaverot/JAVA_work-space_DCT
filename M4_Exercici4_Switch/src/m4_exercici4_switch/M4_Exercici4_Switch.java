package m4_exercici4_switch;

import java.util.Scanner;

public class M4_Exercici4_Switch {

	public static void main(String[] args) {
		/*
		 L’usuari introdueix un mes per pantalla i mitjançant un switch amb els 12 mesos de l’any, el programa calcula els dies del mes i mostra el següent: 
		Exemple: Si el número introduït és 1, llavors ha d'aparèixer per pantalla: “El mes de gener té 31 dies”
		 */
	byte lectura;
	String resposta;
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Introdueix un mes de l'any en número:");
	lectura = sc.nextByte();
		
	switch(lectura){
		case 1:
			resposta = "El mes de gener té 31 dies"	;
			break;
		case 2:
			resposta = "El mes de febrer té 28 dies"	;
			break;
		case 3:
			resposta = "El mes de març té 31 dies"	;
			break;
		case 4:
			resposta = "El mes de abril té 30 dies"	;
			break;	
		case 5:
			resposta = "El mes de maig té 31 dies"	;
			break;	
		case 6:
			resposta = "El mes de juny té 30 dies"	;
			break;
		case 7:
			resposta = "El mes de juliol té 31 dies"	;
			break;	
		case 8:
			resposta = "El mes d'agost té 31 dies"	;
			break;	
		case 9:
			resposta = "El mes de setembre té 30 dies"	;
			break;	
		case 10:
			resposta = "El mes d'octubre té 31 dies"	;
			break;
		case 11:
			resposta = "El mes de novembre té 30 dies"	;
			break;
		case 12:
			resposta = "El mes de desembre té 31 dies"	;
			break;	
		default:
			resposta = "El número que has introduït no correpon a cap mes de l'any";
	}
	System.out.println(resposta);
	}

}
