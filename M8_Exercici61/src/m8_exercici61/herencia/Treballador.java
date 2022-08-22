package m8_exercici61.herencia;

public abstract class Treballador {
	protected String nom;
	protected String cognom;
	protected int edat;
	protected int antiguitat;
	protected final int souBase = 50000;
	protected final int extraSouAntiguitat = 10000;

	public Treballador(String nom, String cognom, int edat, int antiguitat) {
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
		this.antiguitat = antiguitat;
		}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public int getAntiguitat() {
		return antiguitat;
	}

	public void setAntiguitat(int antiguitat) {
		this.antiguitat = antiguitat;
	}

	public int getSouBase() {
		return souBase;
	}

	public int getExtraSouAntiguitat() {
		return extraSouAntiguitat;
	}

	public abstract int calcularSou();

	/*
	 * @Override
	 * public String toString() {
	 *	return "Treballador Nom: " + nom + ", Cognom: " + cognom + ", Edat: " + edat + " anys, Antiguitat: " + antiguitat
	 *			+ " anys, Sou Base: " + souBase + " EUR, Extra Sou per any d'Antiguitat: " + extraSouAntiguitat + " EUR.";
	 */
	
}
	
