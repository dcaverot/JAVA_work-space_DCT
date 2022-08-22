package m8_exercici1;

public class Ordinador {

	private String marca;
	private String model;
	private String processador;
	private int ram;
	private int discdur;

	public Ordinador(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}

	public Ordinador(String marca, String model, String processador, int ram, int discdur) {
		this.marca = marca;
		this.model = model;
		this.processador = processador;
		this.ram = ram;
		this.discdur = discdur;
	}

	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getDiscdur() {
		return discdur;
	}

	public void setDiscdur(int discdur) {
		this.discdur = discdur;
	}

	public String executant(String programa) {
		String resposta = "En aquests moments s'està executant " + programa;
		return resposta;
	}

	@Override
	public String toString() {
		return "marca=" + marca + ", model=" + model + ", processador=" + processador + ", ram=" + ram + ", discdur="
				+ discdur + ".";
	}

}