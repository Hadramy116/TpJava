package RimBoite.prob.gestionmagasin;

public class ProduitLegume extends Produit implements Critere {

	private String saison;
	private double quantite;

	public ProduitLegume() {
		super();
	}

	public ProduitLegume(int id, String libelle, String marque, Double prix, String saison, Double quantite) {
		super(id, libelle, marque, prix);
		setSaison(saison);
		setQuantite(quantite);

	}

	public String getSaison() {
		return saison;
	}

	public void setSaison(String saison) {
		this.saison = saison;
	}

	public Double getQuantite() {
		return quantite;
	}

	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "ProduitLegume [saison=" + saison + ", quantite=" + quantite + ", id=" + id + ", libelle=" + libelle
				+ ", marque=" + marque + ", prix=" + prix + "]";
	}

	@Override
	public boolean estFrais(String saison) {
		if (this.saison == saison) {
			return true;
		}
		String mois[] = { "Janvier", "Fevrier", "Mars", "Avril", "Mais", "Juin", "Juillet", "Aout", "September",
				"October", "November", "December" };

		int i = 0;
		if (this.saison.equals(mois[i]) && this.saison.equals(mois[11])) {
			return true;
		}

		while (i < 12) {
			if (this.saison.equals(mois[i]) && saison.equals(mois[i + 1])) {
				return true;
			}
			i++;
		}

		return false;
	}

}
