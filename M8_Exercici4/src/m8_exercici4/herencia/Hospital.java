package m8_exercici4.herencia;

public class Hospital extends Edifici {
	private int numMalalts;

	public Hospital(String nom, int numPlantes, int superficie, int numMalalts) {
		super(nom, numPlantes, superficie);
		this.numMalalts = numMalalts; 

	}

	public int getNumMalalts() {
		return numMalalts;
	}

	public void setNumMalalts(int numMalalts) {
		this.numMalalts = numMalalts;
	}
	
	public int getNumVigilants() {
		final int metrosQuadratsPerVigilant = 1000;
		int numVigilants = super.superficie / metrosQuadratsPerVigilant;
		if (super.superficie % metrosQuadratsPerVigilant != 0) {
			numVigilants += 1;
		}
		return numVigilants;
	}

	@Override
	public void calcularCostVigilancia(){
		final int souVigilants = 1300; // EUR
		int costMensual = souVigilants * getNumVigilants();
		System.out.println("Es necessiten " + getNumVigilants() + " vigilants, que cobren cadascú " + souVigilants
				+ " EUR al mes. El cost mensual del Servei de Vigilància es de " + costMensual + " EUR.");
	}
	
	public void repartirDinar() {
		final int dinarsPerDia = 3;
		int racions = getNumMalalts() * dinarsPerDia;
		System.out.println("S'estan repartint " + racions + " racions diàries.");
	}

	@Override
	public String toString() {
		return "Hospital " + super.nom + ", Número de Plantes: " + super.numPlantes + ", Superficie: " + super.superficie
				+ " m2" + ", Número de malalts ingressats: " + numMalalts + ".";
	}

}
