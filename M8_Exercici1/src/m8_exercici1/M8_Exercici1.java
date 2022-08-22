package m8_exercici1;

import java.util.ArrayList;

public class M8_Exercici1 {

	public static void main(String[] args) {
		
		ArrayList<Ordinador> arrayOrdinadors = new ArrayList<Ordinador>();

		Ordinador pc1 = new Ordinador("Lenovo", "ThinkPad E15");
		pc1.setProcessador("i5");
		pc1.setRam(16);
		pc1.setDiscdur(500);

		System.out.println("Ordinador pc1: " + pc1.toString());

		Ordinador pc2 = new Ordinador("Dell", "Inspirion", "i7", 32, 1000);

		System.out.println("Ordinador pc2: marca=" + pc2.getMarca() + ", model=" + pc2.getModel());
		System.out.println("Ordinador pc2: ram=" +pc2.getRam());
		
		pc2.setRam(64);
		System.out.println("Ordinador pc2: " + pc2.toString());

		System.out.println(pc1.executant("Eclipse") + " al pc1");
		System.out.println(pc2.executant("Discord") + " al pc2");
		
			
		for (int i=0; i<5;i++) {
			arrayOrdinadors.add(pc1);
			System.out.println(arrayOrdinadors.get(i));
		}

		System.out.println(arrayOrdinadors);
		System.out.println(arrayOrdinadors.get(0).getMarca());
		
		
		
		
	}
}
