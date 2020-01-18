package RimBoite.gestionMagazin.data;

import RimBoite.prob.gestionmagasin.Produit;
import RimBoite.prob.gestionmagasin.ProduitFruit;
import RimBoite.prob.gestionmagasin.ProduitLegume;

public class ListeChainee {

	Element tete;

	public ListeChainee() {
		tete = null;
	}

	public void add(Produit item) {
		if (nbElement() >= 49) {
			System.out.println("Magazin est remplie !");
			return;
		}

		if (chercher(item) == 1) {
			System.out.println("Cet produit exit deja !?");
			return;
		}

		Element nElmt = new Element(item, null);

		if (tete == null) {
			tete = nElmt;
		} else{
			nElmt.suivant = tete;
			tete = nElmt;
		}
	}

	public void remove(Produit item) {
		Element currentElement = tete;
		Element previousElement = null;
		while (currentElement != null) {
			if (item.equals(currentElement.item)) {
				if (previousElement == null) {
					tete = currentElement.suivant;
				} else {
					previousElement.suivant = currentElement.suivant;
				}

			} else {
				previousElement = currentElement;
			}
			currentElement = currentElement.suivant;
		}

		System.out.println("Un article a ete suprimer");
	}

	public int chercher(Produit p) {
		Element elt = tete;
		while (elt != null) {
			if (elt.item.comparer(p)) {
				return 1;
			}
			elt = elt.suivant;
		}
		return 0;
	}

	public int nbElement() {
		int count = 0;

		Element elt = tete;
		while (elt != null) {
			count++;
			elt = elt.suivant;
		}
		return count;
	}

	public void display() {
		Element elt = tete;
		while (elt != null) {
			if (elt.item instanceof ProduitFruit){

				ProduitFruit pf = (ProduitFruit) elt.item;
				System.out.println(pf.toString());
				System.out.println("est frais : " + (pf.estFrais("Juin") ? "oui" : "non"));
			}

			if (elt.item instanceof ProduitLegume) {
				ProduitLegume pf = (ProduitLegume) elt.item;
				System.out.println(pf.toString());
				System.out.println("Type : " + pf.determinerTypeProduit());
				System.out.println(pf.estFrais("Juin") ? "oui" : "non");
			} else {
				System.out.println(elt.item.toString());
			}

			elt = elt.suivant;
		}
	}

	public double getFruitStock() {
		double stock = 0.0;
		Element elt = tete;
		while (elt != null) {
			if (elt.item instanceof ProduitFruit) {
				ProduitFruit pf = (ProduitFruit) elt.item;
				stock += pf.getQuantite();
			}
			elt = elt.suivant;
		}

		return stock;
	}
}