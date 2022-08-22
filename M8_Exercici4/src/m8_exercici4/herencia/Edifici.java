package m8_exercici4.herencia;

public abstract class Edifici {

	protected String nom;
	protected int numPlantes;
	protected int superficie;
	
	public Edifici(String nom, int numPlantes, int superficie) {
		this.nom = nom;
		this.numPlantes = numPlantes;
		this.superficie = superficie;
	}

	public String getNom() {
		return nom;
	}

	public int getNumPlantes() {
		return numPlantes;
	}

	public int getSuperficie() {
		return superficie;
	}
	
	

	public final void netejar() { // final: no se puede sobrecargar en clases derivadas
		final int superficieNetejadaPerMinut = 5; // m2
		final float tempsCanviDePlanta = 0.5f; // minuts
		final int costPerMinutDeFeina = 1; // euros
		float tempsNetejaMinuts, costNetejaDiari;

		tempsNetejaMinuts = superficie / superficieNetejadaPerMinut + numPlantes * tempsCanviDePlanta;
		costNetejaDiari = tempsNetejaMinuts * costPerMinutDeFeina;

		System.out.print("El temps diari de neteja de l'edifici és de " + (int)tempsNetejaMinuts + " minuts.");
		System.out.println(" És a dir, " + (int) tempsNetejaMinuts / 60 + " hores diaries.");
		System.out.print("El cost diari de neteja és de " + (int) costNetejaDiari + " EUR.");
		System.out.println(" És a dir, " + (int) costNetejaDiari * 30 + " EUR al mes.");
	}
	
	public abstract void calcularCostVigilancia(); // abstract, se obliga a TODAS las clases hijas a implementar este método.

	

	/*
	public String toString() {
		return "Edifici nom=" + nom + ", numPlantes=" + numPlantes + ", superficie=" + superficie + "m2.";
	}
	 */
}
