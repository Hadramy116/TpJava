package RimBoite.gestion.employes;

public class Caissier extends Employer {

	private int numeroDeCaise;

	public Caissier(int id, String nom, String adresse, int nbrHeurs, int numeroDeCaise) {
		super(id, nom, adresse, nbrHeurs);
		this.numeroDeCaise = numeroDeCaise;
	}

	public double calculeSalaire() {
		double salaire;
		salaire = nbrHeurs * 5;
		if (nbrHeurs > 160) {
			salaire += salaire * 15 / 100;
		}

		return salaire;
	}

	public int getNumeroDeCaise() {
		return numeroDeCaise;
	}

	public void setNumeroDeCaise(int numeroDeCaise) {
		this.numeroDeCaise = numeroDeCaise;
	}

	@Override
	public String toString() {
		return "Caissier [numeroDeCaise=" + numeroDeCaise + ", id=" + id + ", nom=" + nom + ", adresse=" + adresse
				+ ", nbrHeurs=" + nbrHeurs + "]";
	}

}
