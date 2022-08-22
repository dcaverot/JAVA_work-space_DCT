package m8_exercici61.herencia;

public class Pilot extends Treballador {
	private float alçada;
	private float pes;
	private final int plusPerillositat = 50000;

	public Pilot(String nom, String cognom, int edat, int antiguitat, float alçada, float pes) {
		super(nom, cognom, edat, antiguitat);
		this.alçada = alçada;
		this.pes = pes;
	}

	public float getalçada() {
		return alçada;
	}

	public void setalçada(float alçada) {
		this.alçada = alçada;
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
				+ super.antiguitat + "anys, Alçada: " + alçada + "m, Pes: " + pes + "Kg.";
	}

}
