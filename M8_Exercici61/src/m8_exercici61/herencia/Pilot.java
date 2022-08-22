package m8_exercici61.herencia;

public class Pilot extends Treballador {
	private float al�ada;
	private float pes;
	private final int plusPerillositat = 50000;

	public Pilot(String nom, String cognom, int edat, int antiguitat, float al�ada, float pes) {
		super(nom, cognom, edat, antiguitat);
		this.al�ada = al�ada;
		this.pes = pes;
	}

	public float getal�ada() {
		return al�ada;
	}

	public void setal�ada(float al�ada) {
		this.al�ada = al�ada;
	}

	public float getPes() {
		return pes;
	}

	public void setPes(float pes) {
		this.pes = pes;
	}

	public int calcularSou() {
		int sou = super.souBase + super.extraSouAntiguitat * antiguitat + plusPerillositat;
		return sou;
	}

	@Override
	public String toString() {
		return "Pilot Nom: " + super.nom + ", Cognom: " + super.cognom + ", Edat: " + super.edat + "anys, Antiguitat: "
				+ super.antiguitat + "anys, Al�ada: " + al�ada + "m, Pes: " + pes + "Kg.";
	}

}
