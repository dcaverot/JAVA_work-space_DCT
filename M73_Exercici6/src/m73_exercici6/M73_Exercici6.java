package m73_exercici6;

import java.util.ArrayList;

public class M73_Exercici6 {

	public static void main(String[] args) {
		// Dona'€™t un array de números, el programa ha de mostrar la suma de tots els
		// números parells i la suma de tots els números imparells.

		ArrayList<Integer> arrayDeNumeros = new ArrayList<Integer>();
		int valor, size, sumaParells = 0, sumaImparells = 0;

		// int arrayDeNumeros[]= {2, 3, 4, 6, 7, 10}; //(Esto sería un Array estático de integers)

		arrayDeNumeros.add(2);
		arrayDeNumeros.add(23);
		arrayDeNumeros.add(22);
		arrayDeNumeros.add(51);
		arrayDeNumeros.add(72);
		arrayDeNumeros.add(101);
		arrayDeNumeros.add(3);
		arrayDeNumeros.add(5);
		arrayDeNumeros.add(8);
		arrayDeNumeros.add(10);

		size = arrayDeNumeros.size() - 1;

		for (int i = 0; i <= size; i++) {
			valor = arrayDeNumeros.get(i);
			if (valor % 2 == 0) {
				sumaParells += valor;
			} else {
				sumaImparells += valor;
			}
		}

		System.out.println("La suma del números parells és " + sumaParells);
		System.out.println("La suma del números imparells és " + sumaImparells);
	}

}
