package m8_exercici2;

public class Hotel {

	private String nomHotel;
	private int numHabitacions;
	private int numPlantes;
	private int superficieHotel;
	
	public Hotel(String nomHotel, int numHabitacions, int numPlantes, int superficieHotel) {
		super();
		this.nomHotel = nomHotel;
		this.numHabitacions = numHabitacions;
		this.numPlantes = numPlantes;
		this.superficieHotel = superficieHotel;
	}

	public String getNomHotel() {
		return nomHotel;
	}

	public int getNumHabitacions() {
		return numHabitacions;
	}

	public void setNumHabitacions(int numHabitacions) {
		this.numHabitacions = numHabitacions;
	}

	public int getNumPlantes() {
		return numPlantes;
	}

	public void setNumPlantes(int numPlantes) {
		this.numPlantes = numPlantes;
	}

	public int getSuperficieHotel() {
		return superficieHotel;
	}

	public void setSuperficieHotel(int superficieHotel) {
		this.superficieHotel = superficieHotel;
	}

	public void calcularManteniment() {
		int persones, cost;
		final int salari = 1500, habitacionsPerPersona = 20;

		persones = getNumHabitacions() / habitacionsPerPersona;

		if (getNumHabitacions() % habitacionsPerPersona != 0) {
			persones += 1;
		}
		
		cost = persones * salari;

		System.out.println("El manteniment de l'hotel requereix " + persones + " persones, i el cost mensual es de "
				+ cost + " EUR.");
	}

	@Override
	public String toString() {
		return "Hotel " + nomHotel + ": Número d'habitacions = " + numHabitacions + ", Número de plantes = " + numPlantes
				+ ", Superfície de l'hotel = " + superficieHotel + " m2.";
	}

	
}
