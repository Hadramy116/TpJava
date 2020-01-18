package RimBoite.prob.gestionmagasin;

public class ProduitFruit extends Produit implements Critere {

	private String saison;
	private double quantite;

	public ProduitFruit() {
		super();
	}

	public ProduitFruit(int id, String libelle, String marque, Double prix, String saison, Double quantite) {
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

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(Double quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "ProduitFruit [saison=" + saison + ", quantite=" + quantite + ", id=" + id + ", libelle=" + libelle
				+ ", marque=" + marque + ", prix=" + prix + "]";
	}

	@Override
	public boolean estFrais(String saison) {
		return getSaison() == saison;
	}


}
