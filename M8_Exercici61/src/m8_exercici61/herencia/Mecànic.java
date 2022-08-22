package m8_exercici61.herencia;

public class Mecànic extends Treballador {
	private boolean estudisSuperiorsMecànica = false;

	public Mecànic(String nom, String cognom, int edat, int antiguitat, boolean estudisSuperiorsMecànica) {
		super(nom, cognom, edat, antiguitat);
		this.estudisSuperiorsMecànica = estudisSuperiorsMecànica;
	}

	public boolean getEstudisSuperiorsMecànica() {
		return estudisSuperiorsMecànica;
	}

	public void setEstudisSuperiorsMecànica(boolean estudisSuperiorsMecànica) {
		this.estudisSuperiorsMecànica = estudisSuperiorsMecànica;
	}

	public int calcularSou() {
		int sou = super.souBase + super.extraSouAntiguitat * antiguitat;
		return sou;
	}

	@Override
	public String toString() {
		return "Mecànic Nom: " + super.nom + ", Cognom: " + super.cognom + ", Edat: " + super.edat + "anys, Antiguitat: "
				+ super.antiguitat + "anys, Estudis Superiors de Mecànica: " + this.estudisSuperiorsMecànica + ".";
	}

}
