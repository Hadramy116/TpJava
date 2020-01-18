package RimBoite.gestion.employes;

public class Vendeur extends Employer {

	private double tauxVente;

	public Vendeur(int id, String nom, String adresse, int nbrHeurs, double tauxVente) {
		super(id, nom, adresse, nbrHeurs);
		this.tauxVente = tauxVente;
	}

	public double calculeSalaire() {
		return 450 * tauxVente;
	}

	public double getTauxVente() {
		return tauxVente;
	}

	public void setTauxVente(double tauxVente) {
		this.tauxVente = tauxVente;
	}

	@Override
	public String toString() {
		return "Vendeur [tauxVente=" + tauxVente + ", id=" + id + ", nom=" + nom + ", adresse=" + adresse
				+ ", nbrHeurs=" + nbrHeurs + "]";
	}

}
