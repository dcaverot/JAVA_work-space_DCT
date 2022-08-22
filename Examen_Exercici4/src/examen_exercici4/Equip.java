package examen_exercici4;

import java.util.ArrayList;

public class Equip {
	private String nomEquip;
	private String ciutat;
	private String nomEstadi;
	private ArrayList<Jugador> jugadors;

	public Equip(String nomEquip, String ciutat, String nomEstadi) {
		this.nomEquip = nomEquip;
		this.ciutat = ciutat;
		this.nomEstadi = nomEstadi;
		this.jugadors = new ArrayList<Jugador>();
	}

	public String getNomEquip() {
		return nomEquip;
	}

	public void setNomEquip(String nomEquip) {
		this.nomEquip = nomEquip;
	}

	public String getCiutat() {
		return ciutat;
	}

	public void setCiutat(String ciutat) {
		this.ciutat = ciutat;
	}

	public String getNomEstadi() {
		return nomEstadi;
	}

	public void setNomEstadi(String nomEstadi) {
		this.nomEstadi = nomEstadi;
	}

	public ArrayList<Jugador> getJugadors() {
		return jugadors;
	}

	public void afegirNouJugador(Jugador jugador) {
		jugadors.add(jugador);
	}

	public String toString() {
		return "nom Equip: " + nomEquip + ", Ciutat=" + ciutat + ", Nom Estadi: " + nomEstadi + "\nJugadors: "
				+ jugadors + ".";
	}

}
