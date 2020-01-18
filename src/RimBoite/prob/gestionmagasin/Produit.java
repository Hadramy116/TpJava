package RimBoite.prob.gestionmagasin;

import java.util.Date;

public class Produit {

	protected int id;
	protected String libelle;
	protected String marque;
	protected Double prix;
	protected Date date;

	public Produit() {

	}

	public Produit(int id, String libelle, String marque, Double prix) {
		setId(id);
		setLibelle(libelle);
		setMarque(marque);
		setPrix(prix);
	}


	public Produit(int i, String string, String string2) {
		setId(i);
		setLibelle(string);
		setMarque(string2);
	}

	public boolean comparer(Produit prod) {
		return id == prod.getId() && libelle == prod.getLibelle() && prix == prod.getPrix() ? true : false;
	}

	public boolean compare(Produit prod1, Produit prod2) {
		return prod1.getId() == prod2.getId() && prod1.getLibelle() == prod2.getLibelle()
				&& prod1.getPrix() == prod2.getPrix() ? true : false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		if (prix >= 0) {
			this.prix = prix;
		}

	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String determinerTypeProduit() {
		return this instanceof ProduitFruit ? "Fruit" : "Légumes";
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + "]";
	}

}
