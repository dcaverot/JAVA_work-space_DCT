package m4_exercici6_switch;

import java.util.Scanner;

public class M4_Exercici6_Switch {

	public static void main(String[] args) {
		/*
		Fer un programa que demani a l’usuari quin dia i quin mes va néixer, amb aquesta informació el programa mostra per pantalla, de quin signe del zodíac és.

		Àries-Aries (21.03 — 19.04)
		Taure-Tauro (20.04 — 20.05)
		Bessons-Géminis (21.05 — 20.06)
		Cranc-Cáncer (21.06 — 22.07)
		LLeó-Leo (23.07 — 22.08)
		Verge-Virgo (23.08 — 22.09)
		Balança-Libra (23.09 — 22.10)
		Escorpi-Escorpio (23.10 — 21.11)
		Sagitario-Sagitario (22.11 — 21.12)
		Capricorn-Capricornio (22.12 — 19.01)
		Aquari-Acuario (20.01 — 18.02)
		Peixos-Piscis (19.02 — 20.03)
 
		 */
		
		byte mes, dia;
		String resultado = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quin mes de l'any vas néixer? (en número)");
		mes = sc.nextByte();
		System.out.println("Quin dia del mes vas néixer? (en número)");
		dia = sc.nextByte();
		
		switch (mes) {
		case 1:
			if (dia>=20){
				resultado ="Aquari - Acuario";
			}else {
				resultado ="Capricorn - Capricornio";				
			}
					break;
		case 2:
			if (dia>=19){
				resultado ="Peixos - Piscis";
			}else {
				resultado ="Aquari - Acuario";				
			}
					break;		
		case 3:
			if (dia>=21){
				resultado ="Áries - Aries";
			}else {
				resultado ="Peixos - Piscis";				
			}
					break;			
		case 4:
			if (dia>=20){
				resultado ="Taure - Tauro";
			}else {
				resultado ="Áries - Aries";				
			}
					break;			
		case 5:
			if (dia>=21){
				resultado ="Bessons - Géminis";
			}else {
				resultado ="Taure - Tauro";				
			}
					break;							
		case 6:
			if (dia>=21){
				resultado ="Cranc - Cáncer";
			}else {
				resultado ="Bessons - Géminis";				
			}
					break;							
		case 7:
			if (dia>=23){
				resultado ="Lleó - Leo";
			}else {
				resultado ="Cranc - Cáncer";				
			}
					break;													
		case 8:
			if (dia>=23){
				resultado ="Verge - Virgo";
			}else {
				resultado ="Lleó - Leo";				
			}
					break;	
		case 9:
			if (dia>=23){
				resultado ="Balança - Libra";
			}else {
				resultado ="Verge - Virgo";				
			}
					break;						
		case 10:
			if (dia>=23){
				resultado ="Escorpí - Escorpio";
			}else {
				resultado ="Balança - Libra";				
			}
					break;						
		case 11:
			if (dia>=22){
				resultado ="Sagitari - Sagitario";
			}else {
				resultado ="Escorpí - Escorpio";				
			}
					break;						
		case 12:
			if (dia>=22){
				resultado ="Capricorn - Capricornio";
			}else {
				resultado ="Sagitari - Sagitario";				
			}
					break;						
		default:
			System.out.println("El mes introduït no és correcte");
					
		}
		
		System.out.println(resultado);
				
	}

}
