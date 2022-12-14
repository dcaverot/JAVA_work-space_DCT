package m8_exercici61.herencia;

public class Mecānic extends Treballador {
	private boolean estudisSuperiorsMecānica = false;

	public Mecānic(String nom, String cognom, int edat, int antiguitat, boolean estudisSuperiorsMecānica) {
		super(nom, cognom, edat, antiguitat);
		this.estudisSuperiorsMecānica = estudisSuperiorsMecānica;
	}

	public boolean getEstudisSuperiorsMecānica() {
		return estudisSuperiorsMecānica;
	}

	public void setEstudisSuperiorsMecānica(boolean estudisSuperiorsMecānica) {
		this.estudisSuperiorsMecānica = estudisSuperiorsMecānica;
	}

	public int calcularSou() {
		int sou = super.souBase + super.extraSouAntiguitat * antiguitat;
		return sou;
	}

	@Override
	public String toString() {
		return "Mecānic Nom: " + super.nom + ", Cognom: " + super.cognom + ", Edat: " + super.edat + "anys, Antiguitat: "
				+ super.antiguitat + "anys, Estudis Superiors de Mecānica: " + this.estudisSuperiorsMecānica + ".";
	}

}
