package m71_exercici8;

import java.util.Scanner;

public class M71_Exercici8 {

	public static void main(String[] args) {
		/*
		 * Crea un programa on l'€™usuari introdueixi una temperatura en ºC i es mostri
		 * per pantalla la conversió en ºFahrenheit K = 32; Fórmula: (0°C x— 9 / 5) + K
		 * = 32°F
		 */

		Scanner sc = new Scanner(System.in);
		float tempC, tempF;

		System.out.println("Introdueix la temperatura en ºCelsius:");
		tempC = sc.nextFloat();

		tempF = (tempC * 9 / 5) + 32;
		System.out.println(tempC + "º Celsius equivalen a " + tempF + "º Fahrenheit");

	}

}
