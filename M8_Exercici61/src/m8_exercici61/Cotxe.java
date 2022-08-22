package m8_exercici61;

public class Cotxe {
	private int potencia;
	private int velocitatMax;
	private String color;
	private int preuMercat;
	
	
	public Cotxe(int potencia, int velocitatMax, String color, int preuMercat) {
		super();
		this.potencia = potencia;
		this.velocitatMax = velocitatMax;
		this.color = color;
		this.preuMercat = preuMercat;
	}
	
	public int getpotencia() {
		return potencia;
	}
	public void setpotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getvelocitatMax() {
		return velocitatMax;
	}
	public void setvelocitatMax(int velocitatMax) {
		this.velocitatMax = velocitatMax;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPreuMercat() {
		return preuMercat;
	}
	public void setPreuMercat(int preuMercat) {
		this.preuMercat = preuMercat;
	}

	@Override
	public String toString() {
		return "Cotxe Potència: " + potencia + " KW, Velocitat Mèxima: " + velocitatMax + " Km/h, Color: " + color +
				", Preu de Mercat: " + preuMercat + " EUR.";
	}
	
}
