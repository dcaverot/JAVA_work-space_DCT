package examen_exercici4;

public class Jugador {
	private String nomJugador;
	private String cognom;
	private String nacionalitat;
	private int edat;

	public Jugador(String nomJugador, String cognom, String nacionalitat, int edat) {
		this.nomJugador = nomJugador;
		this.cognom = cognom;
		this.nacionalitat = nacionalitat;
		this.edat = edat;
	}

	public String getNomJugador() {
		return nomJugador;
	}

	public void setNomJugador(String nomJugador) {
		this.nomJugador = nomJugador;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public String getNacionalitat() {
		return nacionalitat;
	}

	public void setNacionalitat(String nacionalitat) {
		this.nacionalitat = nacionalitat;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String toString() {
		return "Nom del Jugador: " + nomJugador + ", Cognom: " + cognom + ", Nacionalitat: " + nacionalitat + ", Edat: "
				+ edat + "anys.";
	}

}
