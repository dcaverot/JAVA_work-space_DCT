package m8_exercici5;

public class Cercle {
	private Punt centre;
	private int radi;

	public Cercle(Punt centre, int radi) {
		this.centre = centre;
		this.radi = radi;
	}

	public Punt getCentre() {
		return centre;
	}

	public void setCentre(Punt centre) {
		this.centre = centre;
	}

	public int getRadi() {
		return radi;
	}

	public void setRadi(int radi) {
		this.radi = radi;
	}

	public double distanciaCentres(Cercle cercle) {
		double distancia;
		distancia = Math.sqrt(Math.pow(this.centre.getPosicioX() - cercle.getCentre().getPosicioX(), 2)
				+ Math.pow(this.centre.getPosicioY() - cercle.getCentre().getPosicioY(), 2));
		return distancia;
	}

	public boolean equals(Cercle cercle) {
		boolean iguals = false;

		if (this.centre.getPosicioX() == cercle.getCentre().getPosicioX()
				&& this.centre.getPosicioY() == cercle.getCentre().getPosicioY() && this.radi == cercle.getRadi())
			iguals = true;
		return iguals;
	}

	public boolean sonConcentrics(Cercle cercle) {
		boolean concentrics = false;

		if (this.centre.getPosicioX() == cercle.getCentre().getPosicioX()
				&& this.centre.getPosicioY() == cercle.getCentre().getPosicioY())
			concentrics = true;
		return concentrics;
	}

	public boolean tenenIgualRadi(Cercle cercle) {
		boolean tenenIgualRadi = false;

		if (this.radi == cercle.getRadi())
			tenenIgualRadi = true;
		return tenenIgualRadi;
	}

	public boolean sonTangentsExterns(Cercle cercle) {
		// Dos círculos son mutua y externamente tangentes si la distancia entre sus
		// centros es igual a la suma de sus radios.

		boolean sonTangentExterns = false;

		if (this.distanciaCentres(cercle) == (this.radi + cercle.getRadi()))
			sonTangentExterns = true;
		return sonTangentExterns;
	}

	public boolean sonTangentsInterns(Cercle cercle) {
		// Dos círculos son mutua e internamente tangentes si la distancia entre sus
		// centros es igual a la diferencia de sus radios.

		boolean sonTangentExterns = false;

		if (this.distanciaCentres(cercle) == (Math.abs(this.radi - cercle.getRadi())))
			sonTangentExterns = true;
		return sonTangentExterns;
	}

	public boolean sonSecants(Cercle cercle) {
		// Las circunferencias tienen dos puntos en común.
		// La distancia entre los centros es mayor que la diferencia de los radios.

		boolean sonSecants = false;

		if (this.distanciaCentres(cercle) > (this.radi - cercle.getRadi()))
			sonSecants = true;
		return sonSecants;
	}

	public boolean noEsToquen(Cercle cercle) {
		boolean noEsToquen = false;

		if (this.distanciaCentres(cercle) > (this.radi + cercle.getRadi()))
			noEsToquen = true;
		return noEsToquen;
	}

	
	@Override
	public String toString() {
		return "centre = " + centre + ", radi = " + radi + ".";
	}

}
