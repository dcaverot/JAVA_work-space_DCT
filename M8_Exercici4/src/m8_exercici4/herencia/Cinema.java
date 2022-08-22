package m8_exercici4.herencia;

public class Cinema extends Edifici {
	private int aforament;


	public Cinema(String nom, int numPlantes, int superficie, int aforament) {
		super(nom, numPlantes, superficie);
		this.aforament = aforament;
	}
	
	public int getAforament() {
		return aforament;
	}

	public void setAforament(int aforament) {
		this.aforament = aforament;
	}

	public int getNumVigilants() {
		final int metrosQuadratsPerVigilant = 3000;
		int numVigilants = super.superficie / metrosQuadratsPerVigilant;
		if (super.superficie % metrosQuadratsPerVigilant != 0) {
			numVigilants += 1;
		}
		return numVigilants;
	}

	@Override
	public void calcularCostVigilancia() {
		final int souVigilants = 1300; // EUR
		int costMensual = souVigilants * getNumVigilants();
		System.out.println("Es necessiten " + getNumVigilants() + " vigilants, que cobren cadasc� " + souVigilants
				+ " EUR al mes. El cost mensual del Servei de Vigil�ncia es de " + costMensual + " EUR.");
	}
	
	public void projectarSessio(int numAssistents, float preuEntrada) {
		float recaptacio;
		if (numAssistents > aforament) {
			System.out.println("El n�mero d'assistents (" + numAssistents + ") excedeix l'aforament (" + aforament + ").");
			System.out.println("Nom�s podran entrar a la sessi� " + aforament + " assitents.");
			numAssistents = aforament;
		} 
		recaptacio = preuEntrada * numAssistents;
		System.out.println("S'han recaptat " + (int) recaptacio + " EUR en aquesta sessi�." );
	}

	@Override
	public String toString() {
		return "Cinema " + super.nom + ", N�mero de Plantes: " + super.numPlantes + ", Superficie: " + super.superficie
				+ " m2" + ", Aforament: " + aforament + " persones.";
	}

}
