package m8_exercici61.herencia;

public class Mec�nic extends Treballador {
	private boolean estudisSuperiorsMec�nica = false;

	public Mec�nic(String nom, String cognom, int edat, int antiguitat, boolean estudisSuperiorsMec�nica) {
		super(nom, cognom, edat, antiguitat);
		this.estudisSuperiorsMec�nica = estudisSuperiorsMec�nica;
	}

	public boolean getEstudisSuperiorsMec�nica() {
		return estudisSuperiorsMec�nica;
	}

	public void setEstudisSuperiorsMec�nica(boolean estudisSuperiorsMec�nica) {
		this.estudisSuperiorsMec�nica = estudisSuperiorsMec�nica;
	}

	public int calcularSou() {
		int sou = super.souBase + super.extraSouAntiguitat * antiguitat;
		return sou;
	}

	@Override
	public String toString() {
		return "Mec�nic Nom: " + super.nom + ", Cognom: " + super.cognom + ", Edat: " + super.edat + "anys, Antiguitat: "
				+ super.antiguitat + "anys, Estudis Superiors de Mec�nica: " + this.estudisSuperiorsMec�nica + ".";
	}

}
