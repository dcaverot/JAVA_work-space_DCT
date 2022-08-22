package m8_exercici61;

import java.util.ArrayList;

import m8_exercici61.herencia.Treballador;

public class Escuderia {
	private String nom;
	private int pressupost;
	private String paisOrigen;
	private ArrayList<Cotxe> cotxes;
	private ArrayList<Treballador> treballadors;
	
	
	public Escuderia(String nom, int pressupost, String paisOrigen) {
		this.nom = nom;
		this.pressupost = pressupost;
		this.paisOrigen = paisOrigen;
		this.cotxes = new ArrayList<Cotxe>();
		this.treballadors = new ArrayList<Treballador>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPressupost() {
		return pressupost;
	}

	public void setPressupost(int pressupost) {
		this.pressupost = pressupost;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public ArrayList<Cotxe> getCotxes() {
		return cotxes;
	}

	public void afegirNouCotxe(Cotxe cotxe) {
		cotxes.add(cotxe);
	}

	public ArrayList<Treballador> getTreballadors() {
		return treballadors;
	}

	public void afegirNouTreballador(Treballador treballador) {
		treballadors.add(treballador);
	}

	@Override
	public String toString() {
		return "Escuderia " + nom + ", Pressupost: " + pressupost + " EUR, Pais d'Origen: " + paisOrigen + "\nCotxes: "
				+ cotxes + ", \nTreballadors: " + treballadors + ".";
	}
	
	

}
