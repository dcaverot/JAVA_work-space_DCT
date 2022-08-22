package m8_exercici4.herencia;

public class Hotel extends Edifici {
	private int numHabitacions;

	
	public Hotel(String nom, int numPlantes, int superficie, int numHabitacions) {
		super(nom, numPlantes, superficie);
		this.numHabitacions = numHabitacions;
	}

	public int getNumHabitacions() {
		return numHabitacions;
	}

	public void setNumHabitacions(int numHabitacions) {
		this.numHabitacions = numHabitacions;
	}

	private int getNumVigilants() {
		final int metrosQuadratsPerVigilant = 1000;
		int numVigilants = super.superficie / metrosQuadratsPerVigilant;
		if (super.superficie % metrosQuadratsPerVigilant != 0) {
			numVigilants += 1;
		}
		return numVigilants;
	}

	@Override
	public void calcularCostVigilancia(){
		final int souVigilants = 1800; // EUR
		int costMensual = souVigilants * getNumVigilants();
		System.out.println("Es necessiten " + getNumVigilants() + " vigilants, que cobren cadascú " + souVigilants +
		" EUR al mes. El cost mensual del Servei de Vigilància es de " + costMensual + " EUR.");
	}
	
	public void calcularServeiHabitacions() {
		final int habitacionsPerPersona = 20;
		int personesServeiHabitacions;
		int souServeiHabitacions = 1000; //EUR
		int costServeiHabitacions;
		
		personesServeiHabitacions = numHabitacions / habitacionsPerPersona;
		if (numHabitacions % habitacionsPerPersona !=0) {
			personesServeiHabitacions +=1;
		}
		costServeiHabitacions = personesServeiHabitacions * souServeiHabitacions;
		System.out.println("Per atendre el Servei d'Habitacions de l'hotel són necessàries " + personesServeiHabitacions
				+ " persones.");
		System.out.println("Per pagar els sous del personal de Servei d'Habitacions es necessiten " + costServeiHabitacions +
				" EUR al mes.");
	
	}

	@Override
	public String toString() {
		return "Hotel " + super.nom + ", Número de Plantes: " + super.numPlantes + ", Superficie: " + super.superficie
				+ " m2" + ", Número d'habitacions: " + numHabitacions + ".";
	}

}
