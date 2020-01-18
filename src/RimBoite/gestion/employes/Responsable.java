package RimBoite.gestion.employes;

public class Responsable extends Employer {

	private int prime;

	public Responsable(int id, String nom, String adresse, int nbrHeurs, int prime) {
		super(id, nom, adresse, nbrHeurs);
		this.prime = prime;
	}

	public double calculeSalaire() {
		double salaire;
		salaire = nbrHeurs * 10 + prime;
		if (nbrHeurs > 160) {
			salaire += salaire * 20 / 100;
		}

		return salaire;
	}

	public int getPrime() {
		return prime;
	}



	public void setPrime(int prime) {
		this.prime = prime;
	}

	@Override
	public String toString() {
		return "Responsable [prime=" + prime + ", id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nbrHeurs="
				+ nbrHeurs + "]";
	}

}
