package RimBoite.prob.gestionmagasin;

import java.util.LinkedList;

import RimBoite.gestion.employes.Employer;
import RimBoite.gestionMagazin.data.ListeChainee;

public class Magazin {

	private int id;
	private String adresse;
	private int capacite;
	private ListeChainee produits;
	private LinkedList<Employer> employes;

	public Magazin() {
		super();
	}

	public Magazin(int id, String adresse, int capacite, ListeChainee produits) {
		this.id = id;
		this.adresse = adresse;
		this.capacite = capacite;
		this.produits = produits;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public ListeChainee getProduits() {
		return produits;
	}

	public void setProduits(ListeChainee produits) {
		this.produits = produits;
	}

	public LinkedList<Employer> getEmployes() {
		return employes;
	}

	public void setEmployes(LinkedList<Employer> employes) {
		this.employes = employes;
	}

	public float calculStock() {
		return (float) getProduits().getFruitStock();
	}

	@Override
	public String toString() {
		return "Magazin [id=" + getId() + ", adresse=" + getAdresse() + ", capacite=" + getCapacite() + "]";
	}

}
