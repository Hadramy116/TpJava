package RimBoite.gestionMagazin.data;

import RimBoite.prob.gestionmagasin.Produit;

public class Element {

	public Produit item;
	public Element suivant;

	public Element(Produit valeur, Element suivant) {
		item = valeur;

		this.suivant = suivant;
	}

}
